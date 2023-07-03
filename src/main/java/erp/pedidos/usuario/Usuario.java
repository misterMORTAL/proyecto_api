package erp.pedidos.usuario;


import java.util.Date;

import erp.pedidos.almacen.Almacen;
import erp.pedidos.roles.Roles;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public class Usuario {
    //Delimitador de acceso, tipo de dato, nombre del atributo, cierre con punto y como;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String correoElectronico;
    private String contrasena;
    private String direccion;
    private Date fechaNacimiento;
    @ManyToOne
    private Roles IdRoles;

    @ManyToOne
    private Almacen idAlmacen;
} 

