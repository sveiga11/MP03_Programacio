package UF4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
//        List<Integer> num = new ArrayList<>();


        for (int i = 0; i < numvegades ; i++) {


            dau1 = (int) (Math.random()*6 + 1);
            dau2 = (int) (Math.random()*6 + 1);

//            (int) (Math.random()* ((max - min) + 1));
//            num.add(dau1 + dau2 -2 );

            int resultatdaus = dau1 + dau2;
            frequencia[resultatdaus-2]++;
        }

//        for (int i = 0; i < 12; i++) {
//            System.out.println("Numero " + i "= " + Collections.frequency(num, i ));
//        }

        for (int i = 0; i < frequencia.length ; i++) {
            System.out.println(numinicial + " -->" + frequencia[i] + "vegades");
            numinicial++;
        }

    }
}
