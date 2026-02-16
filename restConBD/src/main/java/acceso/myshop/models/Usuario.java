package acceso.myshop.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data               // Genera getters, setters, toString, equals y hashCode
@NoArgsConstructor  // Constructor sin parámetros
@AllArgsConstructor // Constructor con todos los parámetros
public class Usuario {
    private Long id;
    private String nombre;
}