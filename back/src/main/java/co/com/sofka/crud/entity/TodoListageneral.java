package co.com.sofka.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TodoListageneral {

@Id
@GeneratedValue
    private Long idlista;
    private String nombre;

    public Long getIdlista() {
        return idlista;
    }

    public void setIdlista(Long idlista) {
        this.idlista = idlista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
