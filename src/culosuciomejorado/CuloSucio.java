package culosuciomejorado;

public class CuloSucio {
    MazoDeCartas mazo = new MazoDeCartas();
    Jugador jugador;
    GestorDeTurnos turnos;
    
    public void agregarJugador(){
        System.out.println("Bienvenido!");
        char opc = 's';
        do{
        jugador = new Jugador(Extra.readString("Ingrese nombre del jugador: "));
        opc = Extra.readChar("¿Desea ingresar otro jugador? [s/n]");
        turnos = new GestorDeTurnos(jugador);
        }while (opc == 's' || opc == 'S');        
        
    }
    public void arrancar(){
        agregarJugador();
        mazo.generar();
        //System.out.println(turnos.jugadores.size());
        System.out.println("El perdedor es: " + juego());
    }
    
    private Jugador juego(){
        boolean unoDeOro = false;
        Carta carta;
        String opc;
        Jugador ju = new Jugador("");
        while(unoDeOro == false  && mazo.carta.size() != 0){
            ju = turnos.nextJugador();
            System.out.println("TURNO DE  " + ju.getName().toUpperCase());
            opc = Extra.readString("Para sacar una carta presione Enter, para rendirse cualquier tecla.");
            if(opc.equals("")){
                carta = mazo.getCarta();
                System.out.println(carta);
                if(mazo.unoDeOro(carta) == true){
                    unoDeOro = true;
                }
            }else{
                return ju;
            }
        }
        return ju;
    }    
}
