package gelo.vetclinic.DTO;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class RegisterRequest {
    private String username;
    private String password;
}
