package co.com.sofka.crud.dto;

import java.security.PrivateKey;

public class TodoListaDTO {
    private Long idlista;
    private String nombre;

    public Long getIdlista() {
        return idlista;
    }

    public void setId(Long idlista) {
        this.idlista = idlista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
