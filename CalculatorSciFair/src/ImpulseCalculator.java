import java.util.Scanner;

public class ImpulseCalculator {

	public static void init() {
		Scanner in = new Scanner(System.in);
		String i, f, t;
		int vars = 0;
		char var = 'n';
		float result = 0;
		boolean on = true;
		while (on) {
			vars = 0;
			System.out.println(
					"Enter Impulse expression in the following form: \"i=f*t\" (impulse = force * time) or 'q' to quit");
			String ex = in.nextLine();
			if (ex.equals("q")) {
				on = false;
				break;
			}
			String[] splitOne = ex.split("=");
			i = splitOne[0];
			String second = splitOne[1];
			String[] splitTwo = second.split("\\*");
			f = splitTwo[0];
			t = splitTwo[1];
			if (i.equals("i")) {
				var = 'i';
				vars++;
			}
			if (f.equals("f")) {
				var = 'f';
				vars++;
			}
			if (t.equals("t")) {
				var = 't';
				vars++;
			}
			if (vars > 1) {
				System.out.println("[!] Please only provide one missing variable");
				continue;
			}
			switch (var) {
			case 'i':
				result = Float.parseFloat(f) * Float.parseFloat(t);
				break;
			case 'f':
				result = Float.parseFloat(i) / Float.parseFloat(t);
				break;
			case 't':
				result = Float.parseFloat(i) / Float.parseFloat(f);
			}
			System.out.println("[=]\t" + var + " = " + Float.toString(result));
		}
	}
}