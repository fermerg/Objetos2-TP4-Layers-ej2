import ar.unrn.tp4.modelo.Fecha;

import java.time.LocalDate;

public class ProveedorFechaFake implements Fecha {
    @Override
    public LocalDate fecha() {
        return LocalDate.of(1993,11,18);
    }
}
