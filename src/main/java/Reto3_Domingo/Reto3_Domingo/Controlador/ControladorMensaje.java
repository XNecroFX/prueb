package Reto3_Domingo.Reto3_Domingo.Controlador;

import Reto3_Domingo.Reto3_Domingo.Modelo.Mensaje;
import Reto3_Domingo.Reto3_Domingo.Servicio.ServiciosMensaje;
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
@RequestMapping("/api/Menssage")
public class ControladorMensaje {
    @Autowired
    private ServiciosMensaje servicios;
    @GetMapping("/all")
    public List<Mensaje> getMensaje(){
        return servicios.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Mensaje> getMensaje (@PathVariable("id") int idMensaje) {
        return servicios.getMensaje(idMensaje);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Mensaje save(@RequestBody Mensaje mensaje){
        return servicios.save(mensaje);
}

}