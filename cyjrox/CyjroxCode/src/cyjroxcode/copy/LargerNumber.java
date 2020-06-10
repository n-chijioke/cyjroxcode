package cyjroxcode.copy;

import java.util.Scanner;

public class LargerNumber {

	public static void main(String[] args) {
		
					int Num = 0;
					int counter = 1;
					int num = 0;
					int Lnum = 0;
					int largerNum = 0;
					int SLnum = 0;
			Scanner input = new Scanner(System.in);
		for(int i = 1; i <= 7; i++) {
			System.out.println("Enter number: "+counter+":");
			num = input.nextInt();
		if(num > largerNum) {
			
			largerNum = num;
			++counter;
		}
		if(Num >Lnum) {
			SLnum = Lnum;
			Lnum = Num;
		}else {
			if(num < Lnum) 
			
				num = Lnum;
			++counter;
			System.out.println();
		System.out.println("The largest num is "+ largerNum+":");
		System.out.println();
		}
		System.out.println("The largest num is " +Lnum+":");
			}
		
		}
	
	
}
