package cyjroxcode.copy;
import  java.util.Scanner;
public class GradeCount {

	public static void main(String[] args) {
		
		int trip = 0;
		int md;
			int gu;
			double mpg ;
			int tmd = 0;
			int tgu;
				int tmpg;
				System.out.println("Enter gallon of trip: ");
				Scanner input = new Scanner(System.in);
				md = input.nextInt();
		while(md != -1) {
			gu = input.nextInt();
			mpg =(double) md/gu;
			tmd = tmd + md ;
			tgu =tgu +gu;
			md = input.nextInt();
				System.out.print(mpg);
				trip++;
					
						md = input.nextInt();
						System.out.print(mpg);
		}
		
		while(-1 != 0) {
			gu = input.nextInt();
			mpg =(double) md/gu;
				System.out.print(mpg);
				
					tmd = tmd + md ;
						tgu =tgu +gu;
						md = input.nextInt();
		System.out.println("The total average used is:%f " +" mpg");
		
		}
	}
}
