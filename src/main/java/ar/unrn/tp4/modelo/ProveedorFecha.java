package ar.unrn.tp4.modelo;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProveedorFecha implements Fecha{
    @Override
    public LocalDate fecha() {
        return LocalDate.now();
    }
}
