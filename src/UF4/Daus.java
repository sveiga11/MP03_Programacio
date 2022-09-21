package UF4;

import java.util.Scanner;

public class Daus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Indica en numero de vegades que vols llençar el dau: ");
        int numvegades = scanner.nextInt();

        int dau1 = 0;
        int dau2 = 0;

        int numinicial = 2;

        int[] frequencia = new int[11];

        for (int i = 0; i < numvegades ; i++) {

            //int dau1 = (int) (Math.random()*11)+2;
            //int dau2 = (int) (Math.random()*11)+2;

            dau1 = (int) (Math.random()*6 + 1);
            dau2 = (int) (Math.random()*6 + 1);

            int resultatdaus = dau1 + dau2;
            frequencia[resultatdaus-2]++;
        }

        for (int i = 0; i < frequencia.length ; i++) {
            System.out.println(numinicial + " -->" + frequencia[i] + "vegades");
            numinicial++;
        }

    }
}
