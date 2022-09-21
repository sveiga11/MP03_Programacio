package UF4.Jocs;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menu = 0;

        while (menu == 0) {
            String daus = "1. DAUS";
            String parxis = "2. PARXIS";
            String tictac = "3. TIC TAC TOE";

            System.out.println("**************************************");
            System.out.println("              MENU JOCS                ");
            System.out.println("**************************************");

            System.out.println(daus);
            System.out.println(parxis);
            System.out.println(tictac);

            System.out.print("Escull el joc al que vols jugar: ");

            int escollirjoc = scanner.nextInt();

            if (escollirjoc == 1) {
                System.out.println("******************* Benvingut als Daus! *******************");
                int menuDaus = 0;

                int partidesGuanyades = 0;
                int partidesJugades = 0;

                while (menuDaus == 0) {
                    String llençarDaus = "1. Llençar Dau";
                    String sortirDaus = "2. Sortir";

                    System.out.println(llençarDaus);
                    System.out.println(sortirDaus);

                    System.out.print("Que vols fer ara? ");

                    int escollirAccioDau = scanner.nextInt();

                    if (escollirAccioDau == 1) {
                        Dau dau1 = new Dau();
                        Dau dau2 = new Dau();
                        Dau dau3 = new Dau();

                        JocDau jocDau = new JocDau(dau1, dau2, dau3);
                        jocDau.jugar();

                        System.out.println(dau1.valorDau + " " + dau2.valorDau + " " + dau3.valorDau);

                        if (jocDau.contadorPartidaGuanyada >= 1){
                            partidesGuanyades++;
                            partidesJugades++;
                        } else if (jocDau.contadorPartidaJugada >= 1){
                            partidesJugades++;
                        }
                    }
                    if (escollirAccioDau == 2) {

                        System.out.println();
                        System.out.println("Has jugat " + partidesJugades + " partides!");
                        System.out.println("Has guanyat " + partidesGuanyades  + " partides :-)");
                        System.out.println();
                        break;
                    }
                    if (escollirAccioDau != 1 && escollirAccioDau != 2){
                        System.out.println("OPCIO NO VALIDA!");
                        System.out.println();
                    }
                }
            }
                if (escollirjoc == 2) {
                    System.out.println();
                    System.out.println("******************** Benvingut al Parxis! ********************");
                    System.out.println("Aquest joc encara no es troba disponible, intenta-ho mes tard.");
                    System.out.println();
                }
                if (escollirjoc == 3) {
                    System.out.println();
                    System.out.println("***************** Benvingut al Tic Tac Toe! ******************");
                    System.out.println("Aquest joc encara no es troba disponible, intenta-ho mes tard.");
                    System.out.println();
                }
                if (escollirjoc != 1 && escollirjoc != 2 && escollirjoc != 3) {
                    System.out.println("OPCIO NO VALIDA!");
                    System.out.println();
                }
            }
        }
    }

