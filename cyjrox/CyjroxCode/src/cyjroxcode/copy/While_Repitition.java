package cyjroxcode.copy;
import  java.util.Scanner;
public class While_Repitition {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
			int total = 0;
				int gradeCounter = 1;
		while(gradeCounter <= 10) {
			System.out.println("Enter grade: ");
				int grade = input.nextInt();
				
		total = total + grade;
		gradeCounter = gradeCounter + 1;
	}
		int average = total / 10;
		
			System.out.printf("%nStudent Average is %d%n", total);
			System.out.printf("Class average is %d%n", average);

	}

}
