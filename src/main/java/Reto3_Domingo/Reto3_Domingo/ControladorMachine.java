package Reto3_Domingo.Reto3_Domingo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Gymmachin")
public class ControladorMachine {
    @GetMapping("/holaMundo")
    public String saludar(){
        return "Hola Mundo soy yo";
    }
        @Autowired
    private ServiciosMachine servicios;
    @GetMapping("/all")
    public List<Machine> getGym(){
        return servicios.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Machine> getGym (@PathVariable("id") int idGym) {
        return servicios.getGym(idGym);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Machine save(@RequestBody Machine gym){
        return servicios.save(gym);
    }
    
    
}
