import java.util.Arrays;
import java.util.Scanner;

public class MetricConverter {

	public static String[] checkerdistance = { "mm", "cm", "in", "ft", "yrds", "m", "km", "mi" };

	public static String[] checkerweight = { "oz", "mg", "g", "kg", "lbs", "mt" };

	public static String[] checkertime = { "ns", "mcs", "ms", "sec", "min", "hr", "day", "wk", "mth", "yr", "dd", "ct",
			"ml" };

	public static void main(String[] args) {

		Scanner sdcalc = new Scanner(System.in);

		boolean negchecker;
		
		String iti = null;

		String unit = null;

		String unittwo = null;

		float ytom = (float) 0.9144;

		System.out.println("Enter '1' for distance conversion");
		System.out.println();
		System.out.println("Enter '2' for weight/mass conversion");
		System.out.println();
		System.out.println("Enter '3' for time conversion");
		System.out.println();

		int option = sdcalc.nextInt();

		if (option == 1) {
			System.out.println();
			System.out.println("'mm'  : millimeters");
			System.out.println("'cm'  : centimeters");
			System.out.println("'in'  : inches");
			System.out.println("'ft'  : feet");
			System.out.println("'yrds': yards");
			System.out.println("'m'   : meters");
			System.out.println("'km'  : kilometers");
			System.out.println("'mi'  : miles");
			System.out.println();

			System.out.println("Use the abbreviation that corresponds with each unit \n");

			System.out.println("Starting unit?");

			iti = sdcalc.next();

			while (!checkertwodistance(iti)) {

				System.out.println();

				System.out.println("This unit is invalid");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException mate) {
					System.out.println(mate);
				}

				System.out.println("Enter a valid unit");

				try {
					Thread.sleep(500);
				} catch (InterruptedException mate) {
					System.out.println(mate);
				}

				System.out.println();

				System.out.println("Starting unit?");

				iti = sdcalc.next();
			}

			System.out.println();

			System.out.println("Amount of first unit?");

			float amount = sdcalc.nextFloat();

			if (amount < 0) {
				negchecker = false;
				
				while (negchecker == false) {
					System.out.println();
					System.out.println("Impossible value");
					System.out.println();
					System.out.println("Enter a valid value");
					try {Thread.sleep(1000);
					} catch (InterruptedException e) {System.out.println(e);}
					System.out.println();
					System.out.println("Amount of first unit?");
					amount = sdcalc.nextFloat();
					if (amount >= 0) {
						negchecker = true;
					}
					else {}
				}

			}
			
			
			System.out.println();

			System.out.println("What unit are you converting to?");

			String ititwo = sdcalc.next();

			while (!checkerodistance(ititwo)) {

				System.out.println();

				System.out.println("This unit is invalid");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException mate) {
					System.out.println(mate);
				}

				System.out.println("Enter a valid unit");

				try {
					Thread.sleep(500);
				} catch (InterruptedException mate) {
					System.out.println(mate);
				}

				System.out.println();

				System.out.println("What unit are you converting to?");

				ititwo = sdcalc.next();
			}

			System.out.println("\n");

			switch (iti) {
			case "mm":
				unit = "millimeters";
				break;
			case "cm":
				unit = "centimeters";
				break;
			case "in":
				unit = "inches";
				break;
			case "ft":
				unit = "feet";
				break;
			case "yrds":
				unit = "yards";
				break;
			case "m":
				unit = "meters";
				break;
			case "km":
				unit = "kilometers";
				break;
			case "mi":
				unit = "miles";
				break;
			}

			switch (ititwo) {
			case "mm":
				unittwo = "millimeters";
				break;
			case "cm":
				unittwo = "centimeters";
				break;
			case "in":
				unittwo = "inches";
				break;
			case "ft":
				unittwo = "feet";
				break;
			case "yrds":
				unittwo = "yards";
				break;
			case "m":
				unittwo = "meters";
				break;
			case "km":
				unittwo = "kilometers";
				break;
			case "mi":
				unittwo = "miles";
				break;
			}

			System.out.println(unit + " -> " + unittwo);
			System.out.println("\n\n" + amount + " " + unit + " = ? " + unittwo);

			System.out.println();

			if (iti.equals(ititwo)) {
				System.out.println("They are the same unit");
			}

			System.out.println();

			switch (iti) {
			case "mm":
				switch (ititwo) {
				case "cm":
					amount = (float) amount / 10; // mm -> cm
					break;
				case "in":
					amount = (float) (amount / 25.4); // mm -> in
					break;
				case "ft":
					amount = (float) (amount / 304.8); // mm -> ft
					break;
				case "yrds":
					amount = (float) (amount / 914.4); // mm -> yards
					break;
				case "m":
					amount = (float) (amount / 1000); // mm -> m
					break;
				case "km":
					amount = (float) (amount / 100000); // mm -> km
					break;
				case "mi":
					amount = (float) (amount / 1609344); // mm -> mi
					break;
				}
				break;
			case "cm":
				switch (ititwo) {
				case "mm":
					amount = (float) (amount * 10); // cm -> mm
					break;
				case "in":
					amount = (float) (amount / 2.54); // cm -> in
					break;
				case "ft":
					amount = (float) (amount / 30.48); // cm -> ft
					break;
				case "yrds":
					amount = (float) (amount / 91.44); // cm -> yrds
					break;
				case "m":
					amount = (float) (amount / 100); // cm to m
					break;
				case "km":
					amount = (float) (amount / 100000);// cm to km
					break;
				case "mi":
					amount = (float) (amount / 160934);// cm to mi
					break;
				}
				break;
			case "in":
				switch (ititwo) {
				case "mm":
					amount = (float) (amount * 25.4);// in to mm
					break;
				case "cm":
					amount = (float) (amount * 2.54);// in to cm
					break;
				case "ft":
					amount = (float) (amount * 0.0833333);// in to ft
					break;
				case "yrds":
					amount = (float) (amount * 0.0277778);// in to yrds
					break;
				case "m":
					amount = (float) (amount * 0.0254);// in to m
					break;
				case "km":
					amount = (float) (amount * 0.0000254);// in to km
					break;
				case "mi":
					amount = (float) (amount * 0.00001578);// in to mi
					break;
				}
				break;
			case "ft":
				switch (ititwo) {
				case "mm":
					amount = (float) (amount * 304.8);// ft to mm
					break;
				case "cm":
					amount = (float) (amount * 30.48);// ft to cm
					break;
				case "in":
					amount = (float) (amount * 12);// ft to in
					break;
				case "ft":
					amount = (float) (amount * 0.333333);// ft to yrds
					break;
				case "m":
					amount = (float) (amount * 0.3048);// ft to m
					break;
				case "km":
					amount = (float) (amount * 0.0003048);// ft to km
					break;
				case "mi":
					amount = (float) (amount * 0.000189394);// ft to mi
					break;
				}
				break;
			case "yrds":
				switch (ititwo) {
				case "mm":
					amount = (float) (amount * 914.4);// yrds to mm
					break;
				case "cm":
					amount = (float) (amount * 91.44);// yrds to cm
					break;
				case "in":
					amount = (float) (amount * 36);// yrds to in
					break;
				case "ft":
					amount = (float) (amount * 3);// yrds to ft
					break;
				case "m":
					amount = (float) (amount * 0.9144);// yrds to m
					break;
				case "km":
					amount = (float) (amount * 0.0009144);// yrds to km
					break;
				case "mi":
					amount = (float) (amount * 0.000568182);// yrds to mi
					break;
				}
				break;
			case "m":
				switch (ititwo) {
				case "mm":
					amount = (float) (amount * 1000);// m to mm
					break;
				case "cm":
					amount = (float) (amount * 100);// m to cm
					break;
				case "in":
					amount = (float) (amount * 39.3701);// m to in
					break;
				case "ft":
					amount = (float) (amount * 3.28084);// m to ft
					break;
				case "yrds":
					amount = (float) (amount * 1.09361);// m to yrds
					break;
				case "km":
					amount = (float) (amount * 0.001);// m to km
					break;
				case "mi":
					amount = (float) (amount * 0.000621371);// m to mi
					break;
				}
				break;
			case "km":
				switch (ititwo) {
				case "mm":
					amount = (float) (amount * 1000000);// km to mm
					break;
				case "cm":
					amount = (float) (amount * 100000);// km to cm
					break;
				case "in":
					amount = (float) (amount * 39370.1);// km to in
					break;
				case "ft":
					amount = (float) (amount * 3280.84);// km to ft
					break;
				case "yrds":
					amount = (float) (amount * 1093.61);// km to yrds
					break;
				case "m":
					amount = (float) (amount * 1000);// km to m
					break;
				case "mi":
					amount = (float) (amount * 0.621371);// km to mi
					break;
				}
				break;
			case "mi":
				switch (ititwo) {
				case "mm":
					amount = (float) (amount * 1609344);// mi to mm
					break;
				case "cm":
					amount = (float) (amount * 160934);// mi to cm
					break;
				case "in":
					amount = (float) (amount * 63360);// mi to in
					break;
				case "ft":
					amount = (float) (amount * 5280);// mi to ft
					break;
				case "yrds":
					amount = (float) (amount * 1760);// mi to yrds
					break;
				case "m":
					amount = (float) (amount * 1609.34);// mi to m
					break;
				case "km":
					amount = (float) (amount * 1.60934);// mi to km
					break;
				}
				break;
			}

			System.out.println(amount + " " + unittwo);

		}

		// weight|mass

		else if (option == 2) {

			System.out.println();
			System.out.println("'oz'  :  ounces");
			System.out.println("'mg'  :  milligrams");
			System.out.println("'g'   :  grams");
			System.out.println("'kg'  :  kilograms");
			System.out.println("'lbs' :  pounds");
			System.out.println("'mt'  :  (metric) tons");
			System.out.println();

			System.out.println("Use the abbreviation that corresponds with each unit");

			System.out.println();

			System.out.println("Starting unit?");

			String ogo = sdcalc.next();

			while (!checkertwoweight(ogo)) {

				System.out.println();

				System.out.println("This unit is invalid");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException mate) {
					System.out.println(mate);
				}

				System.out.println("Enter a valid unit");

				try {
					Thread.sleep(500);
				} catch (InterruptedException mate) {
					System.out.println(mate);
				}

				System.out.println();

				System.out.println("Starting unit?");

				ogo = sdcalc.next();
			}

			System.out.println();

			System.out.println("Amount of first unit?");

			float amount = sdcalc.nextFloat();
			
			if (amount < 0) {
				negchecker = false;
				
				while (negchecker == false) {
					System.out.println();
					System.out.println("Impossible value");
					System.out.println();
					System.out.println("Enter a valid value");
					try {Thread.sleep(1000);
					} catch (InterruptedException e) {System.out.println(e);}
					System.out.println();
					System.out.println("Amount of first unit?");
					amount = sdcalc.nextFloat();
					if (amount >= 0) {
						negchecker = true;
					}
					else {}
				}

			}

			System.out.println();

			System.out.println("What unit are you converting to?");

			String ogotwo = sdcalc.next();

			while (!checkeroweight(ogotwo)) {

				System.out.println();

				System.out.println("This unit is invalid");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException mate) {
					System.out.println(mate);
				}

				System.out.println("Enter a valid unit");

				try {
					Thread.sleep(500);
				} catch (InterruptedException mate) {
					System.out.println(mate);
				}

				System.out.println();

				System.out.println("What unit are you converting to?");

				ogotwo = sdcalc.next();
			}

			System.out.print("\n\n");

			switch (ogo) {
			case "oz":
				unit = "ounces";
				break;

			case "mg":
				unit = "milligrams";
				break;

			case "g":
				unit = "grams";
				break;

			case "kg":
				unit = "kilograms";
				break;

			case "lbs":
				unit = "pounds";
				break;

			case "mt":
				unit = "tons";
				break;

			}

			switch (ogotwo) {
			case "oz":
				unittwo = "ounces";
				break;

			case "mg":
				unittwo = "milligrams";
				break;

			case "g":
				unittwo = "grams";
				break;

			case "kg":
				unittwo = "kilograms";
				break;

			case "lbs":
				unittwo = "pounds";
				break;

			case "mt":
				unittwo = "tons";
				break;
			}

			System.out.println(unit + " -> " + unittwo);
			System.out.println("\n\n" + amount + " " + unit + " = ? " + unittwo);

			switch (ogo) {
			case "oz":
				switch (ogotwo) {
				case "mg":
					amount = (float) amount * 28349.5f;
					break;

				case "g":
					amount = (float) amount * 28.3495f;
					break;

				case "kg":
					amount = (float) amount * 0.0283495f;
					break;

				case "lbs":
					amount = (float) amount * 0.0625f;
					break;

				case "mt":
					amount = (float) amount * 0.00002834952f;
				}
				break;
			case "mg":
				switch (ogotwo) {
				case "oz":
					amount = (float) amount * 0.00003527396f;
					break;

				case "g":
					amount = (float) amount * 0.001f;
					break;

				case "kg":
					amount = (float) amount * 0.000001000000f;
					break;

				case "lbs":
					amount = (float) amount * 0.0000022f;
					break;

				case "mt":
					amount = (float) amount * 0.000000001f;
					break;
				}
				break;
			case "g":
				switch (ogotwo) {
				case "oz":
					amount = (float) amount * 0.035274f;
					break;

				case "mg":
					amount = (float) amount * 1000f;
					break;

				case "kg":
					amount = (float) amount * 0.001f;
					break;

				case "lbs":
					amount = (float) amount * 0.00220462f;
					break;

				case "mt":
					amount = (float) amount * 0.000001f;
					break;
				}
				break;
			case "kg":
				switch (ogotwo) {
				case "oz":
					amount = (float) amount * 35.274f;
					break;

				case "mg":
					amount = (float) amount * 1000000f;
					break;

				case "g":
					amount = (float) amount * 1000f;
					break;

				case "lbs":
					amount = (float) amount * 2.20462f;
					break;

				case "mt":
					amount = (float) amount * 0.001f;
				}
				break;
			case "lbs":
				switch (ogotwo) {
				case "oz":
					amount = (float) amount * 16f;
					break;

				case "mg":
					amount = (float) amount * 453592f;
					break;

				case "g":
					amount = (float) amount * 453.592f;
					break;

				case "kg":
					amount = (float) amount * 0.453592f;
					break;

				case "mt":
					amount = (float) amount * 0.000453592f;
					break;
				}
				break;
			case "mt":
				switch (ogotwo) {
				case "oz":
					amount = (float) amount * 35274f;
					break;

				case "mg":
					amount = (float) amount * 1000000000f;
					break;

				case "g":
					amount = (float) amount * 1000000f;
					break;

				case "kg":
					amount = (float) amount * 1000f;
					break;

				case "lbs":
					amount = (float) amount * 2204.62f;
					break;
				}

			}

			System.out.println("\n");
			System.out.println(amount + " " + unittwo);
		}

		//time
		
		if (option == 3) {
			System.out.println();
			System.out.println("'ns'  : nanoseconds");
			System.out.println("'mcs' : microseconds");
			System.out.println("'ms'  : milliseconds");
			System.out.println("'sec' : seconds");
			System.out.println("'min' : minutes");
			System.out.println("'hr'  : hours");
			System.out.println("'day' : days");
			System.out.println("'wk'  : weeks");
			System.out.println("'mth' : months");
			System.out.println("'yr'  : years");
			System.out.println("'dd'  : decades");
			System.out.println("'ct'  : centuries");
			System.out.println("'ml'  : millenniums");
			System.out.println();

			System.out.println("Use the abbreviation that corresponds with each unit \n");

			System.out.println("Starting unit?");

			String timevar = sdcalc.next();

			while (!checkertwotime(timevar)) {

				System.out.println();

				System.out.println("This unit is invalid");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException mate) {
					System.out.println(mate);
				}

				System.out.println("Enter a valid unit");

				try {
					Thread.sleep(500);
				} catch (InterruptedException mate) {
					System.out.println(mate);
				}

				System.out.println();

				System.out.println("Starting unit?");

				timevar = sdcalc.next();
			}

			System.out.println();

			System.out.println("Amount of first unit?");

			float amount = sdcalc.nextFloat();
			
			if (amount < 0) {
				negchecker = false;
				
				while (negchecker == false) {
					System.out.println();
					System.out.println("Impossible value");
					System.out.println();
					System.out.println("Enter a valid value");
					try {Thread.sleep(1000);
					} catch (InterruptedException e) {System.out.println(e);}
					System.out.println();
					System.out.println("Amount of first unit?");
					amount = sdcalc.nextFloat();
					if (amount >= 0) {
						negchecker = true;
					}
					else {}
				}

			}

			System.out.println();

			System.out.println("What unit are you converting to?");

			String timevartwo = sdcalc.next();

			while (!checkerotime(timevartwo)) {

				System.out.println();

				System.out.println("This unit is invalid");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException mate) {
					System.out.println(mate);
				}

				System.out.println("Enter a valid unit");

				try {
					Thread.sleep(500);
				} catch (InterruptedException mate) {
					System.out.println(mate);
				}

				System.out.println();

				System.out.println("What unit are you converting to?");

				timevartwo = sdcalc.next();
			}

			System.out.println("\n");

			switch (timevar) {
			
			case "ns":
				unit = "nanoseconds";
				break;
			case "mcs":
				unit = "microseconds";
				break;
			case "ms":
				unit = "milliseconds";
				break;
			case "sec":
				unit = "seconds";
				break;
			case "min":
				unit = "minutes";
				break;
			case "hr":
				unit = "hours";
				break;
			case "day":
				unit = "days";
				break;
			case "wk":
				unit = "weeks";
				break;
			case "mth":
				unit = "months";
				break;
			case "yr":
				unit = "years";
				break;
			case "dd":
				unit = "decades";
				break;
			case "ct":
				unit = "centuries";
				break;
			case "ml":
				unit = "millenniums";
				break;
			
			}
			
			switch (timevartwo) {
			
			case "ns":
				unittwo = "nanoseconds";
				break;
			case "mcs":
				unittwo = "microseconds";
				break;
			case "ms":
				unittwo = "milliseconds";
				break;
			case "sec":
				unittwo = "seconds";
				break;
			case "min":
				unittwo = "minutes";
				break;
			case "hr":
				unittwo = "hours";
				break;
			case "day":
				unittwo = "days";
				break;
			case "wk":
				unittwo = "weeks";
				break;
			case "mth":
				unittwo = "months";
				break;
			case "yr":
				unittwo = "years";
				break;
			case "dd":
				unittwo = "decades";
				break;
			case "ct":
				unittwo = "centuries";
				break;
			case "ml":
				unittwo = "millenniums";
				break;
			
			}
			
			System.out.println(unit + " -> " + unittwo + "\n\n");
			System.out.println(amount + " " + unit + " = ? " + unittwo + "\n\n");
			
			switch (timevar) {
			case "ns":
				switch (timevartwo) {
				case "mcs":
					amount = amount * 0.001f;
					break;
				case "ms":
					amount = amount * 0.000001f;
					break;
				case "sec":
					amount = amount * 0.0000000001f;
					break;
				case "min":
					amount = amount * 0.0000000000166667f;
					break;
				case "hr":
					amount = amount * 0.000000000000277778f;
					break;
				case "day":
					amount = amount * 0.0000000000000115741f;
					break;
				case "wk":
					amount = amount * 0.00000000000000165344f;
					break;
				case "mth":
					amount = amount * 0.000000000000000380517f;
					break;
				case "yr":
					amount = amount * 0.0000000000000000317098f;
					break;
				case "dd":
					amount = amount * 0.00000000000000000317098f;
					break;
				case "ct":
					amount = amount * 0.000000000000000000317098f;
					break;
				case "ml":
					amount = amount * 0.0000000000000000000317098f;
					break;
				}

				break;

			case "mcs":
				switch (timevartwo) {
				case "ns":
					amount = amount * 1000f;
					break;
				case "ms":
					amount = amount * 0.001f;
					break;
				case "sec":
					amount = amount * 0.000001f;
					break;
				case "min":
					amount = amount * 0.0000000166667f;
					break;
				case "hr":
					amount = amount * 2.77778e-10f;
					break;
				case "day":
					amount = amount * 1.1574e-11f;
					break;
				case "wk":
					amount = amount * 1.65344e-12f;
					break;
				case "mth":
					amount = amount * 3.80517e-13f;
					break;
				case "yr":
					amount = amount * 3.17098e-14f;
					break;
				case "dd":
					amount = amount * 3.17098e-15f;
					break;
				case "ct":
					amount = amount * 3.17098e-16f;
					break;
				case "ml":
					amount = amount * 3.17098e-17f;

				}

				break;

			case "ms":
				switch (timevartwo) {
				case "ns":
					amount = amount * 1000000f;
					break;
				case "mcs":
					amount = amount * 1000f;
					break;
				case "sec":
					amount = amount * 0.001f;
					break;
				case "min":
					amount = amount * 1.6667e-5f;
					break;
				case "hr":
					amount = amount * 2.77778e-7f;
					break;
				case "day":
					amount = amount * 1.15741e-8f;
					break;
				case "wk":
					amount = amount * 1.65344e-9f;
					break;
				case "mth":
					amount = amount * 3.80517e-10f;
					break;
				case "yr":
					amount = amount * 3.17098e-11f;
					break;
				case "dd":
					amount = amount * 3.17098e-12f;
					break;
				case "ct":
					amount = amount * 3.17098e-13f;
					break;
				case "ml":
					amount = amount * 3.17098e-14f;
					break;
				}

				break;

			case "sec":
				switch (timevartwo) {
				case "ns":
					amount = amount * 1e+9f;
					break;
				case "mcs":
					amount = amount * 1000000f;
					break;
				case "ms":
					amount = amount * 1000f;
					break;
				case "min":
					amount = amount * 0.0166667f;
					break;
				case "hr":
					amount = amount * 0.000277778f;
					break;
				case "day":
					amount = amount * 1.15741e-5f;
					break;
				case "wk":
					amount = amount * 1.65344e-6f;
					break;
				case "mth":
					amount = amount * 3.80517e-7f;
					break;
				case "yr":
					amount = amount * 3.17098e-8f;
					break;
				case "dd":
					amount = amount * 3.17098e-9f;
					break;
				case "ct":
					amount = amount * 3.17098e-10f;
					break;
				case "ml":
					amount = amount * 3.17098e-11f;
					break;

				}

				break;

			case "min":
				switch (timevartwo) {
				case "ns":
					amount = amount * 6e+10f;
					break;
				case "mcs":
					amount = amount * 6e+7f;
					break;
				case "ms":
					amount = amount * 60000f;
					break;
				case "sec":
					amount = amount * 60f;
					break;
				case "hr":
					amount = amount * 0.0166667f;
					break;
				case "day":
					amount = amount * 0.000694444f;
					break;
				case "wk":
					amount = amount * 9.92063e-5f;
					break;
				case "mth":
					amount = amount * 2.2831e-5f;
					break;
				case "yr":
					amount = amount * 1.90259e-6f;
					break;
				case "dd":
					amount = amount * 1.90259e-7f;
					break;
				case "ct":
					amount = amount * 1.90259e-8f;
					break;
				case "ml":
					amount = amount * 1.90259e-9f;

				}

				break;

			case "hr":
				switch (timevartwo) {
				case "ns":
					amount = amount * 3.6e+12f;
					break;
				case "mcs":
					amount = amount * 3.6e+9f;
					break;
				case "ms":
					amount = amount * 3.6e+6f;
					break;
				case "sec":
					amount = amount * 3600f;
					break;
				case "min":
					amount = amount * 60f;
					break;
				case "day":
					amount = amount * 0.0416667f;
					break;
				case "wk":
					amount = amount * 0.00595238f;
					break;
				case "mth":
					amount = amount * 0.00136986f;
					break;
				case "yr":
					amount = amount * 0.000114155f;
					break;
				case "dd":
					amount = amount * 1.14155e-5f;
					break;
				case "ct":
					amount = amount * 1.14155e-6f;
					break;
				case "ml":
					amount = amount * 1.14155e-7f;
					break;

				}

				break;
			case "day":
				switch (timevartwo) {
				case "ns":
					amount = amount * 8.64e+13f;
					break;
				case "mcs":
					amount = amount * 8.64e+10f;
					break;
				case "ms":
					amount = amount * 8.64e+7f;
					break;
				case "sec":
					amount = amount * 86400f;
					break;
				case "min":
					amount = amount * 1440f;
					break;
				case "hr":
					amount = amount * 24f;
					break;
				case "wk":
					amount = amount * 0.142857f;
					break;
				case "mth":
					amount = amount * 0.0328767f;
					break;
				case "yr":
					amount = amount * 0.00273973f;
					break;
				case "dd":
					amount = amount * 0.000273973f;
					break;
				case "ct":
					amount = amount * 2.73973e-5f;
					break;
				case "ml":
					amount = amount * 2.73973e-6f;
					break;
				}

				break;

			case "wk":
				switch (timevartwo) {
				case "ns":
					amount = amount * 6.048e+14f;
					break;
				case "mcs":
					amount = amount * 6.048e+11f;
					break;
				case "ms":
					amount = amount * 6.048e+8f;
					break;
				case "sec":
					amount = amount * 604800f;
					break;
				case "min":
					amount = amount * 10080f;
					break;
				case "hr":
					amount = amount * 168f;
					break;
				case "day":
					amount = amount * 7f;
					break;
				case "mth":
					amount = amount * 0.230137f;
					break;
				case "yr":
					amount = amount * 0.0191781f;
					break;
				case "dd":
					amount = amount * 0.00191781f;
					break;
				case "ct":
					amount = amount * 0.000191781f;
					break;
				case "ml":
					amount = amount * 1.91781e-5f;
					break;

				}

				break;

			case "mth":
				switch (timevartwo) {
				case "ns":
					amount = amount * 2.628e+15f;
					break;
				case "mcs":
					amount = amount * 2.628e+12f;
					break;
				case "ms":
					amount = amount * 2.628e+9f;
					break;
				case "sec":
					amount = amount * 2.628e+6f;
					break;
				case "min":
					amount = amount * 43800f;
					break;
				case "hr":
					amount = amount * 730.001f;
					break;
				case "day":
					amount = amount * 30.4167f;
					break;
				case "wk":
					amount = amount * 4.34524f;
					break;
				case "yr":
					amount = amount * 0.0833334f;
					break;
				case "dd":
					amount = amount * 0.00833334f;
					break;
				case "ct":
					amount = amount * 0.000833334f;
					break;
				case "ml":
					amount = amount * 8.33334e-5f;
					break;

				}

				break;

			case "yr":
				switch (timevartwo) {
				case "ns":
					amount = amount * 3.154e+16f;
					break;
				case "mcs":
					amount = amount * 3.154e+13f;
					break;
				case "ms":
					amount = amount * 3.154e+10f;
					break;
				case "sec":
					amount = amount * 3.154e+7f;
					break;
				case "min":
					amount = amount * 525600f;
					break;
				case "hr":
					amount = amount * 8760f;
					break;
				case "day":
					amount = amount * 365f;
					break;
				case "wk":
					amount = amount * 52.1429f;
					break;
				case "mth":
					amount = amount * 12f;
					break;
				case "dd":
					amount = amount * 0.1f;
					break;
				case "ct":
					amount = amount * 0.01f;
					break;
				case "ml":
					amount = amount * 0.001f;
					break;

				}

				break;

			case "dd":
				switch (timevartwo) {
				case "ns":
					amount = amount * 3.154e+17f;
					break;
				case "mcs":
					amount = amount * 3.154e+14f;
					break;
				case "ms":
					amount = amount * 3.154e+11f;
					break;
				case "sec":
					amount = amount * 3.154e+8f;
					break;
				case "min":
					amount = amount * 5.256e+6f;
					break;
				case "hr":
					amount = amount * 87600f;
					break;
				case "day":
					amount = amount * 3650f;
					break;
				case "wk":
					amount = amount * 521.429f;
					break;
				case "mth":
					amount = amount * 120f;
					break;
				case "yr":
					amount = amount * 10f;
					break;
				case "ct":
					amount = amount * 0.1f;
					break;
				case "ml":
					amount = amount * 0.01f;
					break;

				}

				break;

			case "ct":
				switch (timevartwo) {
				case "ns":
					amount = amount * 3.154e+18f;
					break;
				case "mcs":
					amount = amount * 3.154e+15f;
					break;
				case "ms":
					amount = amount * 3.154e+12f;
					break;
				case "sec":
					amount = amount * 3.154e+9f;
					break;
				case "min":
					amount = amount * 5.256e+7f;
					break;
				case "hr":
					amount = amount * 876000f;
					break;
				case "day":
					amount = amount * 36500f;
					break;
				case "wk":
					amount = amount * 5214.29f;
					break;
				case "mth":
					amount = amount * 1200f;
					break;
				case "yr":
					amount = amount * 100f;
					break;
				case "dd":
					amount = amount * 10f;
					break;
				case "ml":
					amount = amount * 0.1f;
					break;

				}

				break;

			case "ml":
				switch (timevartwo) {
				case "ns":
					amount = amount * 3.154e+19f;
					break;
				case "mcs":
					amount = amount * 3.154e+16f;
					break;
				case "ms":
					amount = amount * 3.154e+13f;
					break;
				case "sec":
					amount = amount * 3.154e+10f;
					break;
				case "min":
					amount = amount * 5.256e+8f;
					break;
				case "hr":
					amount = amount * 8.76e+6f;
					break;
				case "day":
					amount = amount * 365000f;
					break;
				case "wk":
					amount = amount * 52142.9f;
					break;
				case "mth":
					amount = amount * 12000f;
					break;
				case "yr":
					amount = amount * 1000f;
					break;
				case "dd":
					amount = amount * 100f;
					break;
				case "ct":
					amount = amount * 10f;
					break;

				}

				break;

			}

			System.out.println(amount + " " + unittwo);

		}

	}

	public static boolean checkertwodistance(String iti) {

		if (Arrays.asList(checkerdistance).contains(iti)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkerodistance(String ititwo) {

		if (Arrays.asList(checkerdistance).contains(ititwo)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkertwoweight(String ogo) {

		if (Arrays.asList(checkerweight).contains(ogo)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkeroweight(String ogotwo) {
		if (Arrays.asList(checkerweight).contains(ogotwo)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkertwotime(String timevar) {
		if (Arrays.asList(checkertime).contains(timevar)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkerotime(String timevartwo) {
		if (Arrays.asList(checkertime).contains(timevartwo)) {
			return true;
		} else {
			return false;
		}
	}
}

/*
 * TODO: cancel negative numbers, let user re-enter unit if it is invalid Divide
 * code into methods so it is smaller and easier to follow
 */
/// (finish/fix)
