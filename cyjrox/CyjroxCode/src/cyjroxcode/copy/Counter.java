package cyjroxcode.copy;

public class Counter {

	public static void main(String[] args) {

					int counter = 1;
				while (counter <= 50) {  //while loop expression
					++counter;
							System.out.printf(" %6d ", counter * 10);
				}
				System.out.println();
				
				
				int products = 0;
			for(int cop = 3; cop <= 21;products += cop, cop +=3 ) {
				cop += products; 
						System.out.printf(" %d%n ", products * 3 );
			}
			System.out.println();
		}
			
	}