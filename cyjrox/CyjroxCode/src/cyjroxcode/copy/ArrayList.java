package cyjroxcode.copy;

public class ArrayList {

	public static void main(String[] args) {


	    int numOfRow = 25;
	        int numOfSpace = numOfRow/2;
	        int numOfStar = 1;
	        int midPoint = numOfRow/2 + 1;
	        for(int i = 1; i <= numOfRow; i++) {
	            for (int j = 1; j <= numOfSpace; j++) {
	                System.out.printf(" ");
	            }
	            for (int k = 1; k <= numOfStar; k++) {
	                System.out.printf( "*");
	            }
	            if (i < midPoint) {
	                numOfSpace--;
	                numOfStar += 2;
	            }
	            else
	            {
	             numOfSpace ++;
	             numOfStar -= 2;
	            }
	            System.out.println();

	        }

	    }

	}

