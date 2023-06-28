package erp.pedidos.almacen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlmacenService {
    
@Autowired
AlmacenRepository repository;
    //CRUD
    //Delimitador de acceso (public, private) tipo de dato de retorno, nombre del metodo, param,etros de entrada [sentencias]
public Almacen save(Almacen entity){
        return repository.save(entity);
}

public void deleteById(long id){
    repository.deleteById(id);
}

public Almacen findById(long id){
    return repository.findById(id).orElse(null);
}

public List<Almacen> findAll(){
    return repository.findAll();
}
}
