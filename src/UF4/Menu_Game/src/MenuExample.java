package UF4.Menu_Game.src;

import java.util.Scanner;

public class MenuExample {

    public void menu(){
        Scanner scanner = new Scanner(System.in);

        int menu = 0;

        while (menu == 0) {
            String play = "1. PLAY";
            String settings = "2. SETTINGS";
            String sortir = "3. EXIT";

            System.out.println("**************************************");
            System.out.println("              MENU JOC                ");
            System.out.println("**************************************");

            System.out.println(play);
            System.out.println(settings);
            System.out.println(sortir);

            System.out.print("Escull una opcio: ");

            int escollirfuncio = scanner.nextInt();

            if (escollirfuncio == 1){
                System.out.println();
                System.out.println("Juego");
                System.out.println();
            }
            if (escollirfuncio == 2){

                int menuSettings = 0;
                while (menuSettings == 0){
                    String players = "1. PLAYERS";
                    String level = "2. LEVEL";
                    String tornar = "3. RETURN";

                    System.out.println();
                    System.out.println("Configuracion");
                    System.out.println();

                    System.out.println(players);
                    System.out.println(level);
                    System.out.println(tornar);

                    System.out.print("Escull una opcio: ");
                    int escollirConfiguracio = scanner.nextInt();

                    if (escollirConfiguracio == 1){
                        System.out.print("Quants jugadors vols que juguin a la proxima partida (Maxim 4): ");
                        int numJugadors = scanner.nextInt();

                        if (numJugadors > 4){
                            System.out.println("EL NUMERO MAXIM DE JUGADORS PER PARTIDA ES 4");
                        }else {
                            System.out.println();
                            System.out.println("Has escollit " + numJugadors + " jugadors per a la teva proxima partida!");
                            System.out.println();
                        }
                    }
                    if (escollirConfiguracio == 2){
                        System.out.println("Escull la dificultad del joc que vols a la teva proxima partida (1 - 5): ");
                        int dificultat = scanner.nextInt();

                        if (dificultat > 5){
                            System.out.println("NUMERO DE DIFICULTAT NO VALID");

                        } else {
                            System.out.println();
                            System.out.println("Has escollit una dificultat " + dificultat + " per a la teva proxima partida!");
                            System.out.println();
                        }
                    }
                    if (escollirConfiguracio == 3){
                        break;
                    }
                    if (escollirConfiguracio != 1 && escollirConfiguracio != 2 && escollirConfiguracio != 3){
                        System.out.println();
                        System.out.println("AQUESTA OPCIO NO ES VALIDA");
                        System.out.println();
                    }
                }
            }
            if (escollirfuncio == 3){
                break;
            }
            if (escollirfuncio != 1 && escollirfuncio != 2 && escollirfuncio != 3){
                System.out.println();
                System.out.println("AQUESTA OPCIO NO ES VALIDA");
                System.out.println();
            }
        }
    }
}
