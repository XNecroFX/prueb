package Reto3_Domingo.Reto3_Domingo.Modelo;

import Reto3_Domingo.Reto3_Domingo.Modelo.Machine;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Categoria implements Serializable{
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    private Integer idCategory;
    private String name;
    private String description;
    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="categoria")
    @JsonIgnoreProperties("categoria")
    private List<Machine>  machine;  

    public Integer getIdCategoria() {
        return idCategory;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategory = idCategoria;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Machine> getGym() {
        return machine;
    }

    public void setGym(List<Machine> machine) {
        this.machine = machine;
    }
    
    
    
}
