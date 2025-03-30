package Zadanie6.Main;

import java.util.Arrays;


public  class Egzamin {
    public static void main (String args[]){

    String wejscie = "B;B;B;B;B;B;_;_;_;_";
    String[] litery = wejscie.split(";");
    String klucz = "B;B;B;B;B;B;B;B;B;B";
    String[] literyKlucz = klucz.split(";");

    int[] wyniki = new int[litery.length];

    for(int i = 0; i < litery.length; i++){
        if(litery[i].equals(literyKlucz[i])){
            wyniki[i] = 3;
        }
        else if (litery[i].equals("_")) {
            wyniki[i] = -1;
        }
        else{
            wyniki[i] = -4;
        }
    }
    System.out.println(Arrays.toString(wyniki));

    int suma = 0;
        for (int i = 0; i < wyniki.length; i++) {
            suma += wyniki[i];
        }
    System.out.println(suma);
    int max = 30;
    double procent = (double) suma / max; 
    System.out.println(procent);

    // if(procent < 0.51){
    //     return "ocena niedostateczna (2,0)";
    // }else if(procent > 0.5 && procent <= 0.6){
    //     return "ocena dostateczna (3,0)";
    // }else if(procent > 0.6 && procent <= 0.7){
    //     return "ocena dostateczna plus (3,5)";
    // }else if(procent > 0.7 && procent <= 0.8){
    //     return "ocena dobra (4,0)";
    // }else if(procent > 0.8 && procent <= 0.9){
    //     return "ocena dobra plus (4,5)";
    // }else if(procent > 0.9){
    //     return "ocena bardzo dobra (5,0)";
    // }

    }   
}