package Reto3_Domingo.Reto3_Domingo.Controlador;

import Reto3_Domingo.Reto3_Domingo.Modelo.Machine;
import Reto3_Domingo.Reto3_Domingo.Servicio.ServiciosMachine;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Gymmachin")
@CrossOrigin(origins = "+", methods = {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST,RequestMethod.PUT})
public class ControladorMachine {
    @GetMapping("/holaMundo")
    public String saludar(){
        return "Hola Mundo soy yo";
    }
    @Autowired
    private ServiciosMachine servicios;
    
    @GetMapping("/all")
    public List<Machine> getMachine(){
        return servicios.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Machine> getMachine(@PathVariable("id") int idMachine) {
        return servicios.getMachine(idMachine);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Machine save(@RequestBody Machine machine){
        return servicios.save(machine);
    }
    
    
}
