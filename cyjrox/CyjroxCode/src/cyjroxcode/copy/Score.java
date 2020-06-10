package cyjroxcode.copy;

import  java.util.Scanner;

	public class Score {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
				System.out.println("Enter Score: ");
						int score = input.nextInt();
	
								int stuGrade = 100;
								if(stuGrade >= 80) {
									System.out.println("A");}
								else {
												if(stuGrade >= 80) { 
													System.out.println("B");
												}		
												else {
														if(stuGrade <=70) {
																	System.out.println("Pass");
														}
														else {
																		System.out.println("Failed");
														}
											}
								}
								
				}

}
	
