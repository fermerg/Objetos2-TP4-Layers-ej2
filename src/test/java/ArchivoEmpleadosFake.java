import ar.unrn.tp4.modelo.Empleado;
import ar.unrn.tp4.modelo.ListaEmpleados;

import java.util.ArrayList;
import java.util.List;

public class ArchivoEmpleadosFake implements ListaEmpleados {
    ArrayList<Empleado> empleados;

    public ArchivoEmpleadosFake(){
        empleados = new ArrayList<>();

        empleados.add(new Empleado("Juan", "X", "1990/09/12", "juanequis@mail.com"));
        empleados.add(new Empleado("Marta", "Y", "1993/11/18", "martaygriega@mail.com"));
        empleados.add(new Empleado("Pepe", "Z", "2002/11/21", "pepezzz@mail.com"));
    }

    @Override
    public List<Empleado> getListaEmpleados() {
        return empleados;
    }
}
