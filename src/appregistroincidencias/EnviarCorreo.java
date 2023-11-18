package appregistroincidencias;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

public class EnviarCorreo {
    
    public void Enviar(String correoRecibidor, String mensajeEnviar, String titulo){
        String correoEnvia = "soporte.login1@gmail.com";
        String contra = "umrrhcaqtrvpssnq";
        String mensaje = mensajeEnviar;
        
        Properties objetoPec = new Properties();
        objetoPec.put("mail.smtp.host", "smtp.gmail.com");
        objetoPec.setProperty("mail.smtp.starttls.enable","true");
        objetoPec.put("mail.smtp.port", "587");
        objetoPec.setProperty("mail.smtp.port","587");
        objetoPec.put("mail.smtp.user", correoEnvia);
        objetoPec.setProperty("mail.smtp.auth","true");
        
        Session sesion = Session.getDefaultInstance(objetoPec);
        MimeMessage mail = new MimeMessage(sesion);
        
        try{
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(correoRecibidor));
            mail.setSubject(titulo);
            mail.setText(mensaje);
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia, contra);
            transporte.sendMessage(mail, 
                    mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            
            JOptionPane.showMessageDialog(null,
                    "El correo se envío correctamente");
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null,
                    "Error al enviar el correo...\n" + ex);
        }        
    }   
}
