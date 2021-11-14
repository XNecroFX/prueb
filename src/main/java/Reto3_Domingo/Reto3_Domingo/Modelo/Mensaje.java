
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
@Table(name = "message")
public class Mensaje implements Serializable{
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    private Integer idMessage;
    private String mesaggeText;
    
    
    @ManyToOne
    @JoinColumn(name="id")
    @JsonIgnoreProperties({"machine","category"})
    private Machine  machine;
    
    
    @ManyToOne
    @JoinColumn(name="idClient")
    @JsonIgnoreProperties("message")
    private Cliente  client; 

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMesaggeText() {
        return mesaggeText;
    }

    public void setMesaggeText(String mesaggeText) {
        this.mesaggeText = mesaggeText;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    

    
}
