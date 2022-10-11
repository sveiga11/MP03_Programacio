package UF4.Menu_Game.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    ConfigGame configGame = new ConfigGame();
    ArrayList<Player> players = new ArrayList<>();

    public void inici(){
    MenuExample menuExample = new MenuExample(configGame, this);
    menuExample.menu();


    }
    public void jugar(){

        int numeroJugadors = 1;

        if (configGame.getNumJugadors() == 0 || configGame.getNivell() == 0){
            System.out.println();
            System.out.println("NO ES POT INICIAR LA PARTIDA AMB 0 JUGADORS. CONFIGURA LA PARTIDA!");
            System.out.println();
        } else {

            for (int i = 0; i < configGame.getNumJugadors(); i++) {
                Player player = new Player();
                System.out.println();
                System.out.print("Escriu el nickname del jugador " + numeroJugadors + ": ");
                String nomJugador = scanner.next();
                player.setName(nomJugador);
                System.out.print("Digues el num. de punts del jugador: ");
                String puntsJugador = scanner.next();
                player.setName(puntsJugador);
                players.add(player);
                numeroJugadors++;
            }

            System.out.println();
            System.out.println("Has iniciat una partida amb una dificultat de nivell " + configGame.getNivell());
            System.out.println("Jugant...");
            System.out.println("Hi ha " + configGame.getNumJugadors() + " jugadors");
            System.out.println("... Joc acabat");
            System.out.println();
        }
    }
}
