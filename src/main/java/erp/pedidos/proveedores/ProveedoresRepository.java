package erp.pedidos.proveedores;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProveedoresRepository extends CrudRepository <Proveedores, Long> {
    List<Proveedores> findAll();
}