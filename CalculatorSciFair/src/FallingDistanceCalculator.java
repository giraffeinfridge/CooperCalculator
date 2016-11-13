import java.util.Scanner;
public class FallingDistanceCalculator {

	public static void main(String[] args) {
		Scanner value = new Scanner (System.in);
		
		System.out.println("This calculator is based around the common units");
		System.out.println("of meters and seconds that relate/correspond to");
		System.out.println("the constant gravitational pull of the Earth.");
		
		System.out.println();
		
		System.out.println("Time: ");
		
		float time = value.nextFloat();
		
		float answer = (float) (0.50 * 9.81 * time * time);
		
		System.out.println();
		
		System.out.println(answer + " m");
		
		try {
			Thread.sleep(1000);
		}	catch(InterruptedException balls) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println();
		
		System.out.println("Enter '1' for help");
		
		int helper = value.nextInt();
		
		System.out.println();
		
		if (helper == 1) {
			System.out.println("To calculate the falling distance, the formula is:");
			
			System.out.println("D = 1/2 * 9.81 * T");
			
			System.out.println();
			
			try {
				Thread.sleep(2000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("'D' is distance, and T is time");
			
			System.out.println();
			
			try {
				Thread.sleep(1000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("D = 1/2 * 9.81 * T");
			
			try {
				Thread.sleep(1000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("D = 1/2 * 9.81 * " + time);
			
			try {
				Thread.sleep(1000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("D = " + answer);
			

	}

}
	
}
