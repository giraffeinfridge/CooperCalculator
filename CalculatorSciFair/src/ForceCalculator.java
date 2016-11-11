import java.util.Scanner;
public class ForceCalculator {

	public static void main(String[] args) {
		Scanner forcecalc = new Scanner (System.in);
		
		
		System.out.println("Mass: ");
		
		float mass = forcecalc.nextFloat();
		
		System.out.println("Acceleration: ");
		
		float accel = forcecalc.nextFloat();
		
		float answer = mass * accel;
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Force = " + answer);
		
		try {
			Thread.sleep(1000);
		}	catch(InterruptedException balls) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println();
		System.out.println("Enter '1' for help");
			
		int helper = forcecalc.nextInt();
		
		System.out.println();
		
		if (helper == 1) {
			System.out.println("To calculate force, the formula is F = ma");
			
			System.out.println();
			
			try {
				Thread.sleep(2000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("'F' is force, 'm' is mass, and 'a' is acceleration");
			
			System.out.println();
			
			try {
				Thread.sleep(1000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("F = ma");
			
			try {
				Thread.sleep(1000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("F = " + mass + " * " + accel);
			
			try {
				Thread.sleep(1000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("F = " + answer);
			
			
		
		
		
		}
			}
	
}
		

	

	
/*try {
	Thread.sleep(2000);
	}	catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
}*/


