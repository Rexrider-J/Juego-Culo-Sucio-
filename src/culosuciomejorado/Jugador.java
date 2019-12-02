package culosuciomejorado;

public class Jugador {
    private String name;
    
    public Jugador(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return name + "";
    }
    
    
}
