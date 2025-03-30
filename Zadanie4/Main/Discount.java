package Zadanie4.Main;
public class Discount{
    public static void main (String args[])
        {
        }
        public double calculateDiscount(double price){
            double discount =0;
                if(price<5001){
                    discount = 0.0;
                }else if(price>=5001 && price<=15000){
                    discount = 0.3;
                }else if(price>15000 && price<=50000){
                    discount = 0.4;
                }else if(price>50000){
                    discount = 0.8;
                }
            
            return price * (1- discount);
        }

    }