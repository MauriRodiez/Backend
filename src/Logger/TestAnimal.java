package Logger;


public class TestAnimal {
    public static void main(String[] args) {

        // instancias de Leon
        Leon leon1 = new Leon("Simba",11, true);
        Leon leon2 = new Leon("Bom", -9, false);

        // instancias de Tigre
        Tigre tigre1 = new Tigre("Ramon", 11);
        Tigre tigre2 = new Tigre("Pepe", 5);

        // Testear metodos
        leon1.correr();
        leon2.correr();
        leon2.esMayorA10();

        tigre1.correr();
        tigre2.correr();
    }


}
