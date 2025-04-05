
    import java.util.HashMap;
    import java.util.Map;
    
    public class Wojna {
        
        private static final Map<String, Integer> kartaMap = new HashMap<>();
        
        static {
            kartaMap.put("2", 2);
            kartaMap.put("3", 3);
            kartaMap.put("4", 4);
            kartaMap.put("5", 5);
            kartaMap.put("6", 6);
            kartaMap.put("7", 7);
            kartaMap.put("8", 8);
            kartaMap.put("9", 9);
            kartaMap.put("10", 10);
            kartaMap.put("J", 11);
            kartaMap.put("Q", 12);
            kartaMap.put("K", 13);
            kartaMap.put("A", 14); // As ma najwyższą wartość
        }
    
        // Metoda przyjmująca talie kart w postaci stringów i zwracająca wynik
        public static String winner(String[] deckAdam, String[] deckMati) {
            int punktyAdama = 0;
            int punktyMati = 0;
    
            for (int i = 0; i < deckAdam.length; i++) {
                int kartaAdama = kartaMap.get(deckAdam[i]);
                int kartaMati = kartaMap.get(deckMati[i]);
    
                if (kartaAdama > kartaMati) {
                    punktyAdama++;
                } else if (kartaMati > kartaAdama) {
                    punktyMati++;
                }
            }
    
            if (punktyAdama > punktyMati) {
                return "Adam wygrywa " + punktyAdama + " do " + punktyMati;
            } else if (punktyMati > punktyAdama) {
                return "Mati wygrywa " + punktyMati + " do " + punktyAdama;
            } else {
                return "Remis " + punktyAdama + " do " + punktyMati;
            }
        }
    }
    

