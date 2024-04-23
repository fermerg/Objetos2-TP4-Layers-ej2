import ar.unrn.tp4.modelo.Email;

public class EmailSenderFake implements Email {
    private StringBuffer emailEmpleados;

    public EmailSenderFake() {
        emailEmpleados = new StringBuffer();
    }

    @Override
    public void enviarEmail(String emailEmpleado) {
        emailEmpleados.append(emailEmpleado);
    }

    public StringBuffer getEmailEmpleados() {
        return emailEmpleados;
    }
}
