
package Reto3_Domingo.Reto3_Domingo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosCategoria {
    @Autowired
    private RepositorioCategoria metodosCrud;
    
    public List<Categoria> getAll(){
        return metodosCrud.getAll();
        
    }
    
    public Optional<Categoria> getCategoria(int idCategoria){
        return metodosCrud.getCategoria(idCategoria);
    }
    
    public Categoria save(Categoria categoria){
        if(categoria.getIdCategoria()==null){
            return metodosCrud.save(categoria);
        
        }else{
            Optional<Categoria> evt=metodosCrud.getCategoria(categoria.getIdCategoria());
            if(evt.isEmpty()){
                return metodosCrud.save(categoria);            
            
            }else{
                return categoria;
            }
        
        }
    }
}
