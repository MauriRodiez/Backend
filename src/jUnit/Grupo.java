package jUnit;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private List<Persona> personas;

    public Grupo() {
        this.personas = new ArrayList<>();
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public void agregarPersona(Persona persona){

        boolean esMayor = persona.esMayor();
        boolean entre0y120 = persona.checkEdad120();
        boolean letras = persona.letrasCheck();
        boolean letrasAaZ = persona.checkAZNombre();

        if(
                esMayor && letras && entre0y120 && letrasAaZ
        ){
            personas.add(persona);
        }else {
            System.out.println("No se puede agregar la persona");
            if(!persona.esMayor()){
                System.out.println("No se puede agregar la persona");
            }
            if(!persona.letrasCheck()){
                System.out.println("No se puede agregar la persona");
            }
            if(!persona.checkEdad120()){
                System.out.println("No se puede agregar la persona");
            }
            if(!persona.checkEdad120()){
                System.out.println("No se puede agregar la persona");
            }
        }

    }
}
