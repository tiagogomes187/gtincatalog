package br.dev.tiagogomes.gtincatalog.resources;

import br.dev.tiagogomes.gtincatalog.dto.UserDTO;
import br.dev.tiagogomes.gtincatalog.dto.UserInsertDTO;
import br.dev.tiagogomes.gtincatalog.dto.UserUpdateDTO;
import br.dev.tiagogomes.gtincatalog.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService UserService;

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping
	public ResponseEntity<Page<UserDTO>> findAll(Pageable pageable) {
		Page<UserDTO> list = UserService.findAllPaged(pageable);
		return ResponseEntity.ok().body(list);
	}

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
		UserDTO dto = UserService.findById(id);
		return ResponseEntity.ok().body(dto);
	}

	@PostMapping
	public ResponseEntity<UserDTO> insert(@Valid @RequestBody UserInsertDTO dto) {
		UserDTO newDto = UserService.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(newDto.getId()).toUri();
		return ResponseEntity.created(uri).body(newDto);
	}

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@PutMapping(value = "/{id}")
	public ResponseEntity<UserDTO> update(@PathVariable Long id, @Valid @RequestBody UserUpdateDTO dto) {
		UserDTO newDto = UserService.update(id, dto);
		return ResponseEntity.ok().body(newDto);
	}

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		UserService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
