
package Reto3_Domingo.Reto3_Domingo.Repositorio;

import Reto3_Domingo.Reto3_Domingo.Interface.InterfaceMensaje;
import Reto3_Domingo.Reto3_Domingo.Modelo.Mensaje;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioMensaje {
   @Autowired
    private InterfaceMensaje crud;
    
    public List<Mensaje> getAll(){
        return (List<Mensaje>) crud.findAll();
    }
    public Optional <Mensaje> getMensaje(int id){
        return crud.findById(id);
    }
    public Mensaje save(Mensaje mensaje){
        return crud.save(mensaje);
    } 
}
