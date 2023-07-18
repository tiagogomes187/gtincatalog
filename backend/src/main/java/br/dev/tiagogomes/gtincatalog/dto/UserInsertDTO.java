package br.dev.tiagogomes.gtincatalog.dto;

import br.dev.tiagogomes.gtincatalog.services.validation.UserInsertValid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.io.Serial;

@UserInsertValid
public class UserInsertDTO extends UserDTO {
	@Serial
	private static final long serialVersionUID = 1L;

	@NotBlank(message = "Campo obrigatório")
	@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", message = "Senha deve conter uma letra e um número")
	@Size(min = 8, message = "Deve ter no mínimo 8 caracteres")
	private String password;

	UserInsertDTO() {
		super();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
