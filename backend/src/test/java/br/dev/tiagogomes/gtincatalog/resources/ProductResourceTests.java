package br.dev.tiagogomes.gtincatalog.resources;

import br.dev.tiagogomes.gtincatalog.dto.ProductDTO;
import br.dev.tiagogomes.gtincatalog.services.ProductService;
import br.dev.tiagogomes.gtincatalog.services.exceptions.DatabaseException;
import br.dev.tiagogomes.gtincatalog.services.exceptions.ResourceNotFoundException;
import br.dev.tiagogomes.gtincatalog.tests.Factory;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductResource.class)
public class ProductResourceTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ProductService productService;

	@Autowired
	private ObjectMapper objectMapper;

	private long existingId;
	private long nonExistingId;
	private long dependentId;
	private ProductDTO productDTO;
	private PageImpl<ProductDTO> page;

	@BeforeEach
	void setUp() throws Exception {
		existingId = 1L;
		nonExistingId = 2L;
		dependentId = 3L;
		productDTO = Factory.createProductDTO();
		page = new PageImpl<>(List.of(productDTO));
		when(productService.findAllPaged(any())).thenReturn(page);

		when(productService.findById(existingId)).thenReturn(productDTO);
		when(productService.findById(nonExistingId)).thenThrow(ResourceNotFoundException.class);

		when(productService.insert(any())).thenReturn(productDTO);

		when(productService.update(eq(existingId), any())).thenReturn(productDTO);
		when(productService.update(eq(nonExistingId), any())).thenThrow(ResourceNotFoundException.class);

		doNothing().when(productService).delete(existingId);
		doThrow(ResourceNotFoundException.class).when(productService).delete(nonExistingId);
		doThrow(DatabaseException.class).when(productService).delete(dependentId);
	}

	@Test
	public void deleteShouldReturnNoContentWhenIdExists() throws Exception {
		ResultActions result = mockMvc.perform(delete("/products/{id}", existingId)
				.accept(MediaType.APPLICATION_JSON));
		result.andExpect(status().isNoContent());
	}

	@Test
	public void deleteShouldReturnNotFoundWhenIdDoesNotExist() throws Exception {
		ResultActions result = mockMvc.perform(delete("/products/{id}", nonExistingId)
				.accept(MediaType.APPLICATION_JSON));
		result.andExpect(status().isNotFound());
	}

	@Test
	public void insertShouldReturnProductDTOCreated() throws Exception {
		String jsonBody = objectMapper.writeValueAsString(productDTO);
		ResultActions result = mockMvc.perform(post("/products")
				.content(jsonBody)
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON));
		result.andExpect(status().isCreated());
		result.andExpect(jsonPath("$.id").exists());
		result.andExpect(jsonPath("$.reference").exists());
		result.andExpect(jsonPath("$.name").exists());
	}

	@Test
	public void updateShouldReturnProductDTOWhenIdExists() throws Exception {
		String jsonBody = objectMapper.writeValueAsString(productDTO);
		ResultActions result = mockMvc.perform(put("/products/{id}", existingId)
				.content(jsonBody)
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON));
		result.andExpect(status().isOk());
		result.andExpect(jsonPath("$.id").exists());
		result.andExpect(jsonPath("$.reference").exists());
		result.andExpect(jsonPath("$.name").exists());
	}

	@Test
	public void updateShouldReturnNotFoundWhenIdDoesNotExist() throws Exception {
		String jsonBody = objectMapper.writeValueAsString(productDTO);
		ResultActions result = mockMvc.perform(put("/products/{id}", nonExistingId)
				.content(jsonBody)
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON));
		result.andExpect(status().isNotFound());
	}

	@Test
	public void findAllShouldReturnPage() throws Exception {
		ResultActions result = mockMvc.perform(get("/products").accept(MediaType.APPLICATION_JSON));
		result.andExpect(status().isOk());
	}

	@Test
	public void findByIdShouldReturnProductWhenIdExists() throws Exception {
		ResultActions result = mockMvc.perform(get("/products/{id}", existingId).accept(MediaType.APPLICATION_JSON));
		result.andExpect(status().isOk());
		result.andExpect(jsonPath("$.id").exists());
		result.andExpect(jsonPath("$.reference").exists());
		result.andExpect(jsonPath("$.name").exists());
	}

	@Test
	public void findByIdShouldReturnNotFoundWhenIdDoesNotExist() throws Exception {
		ResultActions result = mockMvc.perform(get("/products/{id}", nonExistingId).accept(MediaType.APPLICATION_JSON));
		result.andExpect(status().isNotFound());
	}


}
