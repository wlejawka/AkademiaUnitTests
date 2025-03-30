package Zadanie5.Main;
public class Rabat{
  
            public static String calculateRabat(double price, boolean klient){
                if (!klient) {
                    
                    return "karta";
                }
                
                if(klient && price<101){
                    return "rabat wynosi 5 %";
                    
                }else if(klient == true && price>=101 && price<=200){
                    return "rabat wynosi 10 %";
                }else if(klient == true && price>200 && price<=300){
                    return "rabat wynosi 15 %";
                }else if(klient == true && price>300 && price<=400){
                    return "rabat wynosi 20 %";
                }else if(klient == true && price>400){
                    return "rabat wynosi 25 %";
                }
                                return "jakis blad";
             }
     
        
        public static void main (String args[]){
    }
}