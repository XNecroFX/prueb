
package Reto3_Domingo.Reto3_Domingo.Repositorio;

import Reto3_Domingo.Reto3_Domingo.Interface.InterfaceCategoria;
import Reto3_Domingo.Reto3_Domingo.Modelo.Categoria;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioCategoria {
    @Autowired
    private InterfaceCategoria crud;
    
    public List<Categoria> getAll(){
        return (List<Categoria>) crud.findAll();
    }
    public Optional <Categoria> getCategoria(int id){
        return crud.findById(id);
    }
    public Categoria save(Categoria categoria){
        return crud.save(categoria);
    }
    
    
}
