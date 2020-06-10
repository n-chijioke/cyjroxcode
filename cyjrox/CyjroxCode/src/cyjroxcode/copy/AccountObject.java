package cyjroxcode.copy;
import java.util.Scanner;
public class AccountObject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			AccountObject myAccount = new AccountObject();
			System.out.println("Initial name is: %s%n%n ");
			
			System.out.println("Enter Name: ");
				String Name = sc.nextLine();
			AccountObject.setName(Name);
				System.out.println();
					System.out.println("Name in my ccountObject is: %s%n",Name ,AccountObject.getName());

	}

}
