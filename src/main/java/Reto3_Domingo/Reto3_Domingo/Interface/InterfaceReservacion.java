
package Reto3_Domingo.Reto3_Domingo.Interface;

import Reto3_Domingo.Reto3_Domingo.Modelo.Reservacion;
import org.springframework.data.repository.CrudRepository;


public interface InterfaceReservacion extends CrudRepository<Reservacion, Integer> {
    
}
