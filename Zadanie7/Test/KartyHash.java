import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class KartyHash {
    public static void main(String args[]) {
        String[] talia1 = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"}; // prosta tablica początkowa
        ArrayList<String> kartyString = new ArrayList<>(Arrays.asList(talia1)); // konwersja na ArrayList

        //Collections.shuffle(kartyString); // tasowanie 1

        ArrayList<String> kartyAdama = new ArrayList<>(); // tworzymy nową tablicę kart
        // dodajemy 3 karty dla pierwszego gracza
        kartyAdama.add(kartyString.get(0));
        kartyAdama.add(kartyString.get(1));
        kartyAdama.add(kartyString.get(2));
        System.out.println(kartyAdama);

        //Collections.shuffle(kartyString); // tasowanie 2

        ArrayList<String> kartyHonzy = new ArrayList<>(); // tworzymy nową tablicę kart
        // dodajemy 3 karty dla drugiego gracza
        kartyHonzy.add(kartyString.get(3));
        kartyHonzy.add(kartyString.get(4));
        kartyHonzy.add(kartyString.get(5));
        System.out.println(kartyHonzy);

        // Tworzymy mapę, która przypisuje każdej karcie wartość numeryczną
        Map<String, Integer> karty = new HashMap<>();
        karty.put("2", 2);
        karty.put("3", 3);
        karty.put("4", 4);
        karty.put("5", 5);
        karty.put("6", 6);
        karty.put("7", 7);
        karty.put("8", 8);
        karty.put("9", 9);
        karty.put("T", 10);
        karty.put("J", 11);
        karty.put("Q", 12);
        karty.put("K", 13);
        karty.put("A", 14);

        // Wyniki punktów
        int punktyAdama = 0;
        int punktyHonzy = 0;

        // Porównujemy karty graczy
        for (int i = 0; i < 3; i++) {
            int kartaAdama = karty.get(kartyAdama.get(i)); // Pobieramy wartość karty Adama
            int kartaHonzy = karty.get(kartyHonzy.get(i)); // Pobieramy wartość karty Honzy

            if (kartaAdama > kartaHonzy) {
                punktyAdama++;
            } else if (kartaHonzy > kartaAdama) {
                punktyHonzy++;
            }
        }

        if (punktyAdama > punktyHonzy) {
            System.out.println("Adam wygrał " + punktyAdama + " do " + punktyHonzy);
        } else if (punktyHonzy > punktyAdama) {
            System.out.println("Honza wygrał " + punktyHonzy + " do " + punktyAdama);
        } else {
            System.out.println("Jest remis " + punktyAdama + " do " + punktyHonzy);
        }
    }
}
