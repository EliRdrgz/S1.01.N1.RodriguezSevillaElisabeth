package n1exercici2;

public class Cotxe {

    //Que un atribut sigui "static" significa que l'element es únic a la classe y que es pot accedir sense haber d'instanciar-lo (crear un objecte). Per accedir des de una altre classe es pot fer mitjançant el nom de la classe
    //en aquest cas Cotxe.marca. ;
    //Que un atribut sigui "final" vol dir que no es pot modificar, la dada que es defineix a l'atribut és sempre constant. Els atributs que son "final" s'escriuen en majúscula.
    private static final String MARCA = "Audi";
    private static String model = "A1";
    private final double POTENCIA = 120;

    public Cotxe() {
    }

    public static void frenar(){
        System.out.println("El cotxe està frenant");
    }

    public void accelerar(){
        System.out.println("El cotxe està accelerant");
    }



    public static void main(String[] args) {

        var cotxe = new Cotxe();
        System.out.println(cotxe);

        cotxe.accelerar();

        frenar();

    }

    @Override
    public String toString() {
        return "Cotxe:" + '\n' +
                " marca: " + MARCA +'\n' +
                " model: " + model +'\n' +
                " potencia: " + POTENCIA + " CV";
    }
}
