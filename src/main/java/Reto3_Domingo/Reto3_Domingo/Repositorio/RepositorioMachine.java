package Reto3_Domingo.Reto3_Domingo.Repositorio;

import Reto3_Domingo.Reto3_Domingo.Interface.InterfaceMachine;
import Reto3_Domingo.Reto3_Domingo.Modelo.Machine;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioMachine {
    @Autowired
    private InterfaceMachine crud;
    
    public List<Machine> getAll(){
        return (List<Machine>) crud.findAll();
    }
    public Optional <Machine> getMachine(int id){
        return crud.findById(id);
    }
    public Machine save(Machine machine){
        return crud.save(machine);
    }
}
