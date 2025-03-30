package Zadanie2.Main;
public class Premia{
	public double wysokoscPremii(int x){
		double result = 0;
		try {		
		if(x<4){
			result = 0.0;
		}else if(x>=4 && x<=8){
			result = 0.5;
		}else if(x>8 && x<=11){
			result = 0.75;
		}else if(x>11 && x<=70){
			result = 1.0;
		}
		return result;
	} catch (Exception e) {
			System.out.println("niepoprawny wiek");
			result = 0.0;
			return result;
		}
		
	}
public static void main (String args[])
	{
	 
	}

}