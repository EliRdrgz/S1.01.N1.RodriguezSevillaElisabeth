package n1exercici1;

//Classe filla
public class InstrumentDeCorda extends Instrument{

    // Métode constructor que crida al constructor de la classe pare
    public InstrumentDeCorda(String nom, double preu) {
        super(nom, preu);
    }

    // Implementació del métode tocar()
    @Override
    public void tocar() {
        System.out.println("Está sonant un instrument de corda");
    }

}
