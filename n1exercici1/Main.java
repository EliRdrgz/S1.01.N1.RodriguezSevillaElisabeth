package n1exercici1;

public class Main {

    public static void main(String[] args){

        var flauta = new InstrumentDeVent("flauta", 50.);
        var tambor = new InstrumentDePercusió("tambor", 75);
        var guitarra = new InstrumentDeCorda("guitarra", 120);

        flauta.tocar();
        tambor.tocar();
        guitarra.tocar();

    }

}
