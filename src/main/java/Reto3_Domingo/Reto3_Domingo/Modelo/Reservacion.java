
package Reto3_Domingo.Reto3_Domingo.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reservacion")
public class Reservacion implements Serializable{
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    private Integer idReservation;
    private Integer starDate;
    private String description;
    private Integer devolutionDate;
    private String state;
    
    @ManyToOne
    @JoinColumn(name="id")
    @JsonIgnoreProperties({"machine","category"})
    private Machine  machine; 
    
    @ManyToOne
    @JoinColumn(name="idClient")
    @JsonIgnoreProperties("client")
    private Cliente  client; 

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Integer getStarDate() {
        return starDate;
    }

    public void setStarDate(Integer starDate) {
        this.starDate = starDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Integer devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }
    

    
    
    
}
