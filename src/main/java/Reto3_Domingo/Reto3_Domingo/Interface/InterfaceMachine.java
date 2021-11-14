package Reto3_Domingo.Reto3_Domingo.Interface;

import Reto3_Domingo.Reto3_Domingo.Modelo.Machine;
import org.springframework.data.repository.CrudRepository;


public interface InterfaceMachine extends CrudRepository<Machine, Integer> {
    
}
