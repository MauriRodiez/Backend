package jUnit;

public class Persona {

    private String nombre;
    private Integer edad;

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    // chequeamos que la persona sea mayor a 18 años
    public boolean esMayor(){
        return edad > 18;
    }

    //chequeamos la cantidad de letras del nombre
    public boolean letrasCheck(){
        return nombre.length() > 4;
    }

    // chequeamos que el nombre solo contenga letras
    public boolean checkAZNombre(){
        boolean respuesta = false;

        char[] nombreChars = nombre.toCharArray();
        for(char letra: nombreChars){
            if(!Character.isLetter(letra)){
                return respuesta;
            }
        }
        respuesta = true;
        return respuesta;
    }

    //chequeamos edad entre 0 y 120
    public boolean checkEdad120(){
        boolean respuesta = false;
        if(edad > 0 && edad < 120){
            respuesta = true;
        }
        return respuesta;
    }
}




