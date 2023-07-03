package erp.pedidos.usuario;

import lombok.Data;

@Data
public class UsuarioCredentials {
    private String correoElectronico;
    private String contrasena;
}