package erp.pedidos.producto;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
    List<Producto> findAll();

    @Query("SELECT p.nombre,p.cantidad, p.descripcion, p.precio, p.stock, c.nombre " +
            "FROM Producto p JOIN p.idCategoria c")
    List<Object[]> findAllProductosWithCategoria();
}
