
package Reto3_Domingo.Reto3_Domingo.Controlador;

import Reto3_Domingo.Reto3_Domingo.Modelo.Cliente;
import Reto3_Domingo.Reto3_Domingo.Servicio.ServiciosCliente;
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
@RequestMapping("/api/Client")
public class ControladorCliente {
    @Autowired
    private ServiciosCliente servicios;
    @GetMapping("/all")
    public List<Cliente> getCliente(){
        return servicios.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Cliente> getCliente (@PathVariable("id") int idCliente) {
        return servicios.getCliente(idCliente);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente save(@RequestBody Cliente cliente){
        return servicios.save(cliente);
    }
}
