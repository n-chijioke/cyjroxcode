package cyjroxcode.copy;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double amount1 ;
		 double principal = 100.0;
		 double rate = 0.05;
		 	System.out.printf("%s%20s%n", "Year", "Amount on deposit");
		 
		 		for(int year = 1; year <= 10; ++year) {
		 			amount1 = principal * Math.pow(1.0 + rate, year);
		 	
		 				System.out.printf("4d%,20.2f%n", "year"," amount");
		 		}
		 		
		}


}	
	


