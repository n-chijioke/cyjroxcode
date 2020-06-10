package cyjroxcode;

public class InterestRate {

	public static void main(String[] args) {
		System.out.printf("%4s%20s%n", "Year", "Amount on Deposit");
		double principal = 1000.0;
		double rate = 0.05;
		double amount;

	for(int year = 1; year <= 10; year++){
	amount = principal * Math.pow(1.0 + rate, year);
		
		System.out.printf("%4d%,20.2f%n", year, amount);
	}
	}

}
