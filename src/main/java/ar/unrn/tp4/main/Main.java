package ar.unrn.tp4.main;

import ar.unrn.tp4.database.ArchivoEmpleados;
import ar.unrn.tp4.email.EmailSender;
import ar.unrn.tp4.modelo.Email;
import ar.unrn.tp4.modelo.ProveedorFecha;
import ar.unrn.tp4.modelo.SaludoService;

public class Main {
    public static void main(String[] args) {
        ArchivoEmpleados archivoEmpleados = new ArchivoEmpleados("C:\\Users\\fm\\Desktop\\empleados.txt");
        EmailSender emailSender = new EmailSender();
        ProveedorFecha proveedorFecha = new ProveedorFecha();
        new SaludoService(archivoEmpleados, emailSender, proveedorFecha).enviarSaludo();
    }
}