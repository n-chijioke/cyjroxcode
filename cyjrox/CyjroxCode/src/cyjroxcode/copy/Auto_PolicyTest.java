package cyjroxcode.copy;

public class Auto_PolicyTest {

	public static void main(String[] args) {

	      Auto_Policy  policy1 =  new Auto_Policy(11111111, "Toyota Camry","NJ" ); 
	          Auto_Policy  policy2 =  new Auto_Policy(22222222, "Ford Fusion", "ME" );
	          policyInNoFaultState(policy1); 
	          policyInNoFaultState(policy2);
	}
				public static void policyInNoFaultState(Auto_Policy policy){ 
					System.out.println("The auto policy:"); 
					System.out.printf( "Account #: %d; Car: %s; State %s %s a no-fault state%n%n", policy.getAccountNumber(), policy.getMakeAndModel(),   policy.getState()); 
				} 

	

}
