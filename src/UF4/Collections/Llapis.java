package UF4.Collections;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Llapis implements Comparable<Llapis>{

    //1. Crea un classe Llapis amb els atributs, color(int) i gruix(float), afegint-hi el comportament que creguis necessari (getters, setters, toString, etc.)

    int color;
    float gruix;

    public Llapis(int color, float gruix) {
        this.color = color;
        this.gruix = gruix;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getGruix() {
        return gruix;
    }

    public void setGruix(float gruix) {
        this.gruix = gruix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Llapis llapis = (Llapis) o;
        return color == llapis.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Llapis{" +
                "color=" + color +
                ", gruix=" + gruix +
                '}';
    }
    @Override
    public int compareTo(Llapis o) {
        if(this.color < o.getColor()) return 1;
        else if(this.color > o.getColor()) return -1;
        else return 0;
    }
    public static void main(String[] args) {

        //2. Crea dues caixes de llapissos (amb List)

        List<Llapis> llista1 = new ArrayList<Llapis>();
        List<Llapis> llista2 = new ArrayList<Llapis>();

        //3. Omple una caixa amb 10 llapisos de diferents colors (random)
        for (int i = 0; i < 10.; i++) {
            Llapis llapis = new Llapis((int) (Math.random()*7 + 1), (float) (Math.random()*3.0f));
            llista1.add(llapis);
        }

        //4. Omple l'altre caixa amb 10 llapissos amb diferents colors i de diferents gruixos (random)
        for (int i = 0; i < 10; i++) {
            Llapis llapis = new Llapis((int) (Math.random()*7 + 1), (float) (Math.random()*3.0f));
            llista2.add(llapis);
        }

        //5. Imprimeix per la consola la informació dels llapissos que hi ha a les dues caixes. Usa recorreguts amb diferents tècniques (for, foreach. iterator, for loop)
        System.out.println();
        System.out.println("---Caixa 1---");
        for (Llapis llapis : llista1){
            System.out.println(llapis);
        }

        System.out.println();
        System.out.println("---Caixa 2---");
        Iterator<Llapis> box2 = llista2.iterator();
        while(box2.hasNext()) {
            System.out.println(box2.next());
        }

        //6. Ordena els llapissos per color del més gran al més petit
        Collections.sort(llista1);
        System.out.println();
        System.out.println("Ha sigut ordenada la caixa 1 per color!");
        Iterator<Llapis> box1color = llista1.iterator();
        while(box1color.hasNext()) {
            System.out.println(box1color.next());
        }

        Collections.sort(llista2);
        System.out.println();
        System.out.println("Ha sigut ordenada la caixa 2 per color!");
        Iterator<Llapis> box2color = llista2.iterator();
        while(box2color.hasNext()) {
            System.out.println(box2color.next());
        }

        //7. Ordena els llapissos per gruix amb una classe anònima i un Comparator
        Collections.sort(llista1, new Comparator<Llapis>() {
            @Override
            public int compare(Llapis o1, Llapis o2) {
                if(o1.getGruix() < o2.getGruix()) return -1;
                else if (o1.getGruix() > o2.getGruix()) return 1;
                else return 0;
            }
        });
        System.out.println();
        System.out.println("Ha sigut ordenada la caixa 1 per gruix!");
        Iterator<Llapis> box1gruix = llista1.iterator();
        while(box1gruix.hasNext()) {
            System.out.println(box1gruix.next());
        }
        Collections.sort(llista2, new Comparator<Llapis>() {
            @Override
            public int compare(Llapis o1, Llapis o2) {
                if(o1.getGruix() < o2.getGruix()) return -1;
                else if (o1.getGruix() > o2.getGruix()) return 1;
                else return 0;
            }
        });
        System.out.println();
        System.out.println("Ha sigut ordenada la caixa 2 per gruix!");
        Iterator<Llapis> box2gruix = llista1.iterator();
        while(box2gruix.hasNext()) {
            System.out.println(box2gruix.next());
        }

        //8. Crea una LinkedList que contingui els llapissos de la caixa 2
        LinkedList<Llapis> linkCaixa = new LinkedList<>(llista2);

        //9. Afegeix també a aquesta LinkedList els llapissos de la caixa 1
        linkCaixa.addAll(llista1);

        //10. Imprimeix el contingut de la LinkedList
        System.out.println();
        System.out.println("---Linkedist---");
        Iterator<Llapis> linkedist = linkCaixa.iterator();
        while(linkedist.hasNext()) {
            System.out.println(linkedist.next());
        }

        //11. Crea una altra caixa de llapissos amb els llapissos de la LinkedList però que no n'hi hagi de repetits a dins
        List<Llapis> llista3 = new ArrayList<>();
        llista3.addAll(linkCaixa);

        Set<Llapis> hashSet = new HashSet<>(linkCaixa);
        System.out.println();
        System.out.println("---Hash Set---");
        llista3.addAll(hashSet);
        llista3.clear();
        for (Llapis llapis : hashSet){
            System.out.println(llapis);
        }

        //12. Crea el següent Map i observa el comportament del mètode put:
        Map<Integer,String> map_colors = new HashMap<>();
        map_colors.put(0,"Negre");
        map_colors.put(1,"Vermell");
        map_colors.put(2,"Groc");
        map_colors.put(3,"Verd");
        map_colors.put(4,"Verd");
        map_colors.put(3,"Blanc");

        //12.1 Explica què passa amb el color verd i amb la clau 3. Perquè?

        //12.2 Imprimeix per pantalla, utilitzant un bucle for, tota la imformació del Map (clau i valor)
        System.out.println();
        System.out.println("Map (Clau i valor)");
        for (Map.Entry<Integer, String> entry : map_colors.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        //12.3 Imprimeix per pantalla, utilitzant un bucle for, només els valors del Map
        System.out.println();
        System.out.println("Map (Valor)");
        for (Map.Entry<Integer, String> entry : map_colors.entrySet()) {
            System.out.println(entry.getValue());
        }

        //13. Exercici de la freqüència de llançament de dos daus amb List i el mètode Collecions.frequency()

        //14. Exercici de la freqüència de llançament de dos daus amb Map

        /*15. De l'exemple dels enums (Alumnes UF i Qualilfier) fes el següent:

                - Omple una llista d'alumnes (3 alumnes)
                - Posa diverses notes a tots els alumnes (3 notes per alumne)
                - Treu el llistat de notes de cada un dels alumnes
                - Treu el llistat d'alumnes amb la seva nota mitja i en ordre alfabètic.*/
    }
}
