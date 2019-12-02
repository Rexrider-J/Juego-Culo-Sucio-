package culosuciomejorado;

import java.util.ArrayList;

public class GestorDeTurnos {
    private static ArrayList <Jugador> jugadores = new ArrayList<>();
    private static int cont;
    
    public GestorDeTurnos(Jugador ju){
        GestorDeTurnos.jugadores.add(ju);
    }
    
    public Jugador nextJugador(){
        Jugador jugador = new Jugador("");
        if(GestorDeTurnos.jugadores.size() != 0){
            jugador = GestorDeTurnos.jugadores.get(GestorDeTurnos.cont % GestorDeTurnos.jugadores.size());
        }
        GestorDeTurnos.cont += 1;
        return jugador; 
    }
}
