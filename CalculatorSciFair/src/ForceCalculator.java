import java.util.Scanner;

public class ForceCalculator {

<<<<<<< HEAD
	public static void main(String[] args) {
		Scanner forcecalc = new Scanner (System.in);
		int altsol = 0;
		
		System.out.println("Mass: ");
		
		float mass = -1; 
		while(mass < 0)
		{
			mass = forcecalc.nextFloat();
			if(mass < 0)
			{
				System.out.println("Impossible value, nice try.");
				System.out.println();
				System.out.println("Re-enter Mass: ");
=======
	public static void init() {
		Scanner forcecalc = new Scanner(System.in);
		boolean on = true;
		while (on) {
			int altsol = 0;

			System.out.println("Mass: ");

			float mass = -1;
			while (mass < 0) {
				mass = forcecalc.nextFloat();
				if (mass < 0) {
					System.out.println("Impossible value, nice try.");
					System.out.println();
					System.out.println("Re-enter Mass: ");
				}
>>>>>>> branch 'master' of https://github.com/giraffeinfridge/CooperCalculator.git
			}

			System.out.println("Acceleration: ");

			float accel = forcecalc.nextFloat();

			if (accel < 0) {
				accel = accel * (-1);
				altsol = 1;
			}

			float answer = mass * accel;

			System.out.println();
			System.out.println();
			System.out.println();

			System.out.println("Force = " + answer);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException balls) {
				Thread.currentThread().interrupt();
			}

			System.out.println();
			System.out.println("Enter '1' for help or '0' to go back");

			int helper = forcecalc.nextInt();

			System.out.println();

			if (helper == 1) {
				System.out.println("To calculate force, the formula is F = ma");

				System.out.println();

				try {
					Thread.sleep(2000);
				} catch (InterruptedException balls) {
					Thread.currentThread().interrupt();
				}

				System.out.println("'F' is force, 'm' is mass, and 'a' is acceleration");

				System.out.println();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException balls) {
					Thread.currentThread().interrupt();
				}

				System.out.println("F = ma");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException balls) {
					Thread.currentThread().interrupt();
				}

				System.out.println("F = " + mass + " * " + accel);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException balls) {
					Thread.currentThread().interrupt();
				}

				System.out.println("F = " + answer);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException balls) {
					Thread.currentThread().interrupt();
				}

				if (altsol == 1) {
					System.out.println();
					System.out.println("The reason that the inputed acceleration");
					System.out.println("changed to a positive number is because");
					System.out.println("a negative force is impossible but a negative");
					System.out.println("acceleration is possible, though it only means");
					System.out.println("a change in the acceleration of the object");
					System.out.println("so the acceleration being negative wouldn't");
					System.out.println("affect the way the world perceives the force,");
					System.out.println("but in order for the formula F = ma to work");
					System.out.println("the acceleration would have to temporarily be");
					System.out.println("converted to a positive number");
				}

			}else if(helper == 0){
				on = false;
				break;
			}
		}
	}

}

/*
 * try { Thread.sleep(2000); } catch(InterruptedException ex) {
 * Thread.currentThread().interrupt(); }
 */
