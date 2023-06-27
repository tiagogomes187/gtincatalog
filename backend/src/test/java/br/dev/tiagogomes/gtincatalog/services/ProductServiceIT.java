package br.dev.tiagogomes.gtincatalog.services;

import br.dev.tiagogomes.gtincatalog.dto.ProductDTO;
import br.dev.tiagogomes.gtincatalog.repositories.ProductRepository;
import br.dev.tiagogomes.gtincatalog.services.exceptions.ResourceNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class ProductServiceIT {

	@Autowired
	private ProductService productService;

	@Autowired
	private ProductRepository productRepository;

	private long existingId;
	private long nonExistingId;
	private long countTotalProducts;

	@BeforeEach
	void setUp() throws Exception {
		existingId = 1L;
		nonExistingId = 1000L;
		countTotalProducts = 25L;
	}

	@Test
	public void deleteShouldDeleteResourceWhenIdExists() {
		productService.delete(existingId);
		Assertions.assertEquals(countTotalProducts - 1, productRepository.count());
	}

	@Test
	public void deleteShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
		Assertions.assertThrows(ResourceNotFoundException.class, () -> {
			productService.delete(nonExistingId);
		});
	}

	@Test
	public void findAllPagedShouldReturnPageWhenPage0Size10(){
		PageRequest pageRequest = PageRequest.of(0, 10);
		Page<ProductDTO> result = productService.findAllPaged(pageRequest);
		Assertions.assertFalse(result.isEmpty());
		Assertions.assertEquals(0, result.getNumber());
		Assertions.assertEquals(10, result.getSize());
		Assertions.assertEquals(countTotalProducts, result.getTotalElements());
	}

	@Test
	public void findAllPagedShouldReturnEmptyPageWhenDoesNotExist(){
		PageRequest pageRequest = PageRequest.of(50, 10);
		Page<ProductDTO> result = productService.findAllPaged(pageRequest);
		Assertions.assertTrue(result.isEmpty());
	}

	@Test
	public void findAllPagedShouldReturnSortedPageWhenSortByName(){
		PageRequest pageRequest = PageRequest.of(0, 10, Sort.by("name"));
		Page<ProductDTO> result = productService.findAllPaged(pageRequest);
		Assertions.assertFalse(result.isEmpty());
		Assertions.assertEquals("Abirkenmiss Fivelas", result.getContent().get(0).getName());
		Assertions.assertEquals("Bamanco Infantil Acrílico", result.getContent().get(1).getName());
		Assertions.assertEquals("Birkenmiss Fivelas", result.getContent().get(2).getName());
	}



}
