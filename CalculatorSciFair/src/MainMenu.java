import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean on = true;
		while (on) {
			System.out.println("What would you like to calculate? ");
			System.out.println("\n[0]  Quit\nPhysics\n[1]  Impulse\n[2]  Constant Speed\nMath\n[3] Basic Expression ");
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
				BasicCalculator.init();
				break;
			}
		}
	}
}