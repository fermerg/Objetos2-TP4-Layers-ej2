package ar.unrn.tp4.modelo;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private String email;


    public Empleado(String nombre, String apellido, String fechaNac, String email) {
        if(validarDato(nombre)){
            throw new RuntimeException("Debe ingresar un nombre");
        }
        if(validarDato(apellido)){
            throw new RuntimeException("Debe ingresar un apellido");
        }
        if(validarDato(fechaNac)){
            throw new RuntimeException("Debe ingresar la fecha de nacimiento");
        }
        if(validarDato(email)){
            throw new RuntimeException("Debe ingresar un email");
        }

        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = LocalDate.parse(fechaNac, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        this.email = email;
    }

    private boolean validarDato(String dato){
        return dato.equals("");
    }

    public String getEmail() {
        return email;
    }

    public boolean cumpleAnios(LocalDate fecha){
        return fechaNac.getDayOfMonth() == fecha.getDayOfMonth() && fechaNac.getMonth().equals(fecha.getMonth());

    }
}
