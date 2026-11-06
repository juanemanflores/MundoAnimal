import mx.com.animales.Perro;
import mx.com.animales.Gato;
import mx.com.animales.Vaca;

public class Main {
    public static void main(String[] args) {
        Perro objPerrito = new Perro("Delta", 2);
        objPerrito.mostrarInformacion();
        objPerrito.hacerSonido();
        objPerrito.moverse();


        Gato objGato = new Gato("Pedro", 4);
        objGato.mostrarInformacion();
        objGato.hacerSonido();
        objGato.moverse();

        Vaca objVaca = new Vaca("Lechita", 5);
        objVaca.mostrarInformacion();
        objVaca.hacerSonido();
        objVaca.moverse();



    }
}