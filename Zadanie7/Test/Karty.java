
import java.util.ArrayList;
import java.util.Collections;

public class Karty {
        //metoda glowna zwracajaca Stringa
        public String whoWins(){


             //tworzymy talie kart jako tablice int
             ArrayList<Integer> taliaClubs = new  ArrayList<>();
             // wypelniamy tablice 14 intami ktore odpowiadaja talii kart od 2 do Asa
             for(int i =1; i <15; i++){
                 taliaClubs.add(i);
             }

            //tworzymy talie kart jako tablice int
             ArrayList<Integer> taliaDiamonds = new  ArrayList<>();
             // wypelniamy tablice 14 intami ktore odpowiadaja talii kart od 2 do Asa
             for(int i =1; i <15; i++){
                 taliaDiamonds.add(i);
             }

            //tworzymy talie kart jako tablice int
             ArrayList<Integer> taliaHearts = new  ArrayList<>();
             // wypelniamy tablice 14 intami ktore odpowiadaja talii kart od 2 do Asa
             for(int i =1; i <15; i++){
                 taliaHearts.add(i);
             }

            //tworzymy talie kart jako tablice int
            ArrayList<Integer> talia = new  ArrayList<>();
            // wypelniamy tablice 14 intami ktore odpowiadaja talii kart od 2 do Asa
            for(int i =1; i <15; i++){
                talia.add(i);
            }
            talia.addAll(taliaClubs); // dodajemy do glownej talii kolejny kolor
            talia.addAll(taliaDiamonds);// dodajemy do glownej talii kolejny kolor
            talia.addAll(taliaHearts);// dodajemy do glownej talii kolejny kolor

            Collections.shuffle(talia);//tasujemy karty

            ArrayList<Integer> kartyAdama = new  ArrayList<>();//tworzymy nowa tablice kart
            //dodajemy 3 karty dla pierwszego gracza
            kartyAdama.add(talia.get(0));
            kartyAdama.add(talia.get(1));
            kartyAdama.add(talia.get(2));
            //System.out.println(kartyAdama);
            
            ArrayList<Integer> kartyHonzy = new  ArrayList<>();//tworzymy nowa tablice kart
            //dodajemy 3 karty dla drugiego gracza
            kartyHonzy.add(talia.get(3));
            kartyHonzy.add(talia.get(4));
            kartyHonzy.add(talia.get(5));
            //System.out.println(kartyHonzy);
            // tworzymy 2 nowe listy
            ArrayList<Integer> zabralAdam = new  ArrayList<>();
            ArrayList<Integer> zabralHonza = new  ArrayList<>();
            //porownujemy obie listy za pomoca petli
            for (int i = 0; i < kartyAdama.size(); i++) {
                if (kartyAdama.get(i) > (kartyHonzy.get(i))) {
                    zabralAdam.add(1);
                }else if (kartyHonzy.get(i) > kartyAdama.get(i)){
                    zabralHonza.add(1);  
                }
            }
            //System.out.println(zabralAdam);
            //System.out.println(zabralHonza);
            if(zabralAdam.size() > zabralHonza.size()){
                return ("Adam wygrał " + zabralAdam.size() + " do " + zabralHonza.size());
            }else if (zabralHonza.size() > zabralAdam.size()){
                return ("Honza wygrał " + zabralHonza.size()+ " do " + zabralAdam.size());
            }else{
                return  ("remis " + zabralHonza.size()+ " do " + zabralAdam.size());
            }
        }
    public static void main (String args[]){
        Karty gra = new Karty();
        for(int i = 0; i <2;i++){
        System.out.println(gra.whoWins());
        }
    }
}
