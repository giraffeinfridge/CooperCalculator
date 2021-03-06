import java.util.Scanner;

public class AccelerationCalculator {

	public static void init() {
		Scanner accelcalc = new Scanner(System.in);
		boolean negchecker;
		boolean on = true;
		while (on) {
			System.out.println("Force: ");

			float force = accelcalc.nextFloat();
			
			if (force < 0) {
				negchecker = false;
				
				while (negchecker == false) {
					System.out.println();
					System.out.println("Impossible value");
					System.out.println();
					System.out.println("Enter a valid value");
					try {Thread.sleep(1000);
					} catch (InterruptedException e) {System.out.println(e);}
					System.out.println();
					System.out.println("Force: ");
					force = accelcalc.nextFloat();
					if (force >= 0) {
						negchecker = true;
					}
					else {}
				}

			}

			System.out.println("\nMass: ");

			float mass = accelcalc.nextFloat();
			
			if (mass < 0) {
				negchecker = false;
				
				while (negchecker == false) {
					System.out.println();
					System.out.println("Impossible value");
					System.out.println();
					System.out.println("Enter a valid value");
					try {Thread.sleep(1000);
					} catch (InterruptedException e) {System.out.println(e);}
					System.out.println();
					System.out.println("Mass: ");
					mass = accelcalc.nextFloat();
					if (mass >= 0) {
						negchecker = true;
					}
					else {}
				}

			}

			float answer = force / mass;

			System.out.println();
			System.out.println();
			System.out.println();

			System.out.println("Acceleration = " + answer);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException balls) {
				Thread.currentThread().interrupt();
			}

			System.out.println();
			System.out.println("Enter '1' for help or '0' to exit");

			int helper = accelcalc.nextInt();

			System.out.println();

			if (helper == 1) {
				System.out.println("To calculate acceleration, the formula is A = f/m");

				System.out.println();

				try {
					Thread.sleep(2000);
				} catch (InterruptedException balls) {
					Thread.currentThread().interrupt();
				}

				System.out.println("'A' is acceleration, 'f' is force, and 'm' is mass");

				System.out.println();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException balls) {
					Thread.currentThread().interrupt();
				}

				System.out.println("A = f/m");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException balls) {
					Thread.currentThread().interrupt();
				}

				System.out.println("A = " + force + "/" + mass);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException balls) {
					Thread.currentThread().interrupt();
				}

				System.out.println("A = " + answer);

			}else if (helper == 0){
				on = false;
				break;
			}
		}

	}

}