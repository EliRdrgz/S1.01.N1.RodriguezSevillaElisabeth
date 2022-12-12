package n1exercici1;

//classe filla
public class InstrumentDePercusió extends Instrument{


    // Métode constructor que crida al constructor de la classe pare
    public InstrumentDePercusió(String nom, double preu) {
        super(nom, preu);
    }

    // Implementación del método tocar()
    @Override
    public void tocar() {
        System.out.println("Está sonant un instrument de percusió");
    }


}
