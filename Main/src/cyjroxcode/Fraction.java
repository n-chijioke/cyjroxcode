package cyjroxcode;
import java.util.Scanner;

	public class Fraction {

		public static void main(String[] args) {
			System.out.println("Enter number: ");
			
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			
		for(int i = 1; i <= number; i++);{
			if(number%i==0);
					System.out.println( 1+"  is the factor of  "+number );
			}
			input.close();
		

	}

}
