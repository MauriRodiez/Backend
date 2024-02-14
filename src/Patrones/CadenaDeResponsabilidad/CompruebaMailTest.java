package Patrones.CadenaDeResponsabilidad;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompruebaMailTest {

    @Test
    public void mailATecnica(){

        //dado
        Mail mail = new Mail("alejo@gmail.com", "tecnica@colmena.com","Revisar Pc");
        CompruebaMail compruebaMail = new CompruebaMail();

        String respuestaEsperada = "El correo llego a Tecnico";

        // Cuando
        String proceso = compruebaMail.checkMail(mail);

        // entonces
        assertEquals(respuestaEsperada, proceso);
    }
}