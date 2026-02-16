package acceso.myshop.models;

import org.springframework.stereotype.Service;
import acceso.myshop.models.*;
@Service
public class UsuarioService {

    public Usuario crearUsuario() {
        // Crear un usuario de ejemplo
        Usuario u = new Usuario();
        u.setId(1L);
        u.setNombre("Juan");
        return u;
    }
}