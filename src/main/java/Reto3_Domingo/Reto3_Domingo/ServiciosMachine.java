package Reto3_Domingo.Reto3_Domingo;

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
    
    public Optional<Machine> getGym(int idGym){
        return metodosCrud.getGym(idGym);
    }
    
    public Machine save(Machine gym){
        if(gym.getIdMachine()==null){
            return metodosCrud.save(gym);
        
        }else{
            Optional<Machine> evt=metodosCrud.getGym(gym.getIdMachine());
            if(evt.isEmpty()){
                return metodosCrud.save(gym);            
            
            }else{
                return gym;
            }
        
        }
    }
    
    
}
