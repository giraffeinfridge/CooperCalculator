import java.util.Scanner;
public class AccelerationCalculator {

	public static void main(String[] args) {
			Scanner accelcalc = new Scanner (System.in);
			
			System.out.println("Force: ");
			
			float force = accelcalc.nextFloat();
			
			System.out.println("Mass: ");
			
			float mass = accelcalc.nextFloat();
			
			float answer = force / mass;
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println("Acceleration = " + answer);
			
			try {
				Thread.sleep(1000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println();
			System.out.println("Enter '1' for help");
			
			int helper = accelcalc.nextInt();
			
			System.out.println();
			
			if (helper == 1) {
				System.out.println("To calculate acceleration, the formula is A = f/m");
				
				System.out.println();
				
				try {
					Thread.sleep(2000);
				}	catch(InterruptedException balls) {
					Thread.currentThread().interrupt();
				}
				
				System.out.println("'A' is acceleration, 'f' is force, and 'm' is mass");
				
				System.out.println();
				
				try {
					Thread.sleep(1000);
				}	catch(InterruptedException balls) {
					Thread.currentThread().interrupt();
				}
				
				System.out.println("A = f/m");
				
				try {
					Thread.sleep(1000);
				}	catch(InterruptedException balls) {
					Thread.currentThread().interrupt();
				}
				
				System.out.println("A = " + force + "/" + mass );
				
				try {
					Thread.sleep(1000);
				}	catch(InterruptedException balls) {
					Thread.currentThread().interrupt();
				}
				
				System.out.println("A = " + answer);
				

	}

}

}