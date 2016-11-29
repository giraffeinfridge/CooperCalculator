import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean on = true;
		while (on) {
			System.out.println("What would you like to calculate? ");
			System.out.println("\n[0]  Quit\n"
					+ "Physics\n"
					+ "[1]  Impulse\n"
					+ "[2]  Constant Speed\n"
					+ "[3]  Falling Acceleration\n"
					+ "[4]  Force\n"
					+ "[5]  Mass\n"
					+ "Math\n"
					+ "[6]  Basic Expression");
			int input = in.nextInt();
			switch (input) {
			case 0:
				on = false;
				return;
			case 1:
				ImpulseCalculator.init();
				break;
			case 2:
				ConstantSpeedCalculator.init();
				break;
			case 3:
				AccelerationCalculator.init();
				break;
			case 4:
				ForceCalculator.init();
				break;
			//case 5:
				//MassCalculator
			case 6:
				BasicCalculator.init();
				break;
			}
		}
	}
}