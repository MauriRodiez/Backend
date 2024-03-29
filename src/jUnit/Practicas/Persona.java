package jUnit.Practicas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {

    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String apellido, String email, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /* ---------------------------------------------------------- */
    /*                         Consigna                           */
    /* ---------------------------------------------------------- */

    /* 1- Un método que muestre el nombre completo de la siguiente manera: Apellido, Nombre. */

    public boolean nombreCorrecto(){
        boolean respuesta = false;

        char[] nombreChars = nombre.toCharArray();
        for(char letra: nombreChars){
            if(!Character.isLetter(letra)){
                return respuesta;
            }
        }
        respuesta = true;

        System.out.println(apellido + ", " + nombre);

        return respuesta;
    }

    /* 2- Un método para calcular si la persona es mayor de 18 años. */

    public boolean esMayor(){
        boolean result = false;

        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, fechaActual);

        if(periodo.getYears() >= 18){
            System.out.println("La persona es mayor de 18 años");
            result = true;
        } else {
            System.out.println("La persona es menor de 18 años");
        }

        return result;
    }



}
