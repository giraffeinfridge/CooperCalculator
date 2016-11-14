import java.util.Scanner;
//TODO change input to lowercase, and remove all spaces
public class ImpulseCalculator {

	public static void init() {
		Scanner in = new Scanner(System.in);	//user input scanner
		String i, f, t;	// initialize the strings for the variables in the equations
		int vars = 0;	//to count how many unknown variables are typed in, if more than 1, send an error
		char var = 'n';	//the variable that needs to be found
		float result = 0;	//the answer solved
		boolean on = true;	//used to keep the calculator going until the person quits
		while (on) {		// ^^
			vars = 0;		// we set the number of variables to 0 so it doesnt add up form the last calculation
			System.out.println(
					"Enter Impulse expression in the following form: \"i=f*t\" (impulse = force * time) or 'q' to quit");
			String ex = in.nextLine();
			ex = ex.toLowerCase();
			if (ex.equals("q")) {	//quit if the user enters 'q'
				on = false;
				break;
			}//The next 6 lines will split the equation into the variables
			String[] splitOne = ex.split("=");	//this one splits 'i' and 'f*t'<-------------------------------------------------------, 
			i = splitOne[0];					//assign the value of i to the string i												   |
			String second = splitOne[1];		//assign the second part (f*t) to a string (we're just doing this to get rid of this array
			String[] splitTwo = second.split("\\*");	//split second part into two more parts, f and t, split at *
			f = splitTwo[0];	//repeat
			t = splitTwo[1];
			if (i.equals("i")) {//the next if statements find out which variable we are solving for
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
				System.out.println("[!] Please only provide one missing variable");	//if there are more than 1 variable, give an error
				continue;
			}
			switch (var) {	//Finally, solve the equation based on which variable we are solving for
			case 'i':
				result = Float.parseFloat(f) * Float.parseFloat(t);		//parseFloat changes the string into a float, same with Integer.parseInt(x)
				break;
			case 'f':
				result = Float.parseFloat(i) / Float.parseFloat(t);
				break;
			case 't':
				result = Float.parseFloat(i) / Float.parseFloat(f);
			}
			System.out.println("[=]\t" + var + " = " + Float.toString(result));	//print the results
			//TODO: add the unit of measurements
		}
	}
}