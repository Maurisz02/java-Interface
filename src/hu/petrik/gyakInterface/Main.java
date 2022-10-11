package hu.petrik.gyakInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Kolcsonozheto> katalogus = new ArrayList<>();

    public static void main(String[] args) {
        Konyv k1 = new Konyv("A gyűrűk ura", "J. R. R. Tolkien", "AABBCC-112233");
       // Kolcsonozheto k1 = new Konyv("A gyűrűk ura", "J. R. R. Tolkien", "AABBCC-112233");
        Dvd d1 = new Dvd("Star Wars V. rész - A Birodalom Visszavág", 124);
        Dvd d2 = new Dvd("Star Wars V. rész - Egy Új Remény", 100);
        Dvd d3 = new Dvd("Transformers - JamaleBee", 204);
        Ujsag u1 = new Ujsag("Képes Sport", 2007, 23);

        //Interface tipusú objektum csak úgy hozható létre, ha megvalósítja az interface minden függvényét
        Kolcsonozheto kolcs1 = new Kolcsonozheto() {
            @Override
            public String megjelenitendoNev() {
                return null;
            }

            @Override
            public int meddigKolcsonozheto() {
                return 0;
            }
        };

        System.out.println(k1.getIsbn());
        System.out.println(k1.megjelenitendoNev());
        System.out.println("\n\n");

        katalogus.add(k1);
        katalogus.add(d1);
        katalogus.add(d2);
        katalogus.add(d3);
        katalogus.add(u1);

        for (Kolcsonozheto k : katalogus){
            System.out.println(k.megjelenitendoNev() + " " + k.meddigKolcsonozheto());
        }

    }
}
