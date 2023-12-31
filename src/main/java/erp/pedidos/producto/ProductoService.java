package erp.pedidos.producto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    
    @Autowired
    ProductoRepository repository;

    public Producto save(Producto entity){
        return repository.save(entity);
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Producto findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Producto> findAll(){
        return repository.findAll();
    }

    public List<Object[]> findAllProductosWithCategoria() {
        return repository.findAllProductosWithCategoria();
    }
}
