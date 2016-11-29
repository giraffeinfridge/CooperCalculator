import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class BasicCalculator {
//
	public static void init() {
		Scanner bc = new Scanner(System.in);
		boolean on = true;
		while (on) {
			System.out.println("Enter expression ('q' to go back): ");
			String input = bc.nextLine(); // get user input
			if(input.equals("q")){
				on = false;
				break;
			}
			input = input.replaceFirst("pi", "3.14"); // format string to
														// replace variables
														// with numbers
			ScriptEngineManager mgr = new ScriptEngineManager(); // activate
																	// java's
																	// built in
																	// JavaScript
																	// engine
			ScriptEngine engine = mgr.getEngineByName("JavaScript");
			try {
				System.out.println("\n" + engine.eval(input)); // Evaluate
																// expression
																// with
																// javascript
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
