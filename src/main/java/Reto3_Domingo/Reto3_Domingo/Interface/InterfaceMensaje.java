
package Reto3_Domingo.Reto3_Domingo.Interface;

import Reto3_Domingo.Reto3_Domingo.Modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;


public interface InterfaceMensaje extends CrudRepository<Mensaje, Integer> {
    
}
