package Reto3_Domingo.Reto3_Domingo.Servicio;

import Reto3_Domingo.Reto3_Domingo.Repositorio.RepositorioMachine;
import Reto3_Domingo.Reto3_Domingo.Modelo.Machine;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosMachine {
    @Autowired
    private RepositorioMachine metodosCrud;
    
    public List<Machine> getAll(){
        return metodosCrud.getAll();
        
    }
    
    public Optional<Machine> getMachine(int idMachine){
        return metodosCrud.getMachine(idMachine);
    }
    
    public Machine save(Machine machine){
        if(machine.getIdMachine()==null){
            return metodosCrud.save(machine);
        
        }else{
            Optional<Machine> evt=metodosCrud.getMachine(machine.getIdMachine());
            if(evt.isEmpty()){
                return metodosCrud.save(machine);            
            
            }else{
                return machine;
            }
        
        }
    }
    
    
}
