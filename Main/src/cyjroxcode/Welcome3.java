package cyjroxcode;
import java.util.Scanner;
public class Welcome3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("First integer: ");
		int x = input .nextInt();
		
		System.out.print("Second integer: ");
		int y = input .nextInt();

		int result = x + y ;
		System.out.printf("Sum is %d%n", (x + y ));
		System.out.printf( "   *%n  **%n***%n****%t*****%n");
		System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");
		
	}

}
