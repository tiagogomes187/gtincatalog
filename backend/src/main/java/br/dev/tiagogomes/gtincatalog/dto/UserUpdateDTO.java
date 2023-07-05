package br.dev.tiagogomes.gtincatalog.dto;

import br.dev.tiagogomes.gtincatalog.services.validation.UserUpdateValid;

import java.io.Serial;

@UserUpdateValid
public class UserUpdateDTO extends UserDTO {
    @Serial
    private static final long serialVersionUID = 1L;

}
