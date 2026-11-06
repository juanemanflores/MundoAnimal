package mx.com.animales;

public class Gato extends Animal implements Movible{
    public Gato (String nombre, Integer edad) {
        super (nombre, edad);

    }

    @Override
    public void hacerSonido() {
        System.out.println("Miaaauu");
    }

    @Override
    public void moverse() {
        System.out.println("El gato camina despacio");
    }
}
