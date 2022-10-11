package UF4.ExerciciAlumnes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EX15 {
    public static void main(String[] args) {
//15. De l'exemple dels enums (Alumnes UF i Qualilfier) fes el següent:

        System.out.println("---Exercici 15---");
        System.out.println();

//      - Omple una llista d'alumnes (3 alumnes)

        List<Alumne> llistaAlumne = new ArrayList<>();
        Alumne alumne1 = new Alumne("Samu", Alumne.Genere.HOME, "1");
        Alumne alumne2 = new Alumne("Ivan", Alumne.Genere.HOME, "2");
        Alumne alumne3 = new Alumne("Pol", Alumne.Genere.HOME, "3");

        llistaAlumne.add(alumne1);
        llistaAlumne.add(alumne2);
        llistaAlumne.add(alumne3);

//      - Posa diverses notes a tots els alumnes (3 notes per alumne)

        UF mp08uf1 = new UF("UF1", "Desenvolupament d'aplicacions per a dispositius mobils");
        UF mp07uf1 = new UF("UF1", "UI + XML Basic");
        UF mp03uf4 = new UF("UF1", "Fonaments de programacio orientada a objectes (POO)");

        alumne1.addNota(mp08uf1,Qualifier.EXCELLENT);
        alumne1.addNota(mp07uf1,Qualifier.EXCELLENT);
        alumne1.addNota(mp03uf4,Qualifier.SATISFACTORI);

        alumne2.addNota(mp08uf1,Qualifier.NOTABLE);
        alumne2.addNota(mp07uf1,Qualifier.SATISFACTORI);
        alumne2.addNota(mp03uf4,Qualifier.EXCELLENT);

        alumne3.addNota(mp08uf1,Qualifier.EXCELLENT);
        alumne3.addNota(mp07uf1,Qualifier.NO_SATISFACTORI);
        alumne3.addNota(mp03uf4,Qualifier.EXCELLENT);



//      - Treu el llistat de notes de cada un dels alumnes

        for (Alumne alumne: llistaAlumne){
            System.out.println(alumne.getNom());
            System.out.println("*******************");
            alumne.getNotes().forEach((uf,qualifier) -> System.out.printf("%s -> %s%n",uf,qualifier));
            System.out.println("*******************");
            System.out.println();
        }

//      - Treu el llistat d'alumnes amb la seva nota mitja i en ordre alfabètic.
        Map<String,Float> notesMitges = new TreeMap<>();
        for(Alumne alumne : llistaAlumne) {
            float notaM=0;
            for (Map.Entry entry : alumne.getNotes().entrySet()) {
                Qualifier qf = (Qualifier) entry.getValue();
                notaM += qf.getValor();
            }
            notaM = notaM / alumne.getNotes().size();
            System.out.printf("Nota mitja de %s es %f%n",alumne.getNom(), notaM);
            notesMitges.put(alumne.getNom(),notaM);
        }


    }
}
