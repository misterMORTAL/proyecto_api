package erp.pedidos.proveedores;


import erp.pedidos.almacen.Almacen;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public class Proveedores {
//Delimitador de acceso, tipo de dato, nombre del atributo, cierre con punto y como;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String nombre;
private String direccion;


    @ManyToOne
    private Almacen idAlmacen;
    
}
