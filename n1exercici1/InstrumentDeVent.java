package n1exercici1;

// Clase filla InstrumentDeVent
public class InstrumentDeVent  extends Instrument {

    // Métode constructor que crida al constructor de la classe pare
    public InstrumentDeVent(String nom, double preu){
        super(nom, preu);
    }

    // Implementació del métode tocar()
    @Override
    public void tocar() {
        System.out.println("Está sonant un instrument de vent");
    }

}

