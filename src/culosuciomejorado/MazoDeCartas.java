package culosuciomejorado;

import java.util.ArrayList;

public class MazoDeCartas {
    ArrayList <Carta> carta = new ArrayList <>();
    
    public void generar(){
        generarCartas();
        mezclarCartas();
    }
    
    private void generarCartas(){
        for (Palo palo : Palo.values()) { 
            for (int i = 1; i <= 12; i++) {
                carta.add(new Carta(i,palo));
            }
        }
    }
    
    private void mezclarCartas(){
        int a, b;
        Carta aux;
        for (int i = 0; i < 200; i++) {
            a = Extra.numRandomEntre(0, this.carta.size()-1);
            b = Extra.numRandomEntre(0, this.carta.size()-1);
            aux = carta.get(a);
            this.carta.set(a, this.carta.get(b));
            this.carta.set(b, aux);
        }
        
    }
    public Carta getCarta(){
        Carta laCarta = carta.get(0);
        carta.remove(0);
        return laCarta;
    }
    
    public int getNumero(){
        int numero = carta.get(0).getNumer();
        carta.remove(0);
        return numero;
    }
    public boolean unoDeOro(Carta laCarta){
        if(laCarta.toString().equals("1 de Oro")){
           return true;
        }
            return false;
    }

    @Override
    public String toString() {
        return carta + "\n";
    }
}
