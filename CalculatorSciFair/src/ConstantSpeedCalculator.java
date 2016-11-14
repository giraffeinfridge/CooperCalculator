import java.util.Scanner;

public class ConstantSpeedCalculator {

	public static void init() {
		Scanner cspeed = new Scanner(System.in);
		boolean on = true;
		while (on) {
			System.out.println("Speed (m/s):");

			float spd = cspeed.nextFloat();

			System.out.println("Time (s):");

			float time = cspeed.nextFloat();

			float answer = time * spd;

			System.out.println();

			System.out.println(answer + "m");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException balls) {
				Thread.currentThread().interrupt();
			}

			System.out.println();

			System.out.println("Enter '1' for help or '0' to go back");

			int helper = cspeed.nextInt();

			System.out.println();

			if (helper == 1) {
				System.out.println("To calculate force, the formula is D = st");

				System.out.println();

				try {
					Thread.sleep(2000);
				} catch (InterruptedException balls) {
					Thread.currentThread().interrupt();
				}

				System.out.println("'D' is distance, 's' is speed, and 't' is time");

				System.out.println();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException balls) {
					Thread.currentThread().interrupt();
				}

				System.out.println("D = st");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException balls) {
					Thread.currentThread().interrupt();
				}

				System.out.println("D = " + spd + " * " + time);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException balls) {
					Thread.currentThread().interrupt();
				}

				System.out.println("D = " + answer);

			}else if(helper == 0){
				on = false;
				break;
			}

		}

	}

}
