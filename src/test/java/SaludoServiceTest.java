import ar.unrn.tp4.modelo.SaludoService;
import org.junit.Test;

import static org.junit.Assert.*;


public class SaludoServiceTest {

    @Test
    public void envioDeSaludoPorCumpleanios(){

        ProveedorFechaFake fechaFake = new ProveedorFechaFake();
        ArchivoEmpleadosFake archivoFake = new ArchivoEmpleadosFake();
        EmailSenderFake emailFake = new EmailSenderFake();
        SaludoService mailSaludo = new SaludoService(archivoFake, emailFake, fechaFake);

        mailSaludo.enviarSaludo();
        StringBuffer emailEmpleadosFake = emailFake.getEmailEmpleados();

        assertEquals("martaygriega@mail.com", emailEmpleadosFake.toString());
        assertFalse(emailEmpleadosFake.toString().equals("juanequis@mail.com") ||
                emailEmpleadosFake.toString().equals("pepezzz@mail.com"));
    }
}