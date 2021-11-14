
package Reto3_Domingo.Reto3_Domingo.Repositorio;

import Reto3_Domingo.Reto3_Domingo.Interface.InterfaceReservacion;
import Reto3_Domingo.Reto3_Domingo.Modelo.Reservacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioReservacion {
    @Autowired
    private InterfaceReservacion crud;
    
    public List<Reservacion> getAll(){
        return (List<Reservacion>) crud.findAll();
    }
    public Optional <Reservacion> getReservacion(int id){
        return crud.findById(id);
    }
    public Reservacion save(Reservacion reservacion){
        return crud.save(reservacion);
    }
}
