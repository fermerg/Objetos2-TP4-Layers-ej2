package ar.unrn.tp4.modelo;

import java.util.List;

public class SaludoService {
    private Email emisorMail;
    private ListaEmpleados empleados;
    private Fecha fechaHoy;

    public SaludoService(ListaEmpleados empleados, Email emisorMail, Fecha fechaHoy) {
        this.empleados = empleados;
        this.emisorMail = emisorMail;
        this.fechaHoy = fechaHoy;
    }

    public void enviarSaludo(){
        List<Empleado> listaEmpleados = empleados.getListaEmpleados();
        for(Empleado empleado : listaEmpleados){
            if(empleado.cumpleAnios(fechaHoy.fecha())){
                emisorMail.enviarEmail(empleado.getEmail());
            }
        }
    }
}
