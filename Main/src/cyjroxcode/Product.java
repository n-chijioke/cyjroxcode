package cyjroxcode;
import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);   //create scanner to obtain input from keyboard
// initialization phase
int total = 0;   // initialization product of numbers from the user
int product;
int numbercounter = 3;
		while( numbercounter  <= 100) {

	total = 3 * product;
System.out.println("Enter Number: ");
	int number = input.nextInt();
total = total * number;
int numberCounter = number * 3;
		}
int number = total / 100;
System.out.printf("%nProduct of 100 is %d%n", number);
	}

}
