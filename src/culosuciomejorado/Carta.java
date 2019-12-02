package culosuciomejorado;

public class Carta {
    private int numero;
    private Palo palo;
    
    public Carta (int numero,Palo palo){
        this.numero = numero;
        this.palo = palo;
    }
    public int getNumer(){
        return this.numero;
    }

    @Override
    public String toString() {
        return  numero + " de " + palo;
    }
}
