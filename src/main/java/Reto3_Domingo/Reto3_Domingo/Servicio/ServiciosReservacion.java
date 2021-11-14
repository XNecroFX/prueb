
package Reto3_Domingo.Reto3_Domingo.Servicio;

import Reto3_Domingo.Reto3_Domingo.Modelo.Reservacion;
import Reto3_Domingo.Reto3_Domingo.Repositorio.RepositorioReservacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosReservacion {
    @Autowired
    private RepositorioReservacion metodosCrud;
    
    public List<Reservacion> getAll(){
        return metodosCrud.getAll();
        
    }
    
    public Optional<Reservacion> getReservacion(int idReservacion){
        return metodosCrud.getReservacion(idReservacion);
    }
    
    public Reservacion save(Reservacion reservacion){
        if(reservacion.getIdReservation()==null){
            return metodosCrud.save(reservacion);
        
        }else{
            Optional<Reservacion> evt=metodosCrud.getReservacion(reservacion.getIdReservation());
            if(evt.isEmpty()){
                return metodosCrud.save(reservacion);            
            
            }else{
                return reservacion;
            }
        
        }
    }
}
