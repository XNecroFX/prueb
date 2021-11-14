
package Reto3_Domingo.Reto3_Domingo.Servicio;

import Reto3_Domingo.Reto3_Domingo.Modelo.Mensaje;
import Reto3_Domingo.Reto3_Domingo.Repositorio.RepositorioMensaje;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosMensaje {
    @Autowired
    private RepositorioMensaje metodosCrud;
    
    public List<Mensaje> getAll(){
        return metodosCrud.getAll();
        
    }
    
    public Optional<Mensaje> getMensaje(int idMensaje){
        return metodosCrud.getMensaje(idMensaje);
    }
    
    public Mensaje save(Mensaje mensaje){
        if(mensaje.getIdMessage()==null){
            return metodosCrud.save(mensaje);
        
        }else{
            Optional<Mensaje> evt=metodosCrud.getMensaje(mensaje.getIdMessage());
            if(evt.isEmpty()){
                return metodosCrud.save(mensaje);            
            
            }else{
                return mensaje;
            }
        
        }
    }
}
