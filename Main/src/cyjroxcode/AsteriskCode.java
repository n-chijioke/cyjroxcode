package cyjroxcode;

public class AsteriskCode{
	
	public static void main(String[] args) {
		
		for(int d = 1; d <= 7; d++) {
			if(( d== 1) || (d == 7))  {
				for(int j = 1; j <= 7; j++) {
					System.out.print(	"*");}
			}else {
					System.out.print	("*");
					System.out.print("  ");
					System.out.print("  ");
					System.out.print("  ");
					System.out.print("  ");
					System.out.print("  ");
					System.out.print	("*");
			}
				System.out.println();
		}
	

	}
}

