
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MetricConverter {

	///this program is fucking me in the asshole
	
	/// public static String iti = null;
//
	/// public String ititwo = null;
	
	public static String[] checker = { "mm", "cm", "in", "ft", "yrds", "m", "km", "mi" };

	public static void main(String[] args) {

		Scanner sdcalc = new Scanner(System.in);

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
		System.out.println("Enter '4' for volume conversion");
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

			System.out.println("Use the abbreviation that corresponds with each unit");
			
			System.out.println("Starting unit?");

			iti = sdcalc.next();

			while (!checkertwo(iti)) {
				

				System.out.println();

				System.out.println("Starting unit?");

				iti = sdcalc.next();
			}

			/*
			 * if (iti!=checker[1] || iti!=checker[2] || iti!=checker[3] ||
			 * iti!=checker[4] || iti!=checker[5] || iti!=checker[6] ||
			 * iti!=checker[7] || iti!=checker[8]); {
			 * 
			 * while (iti!=checker[1] || iti!=checker[2] || iti!=checker[3] ||
			 * iti!=checker[4] || iti!=checker[5] || iti!=checker[6] ||
			 * iti!=checker[7] || iti!=checker[8]); {
			 * 
			 * System.out.println(); System.out.println("This unit is invalid");
			 * 
			 * try { Thread.sleep(1000); } catch (InterruptedException mate)
			 * {System.out.println(mate);}
			 * 
			 * System.out.println();
			 * 
			 * System.out.println("Please enter a valid unit name");
			 * 
			 * try { Thread.sleep(1000); } catch (InterruptedException mate)
			 * {System.out.println(mate);}
			 * 
			 * System.out.println();
			 * 
			 * System.out.println();
			 * 
			 * System.out.println();
			 * 
			 * System.out.println("Starting unit?");
			 * 
			 * iti = sdcalc.next(); }
			 */

			System.out.println();

			System.out.println("Amount of first unit?");

			float amount = sdcalc.nextFloat();

			System.out.println();

			System.out.println("What unit are you converting to?");

			String ititwo = sdcalc.next();

			if (ititwo != checker[1] || ititwo != checker[2] || ititwo != checker[3] || ititwo != checker[4]
					|| ititwo != checker[5] || ititwo != checker[6] || ititwo != checker[7] || ititwo != checker[8])
				;
			{
				System.out.println();
				System.out.println("This unit is invalid");
			}

			System.out.println();

			switch (iti) {
			case "mm":
				System.out.print("\nmillimeters");
				unit = "mm";
				break;
			case "cm":
				System.out.print("\ncentimeters");
				unit = "cm";
				break;
			case "in":
				System.out.print("\ninches");
				unit = "in";
				break;
			case "ft":
				System.out.print("\nfeet");
				unit = "ft";
				break;
			case "yrds":
				System.out.print("\nyards");
				unit = "yrds";
				break;
			case "m":
				System.out.print("\nmeters");
				unit = "m";
				break;
			case "km":
				System.out.print("\nkilometers");
				unit = "km";
				break;
			case "mi":
				System.out.print("\nmiles");
				unit = "mi";
				break;
			}

			System.out.print(" -> ");

			switch (ititwo) {
			case "mm":
				System.out.print("millimeters");
				unittwo = "mm";
				break;
			case "cm":
				System.out.print("centimeters");
				unittwo = "cm";
				break;
			case "in":
				System.out.print("inches");
				unittwo = "in";
				break;
			case "ft":
				System.out.print("feet");
				unittwo = "ft";
				break;
			case "yrds":
				System.out.print("yards");
				unittwo = "yrds";
				break;
			case "m":
				System.out.print("meters");
				unittwo = "m";
				break;
			case "km":
				System.out.print("kilometers");
				unittwo = "km";
				break;
			case "mi":
				System.out.print("miles");
				unit = "mi";
				break;
			}

			System.out.println("\n\n\n");

			System.out.println(amount + " " + unit + " = ? " + unittwo);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException balls) {
				Thread.currentThread().interrupt();
			}

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

			System.out.println();

			System.out.println("Amount of first unit?");

			float amount = sdcalc.nextFloat();

			System.out.println();

			System.out.println("What unit are you converting to?");

			String ogotwo = sdcalc.next();

			System.out.println();

			System.out.println();

			switch (ogo) {
			case "oz":
				unit = "oz";
				System.out.println("ounces");
				break;

			case "mg":
				unit = "mg";
				System.out.println("milligrams");
				break;

			case "g":
				unit = "g";
				System.out.println("grams");
				break;

			case "kg":
				unit = "kg";
				System.out.println("kilograms");
				break;

			case "lbs":
				unit = "lbs";
				System.out.println("lbs");
				break;

			case "mt":
				unit = "tons";
				System.out.println("(metric) tons");
				break;
			}

			System.out.println();
			System.out.println("to");
			System.out.println();

			switch (ogotwo) {
			case "oz":
				unittwo = "oz";
				System.out.println("ounces");
				break;

			case "mg":
				unittwo = "mg";
				System.out.println("milligrams");
				break;

			case "g":
				unittwo = "g";
				System.out.println("grams");
				break;

			case "kg":
				unittwo = "kg";
				System.out.println("kilograms");
				break;

			case "lbs":
				unittwo = "lbs";
				System.out.println("lbs");
				break;

			case "mt":
				unittwo = "tons";
				System.out.println("(metric) tons");
				break;
			}

			System.out.println();
			System.out.println();
			System.out.println();

			System.out.println(amount + " " + unit + " = ? " + unittwo);

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

			System.out.println();
			System.out.println();
			System.out.println();

			System.out.println(amount + " " + unittwo);

		}

	}

	public static boolean checkertwo(String iti) {
		
		if(Arrays.asList(checker).contains(iti)){
			return true;
		}else{
			return false;
		}
	}
}

/* TODO: cancel negative numbers, let user re-enter unit if it is invalid
 * 		 Divide code into methods so it is smaller and easier to follow
 */
/// (finish/fix)
