import java.util.Scanner;
public class MassCalculator {

	public static void main(String[] args) {
		Scanner masscalc = new Scanner (System.in);
		
		System.out.println("Acceleration: ");
		
		float accel = masscalc.nextFloat();
		
		System.out.println("Force: ");
		
		float force = masscalc.nextFloat();
		
		float answer = force / accel;
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Mass = " + answer);
		
		try {
			Thread.sleep(1000);
		}	catch(InterruptedException balls) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println();
		System.out.println("Enter '1' for help");
		
		int helper = masscalc.nextInt();
		
		System.out.println();
		
		if (helper == 1) {
			System.out.println("To calculate mass, the formula is M = f/a");
			
			System.out.println();
			
			try {
				Thread.sleep(2000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("'M' is mass, 'f' is force, and 'a' is acceleration");
			
			System.out.println();
			
			try {
				Thread.sleep(1000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("M = f/a");
			
			try {
				Thread.sleep(1000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("M = " + force + "/" + accel);
			
			try {
				Thread.sleep(1000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("M = " + answer);

	}

}
	
}
