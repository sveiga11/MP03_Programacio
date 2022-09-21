package UF4;

import java.util.Scanner;

public class ArgsTest {
    public static void main(String[] args){
        String nom = "anonim";
        int edat = 0;
        Scanner scanner = new Scanner(System.in);

        if (args.length == 2){
            nom = args[0];
            edat = Integer.parseInt(args[1]);
        } else {
            System.out.printf("Has entrat malament els args. Entra un nom i una edat");
        }

        System.out.printf("Hola %s tens %d anys%n", nom, edat);
    }
}
