package ar.unrn.tp4.database;

import ar.unrn.tp4.modelo.Empleado;
import ar.unrn.tp4.modelo.ListaEmpleados;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoEmpleados implements ListaEmpleados {
    private final File file;

    public ArchivoEmpleados(String file) {
        this.file = new File(file);
    }

    @Override
   public List<Empleado> getListaEmpleados() {
        List<Empleado> empleados= new ArrayList<>() ;
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            for (String empleado : reader.lines().toList()){
                String [] camposFila = empleado.split(", ");
                Empleado emp = new Empleado(camposFila[0], camposFila[1], camposFila[2], camposFila[3]);
                empleados.add(emp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Error de recuperacion del archivo", e);
        }
        return empleados;
    }
}
