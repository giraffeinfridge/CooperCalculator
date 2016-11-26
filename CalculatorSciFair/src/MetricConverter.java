import java.util.Scanner;

public class MetricConverter {

	public static void main(String[] args) {

		Scanner sdcalc = new Scanner(System.in);

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
			System.out.println("'1' : millimeters");
			System.out.println("'2' : centimeters");
			System.out.println("'3' : inches");
			System.out.println("'4' : feet");
			System.out.println("'5' : yards");
			System.out.println("'6' : meters");
			System.out.println("'7' : kilometers");
			System.out.println("'8' : miles");
			System.out.println();

			System.out.println("Use the number that corresponds with each unit");

			System.out.println();

			System.out.println("Starting unit?");

			int distanceop = sdcalc.nextInt();

			System.out.println();

			System.out.println("Amount of first unit?");

			float amount = sdcalc.nextFloat();

			System.out.println();

			System.out.println("What unit are you converting to?");

			int distanceoptwo = sdcalc.nextInt();

			System.out.println();

			switch (distanceop) {
			case 1:
				System.out.print("\nmillimeters");
				unit = "mm";
				break;
			case 2:
				System.out.print("\ncentimeters");
				unit = "cm";
				break;
			case 3:
				System.out.print("\ninches");
				unit = "in";
				break;
			case 4:
				System.out.print("\nfeet");
				unit = "ft";
				break;
			case 5:
				System.out.print("\nyards");
				unit = "yrds";
				break;
			case 6:
				System.out.print("\nmeters");
				unit = "m";
				break;
			case 7:
				System.out.print("\nkilometers");
				unit = "km";
				break;
			case 8:
				System.out.print("\nmiles");
				unit = "mi";
				break;
			}

			System.out.print(" -> ");

			switch (distanceoptwo) {
			case 1:
				System.out.print("millimeters");
				unittwo = "mm";
				break;
			case 2:
				System.out.print("centimeters");
				unittwo = "cm";
				break;
			case 3:
				System.out.print("inches");
				unittwo = "in";
				break;
			case 4:
				System.out.print("feet");
				unittwo = "ft";
				break;
			case 5:
				System.out.print("yards");
				unittwo = "yrds";
				break;
			case 6:
				System.out.print("meters");
				unittwo = "m";
				break;
			case 7:
				System.out.print("kilometers");
				unittwo = "km";
				break;
			case 8:
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

			if (distanceop == distanceoptwo) {
				System.out.println("They are the same unit");
			}

			System.out.println();

			switch (distanceop) {
			case 1:
				switch (distanceoptwo) {
				case 2:
					amount = (float) amount / 10; // mm -> cm
					break;
				case 3:
					amount = (float) (amount / 25.4); // mm -> in
					break;
				case 4:
					amount = (float) (amount / 304.8); // mm -> ft
					break;
				case 5:
					amount = (float) (amount / 914.4); // mm -> yards
					break;
				case 6:
					amount = (float) (amount / 1000); // mm -> m
					break;
				case 7:
					amount = (float) (amount / 100000); // mm -> km
					break;
				case 8:
					amount = (float) (amount / 1609344); // mm -> mi
					break;
				}
				break;
			case 2:
				switch (distanceoptwo) {
				case 1:
					amount = (float) (amount * 10); // cm -> mm
					break;
				case 3:
					amount = (float) (amount / 2.54); // cm -> in
					break;
				case 4:
					amount = (float) (amount / 30.48); // cm -> ft
					break;
				case 5:
					amount = (float) (amount / 91.44); // cm -> yrds
					break;
				case 6:
					amount = (float) (amount / 100); // cm to m
					break;
				case 7:
					amount = (float) (amount / 100000);// cm to km
					break;
				case 8:
					amount = (float) (amount / 160934);// cm to mi
					break;
				}
				break;
			case 3:
				switch (distanceoptwo) {
				case 1:
					amount = (float) (amount * 25.4);// in to mm
					break;
				case 2:
					amount = (float) (amount * 2.54);// in to cm
					break;
				case 4:
					amount = (float) (amount * 0.0833333);// in to ft
					break;
				case 5:
					amount = (float) (amount * 0.0277778);// in to yrds
					break;
				case 6:
					amount = (float) (amount * 0.0254);// in to m
					break;
				case 7:
					amount = (float) (amount * 0.0000254);// in to km
					break;
				case 8:
					amount = (float) (amount * 0.00001578);// in to mi
					break;
				}
				break;
			case 4:
				switch (distanceoptwo) {
				case 1:
					amount = (float) (amount * 304.8);// ft to mm
					break;
				case 2:
					amount = (float) (amount * 30.48);// ft to cm
					break;
				case 3:
					amount = (float) (amount * 12);// ft to in
					break;
				case 5:
					amount = (float) (amount * 0.333333);// ft to yrds
					break;
				case 6:
					amount = (float) (amount * 0.3048);// ft to m
					break;
				case 7:
					amount = (float) (amount * 0.0003048);// ft to km
					break;
				case 8:
					amount = (float) (amount * 0.000189394);// ft to mi
					break;
				}
				break;
			case 5:
				switch (distanceoptwo) {
				case 1:
					amount = (float) (amount * 914.4);// yrds to mm
					break;
				case 2:
					amount = (float) (amount * 91.44);// yrds to cm
					break;
				case 3:
					amount = (float) (amount * 36);// yrds to in
					break;
				case 4:
					amount = (float) (amount * 3);// yrds to ft
					break;
				case 6:
					amount = (float) (amount * 0.9144);// yrds to m
					break;
				case 7:
					amount = (float) (amount * 0.0009144);// yrds to km
					break;
				case 8:
					amount = (float) (amount * 0.000568182);// yrds to mi
					break;
				}
				break;
			case 6:
				switch (distanceoptwo) {
				case 1:
					amount = (float) (amount * 1000);// m to mm
					break;
				case 2:
					amount = (float) (amount * 100);// m to cm
					break;
				case 3:
					amount = (float) (amount * 39.3701);// m to in
					break;
				case 4:
					amount = (float) (amount * 3.28084);// m to ft
					break;
				case 5:
					amount = (float) (amount * 1.09361);// m to yrds
					break;
				case 7:
					amount = (float) (amount * 0.001);// m to km
					break;
				case 8:
					amount = (float) (amount * 0.000621371);// m to mi
					break;
				}
				break;
			case 7:
				switch (distanceoptwo) {
				case 1:
					amount = (float) (amount * 1000000);// km to mm
					break;
				case 2:
					amount = (float) (amount * 100000);// km to cm
					break;
				case 3:
					amount = (float) (amount * 39370.1);// km to in
					break;
				case 4:
					amount = (float) (amount * 3280.84);// km to ft
					break;
				case 5:
					amount = (float) (amount * 1093.61);// km to yrds
					break;
				case 6:
					amount = (float) (amount * 1000);// km to m
					break;
				case 8:
					amount = (float) (amount * 0.621371);// km to mi
					break;
				}
				break;
			case 8:
				switch (distanceoptwo) {
				case 1:
					amount = (float) (amount * 1609344);// mi to mm
					break;
				case 2:
					amount = (float) (amount * 160934);// mi to cm
					break;
				case 3:
					amount = (float) (amount * 63360);// mi to in
					break;
				case 4:
					amount = (float) (amount * 5280);// mi to ft
					break;
				case 5:
					amount = (float) (amount * 1760);// mi to yrds
					break;
				case 6:
					amount = (float) (amount * 1609.34);// mi to m
					break;
				case 7:
					amount = (float) (amount * 1.60934);// mi to km
					break;
				}
				break;
			}

			System.out.println(amount + " " + unittwo);

		}

		else if (option == 2) {

			System.out.println();
			System.out.println("'1' : ounces");
			System.out.println("'2' : milligrams");
			System.out.println("'3' : grams");
			System.out.println("'4' : kilograms");
			System.out.println("'5' : lbs");
			System.out.println("'6' : newtons");
			System.out.println("'7' : (metric) tons");
			System.out.println();

			System.out.println("Use the number that corresponds with each unit");

			System.out.println();

			System.out.println("Starting unit?");

			int weightop = sdcalc.nextInt();

			System.out.println();

			System.out.println("Amount of first unit?");

			float amount = sdcalc.nextFloat();

			System.out.println();

			System.out.println("What unit are you converting to?");

			int weightoptwo = sdcalc.nextInt();

			System.out.println();

			System.out.println();

			switch (weightop) {
			case 1:
				unit = "oz";
				System.out.println("ounces");
				break;

			case 2:
				unit = "mg";
				System.out.println("milligrams");
				break;

			case 3:
				unit = "g";
				System.out.println("grams");
				break;

			case 4:
				unit = "kg";
				System.out.println("kilograms");
				break;

			case 5:
				unit = "lbs";
				System.out.println("lbs");
				break;

			case 6:
				unit = "N";
				System.out.println("newtons");
				break;

			case 7:
				unit = "tons";
				System.out.println("(metric) tons");
				break;
			}

			System.out.println();
			System.out.println("to");
			System.out.println();

			switch (weightoptwo) {
			case 1:
				unittwo = "oz";
				System.out.println("ounces");
				break;

			case 2:
				unittwo = "mg";
				System.out.println("milligrams");
				break;

			case 3:
				unittwo = "g";
				System.out.println("grams");
				break;

			case 4:
				unittwo = "kg";
				System.out.println("kilograms");
				break;

			case 5:
				unittwo = "lbs";
				System.out.println("lbs");
				break;

			case 6:
				unittwo = "N";
				System.out.println("newtons");
				break;

			case 7:
				unittwo = "tons";
				System.out.println("(metric) tons");
				break;
			}

			System.out.println();
			System.out.println();
			System.out.println();

			System.out.println(amount + " " + unit + " = ? " + unittwo);

			switch (weightop) {
			case 1:
				switch (weightoptwo) {
				case 2:
					amount = (float) amount * 28349.5f;
					break;

				case 3:
					amount = (float) amount * 28.3495f;
					break;

				case 4:
					amount = (float) amount * 0.0283495f;
					break;

				case 5:
					amount = (float) amount * 0.0625f;
					break;

				case 6:
					amount = (float) amount * 0.28f;
					break;

				case 7:
					amount = (float) amount * 0.00002834952f;
				}
				break;
			case 2:
				switch (weightoptwo) {
				case 1:
					amount = (float) amount * 0.00003527396f;
					break;

				case 3:
					amount = (float) amount * 0.001f;
					break;

				case 4:
					amount = (float) amount * 0.000001000000f;
					break;

				case 5:
					amount = (float) amount * 0.0000022f;
					break;

				case 6:
					amount = (float) amount * 0.0000098f;
					break;

				case 7:
					amount = (float) amount * 0.000000001f;
					break;
				}
				break;
			case 3:
				switch (weightoptwo) {
				case 1:
					amount = (float) amount * 0.035274f;
					break;

				case 2:
					amount = (float) amount * 1000f;
					break;

				case 4:
					amount = (float) amount * 0.001f;
					break;

				case 5:
					amount = (float) amount * 0.00220462f;
					break;

				case 6:
					amount = (float) amount * 0.00980665f;
					break;

				case 7:
					amount = (float) amount * 0.000001f;
					break;
				}
				break;

			}

			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println(amount + " " + unittwo);

		}

	}

}
