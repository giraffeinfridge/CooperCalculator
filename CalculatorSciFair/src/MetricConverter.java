import java.util.Scanner;
public class MetricConverter {

	public static void main(String[] args) {
		
		Scanner sdcalc = new Scanner (System.in);
			
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
			
			if (distanceop == 1) {System.out.println(); System.out.print("millimeters"); unit = "mm";}
			else if (distanceop == 2) {System.out.println(); System.out.print("centimeters"); unit = "cm";}
			else if (distanceop == 3) {System.out.println(); System.out.print("inches"); unit = "in";}
			else if (distanceop == 4) {System.out.println(); System.out.print("feet"); unit = "ft";}
			else if (distanceop == 5) {System.out.println(); System.out.print("yards"); unit = "yrds";}
			else if (distanceop == 6) {System.out.println(); System.out.print("meters"); unit = "m";}
			else if (distanceop == 7) {System.out.println(); System.out.print("kilometers"); unit = "km";}
			else if (distanceop == 8) {System.out.println(); System.out.print("miles"); unit = "mi";}
			
			System.out.print(" -> ");
			
			if (distanceoptwo == 1) {System.out.print("millimeters"); unittwo = "mm";}
			else if (distanceoptwo == 2) {System.out.print("centimeters"); unittwo = "cm";}
			else if (distanceoptwo == 3) {System.out.print("inches"); unittwo = "in";}
			else if (distanceoptwo == 4) {System.out.print("feet"); unittwo = "ft";}
			else if (distanceoptwo == 5) {System.out.print("yards"); unittwo = "yrds";}
			else if (distanceoptwo == 6) {System.out.print("meters"); unittwo = "m";}
			else if (distanceoptwo == 7) {System.out.print("kilometers"); unittwo = "km";}
			else if (distanceoptwo == 8) {System.out.print("miles"); unittwo = "mi";}
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println(amount + " " + unit + " = ? " + unittwo);
			
			try {
				Thread.sleep(1000);
			}	catch(InterruptedException balls) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println();
			
			if (distanceop == distanceoptwo) {System.out.println("They are the same unit");}
			
			System.out.println();
			
			if (distanceop == 1 && distanceoptwo == 2) {amount = (float) amount/10;}					///mm to cm
			else if (distanceop == 1 && distanceoptwo == 3){amount = (float) (amount/25.4);}			///mm to in
			else if (distanceop == 1 && distanceoptwo == 4){amount = (float) (amount/304.8);}			///mm to ft
			else if (distanceop == 1 && distanceoptwo == 5){amount = (float) (amount/914.4);}			///mm to yrds
			else if (distanceop == 1 && distanceoptwo == 6){amount = (float) (amount/1000);}			///mm to m
			else if (distanceop == 1 && distanceoptwo == 7){amount = (float) (amount/100000);}			///mm to km
			else if (distanceop == 1 && distanceoptwo == 8){amount = (float) (amount/1609344);}			///mm to mi
			else if (distanceop == 2 && distanceoptwo == 1){amount = (float) (amount * 10);} 			///cm to mm
			else if (distanceop == 2 && distanceoptwo == 3){amount = (float) (amount/2.54);}			///cm to in
			else if (distanceop == 2 && distanceoptwo == 4){amount = (float) (amount/30.48);}			///cm to ft
			else if (distanceop == 2 && distanceoptwo == 5){amount = (float) (amount/91.44);}			///cm to yrds
			else if (distanceop == 2 && distanceoptwo == 6){amount = (float) (amount/100);}				///cm to m
			else if (distanceop == 2 && distanceoptwo == 7){amount = (float) (amount/100000);}			///cm to km
			else if (distanceop == 2 && distanceoptwo == 8){amount = (float) (amount/160934);}			///cm to mi
			else if (distanceop == 3 && distanceoptwo == 1){amount = (float) (amount * 25.4);}			///in to mm
			else if (distanceop == 3 && distanceoptwo == 2){amount = (float) (amount * 2.54);}			///in to cm
			else if (distanceop == 3 && distanceoptwo == 4){amount = (float) (amount * 0.0833333);}		///in to ft
			else if (distanceop == 3 && distanceoptwo == 5){amount = (float) (amount * 0.0277778);}		///in to yrds
			else if (distanceop == 3 && distanceoptwo == 6){amount = (float) (amount * 0.0254);}		///in to m
			else if (distanceop == 3 && distanceoptwo == 7){amount = (float) (amount * 0.0000254);}		///in to km
			else if (distanceop == 3 && distanceoptwo == 8){amount = (float) (amount * 0.00001578);}	///in to mi
			else if (distanceop == 4 && distanceoptwo == 1){amount = (float) (amount * 304.8);}			///ft to mm
			else if (distanceop == 4 && distanceoptwo == 2){amount = (float) (amount * 30.48);}			///ft to cm
			else if (distanceop == 4 && distanceoptwo == 3){amount = (float) (amount * 12);}			///ft to in
			else if (distanceop == 4 && distanceoptwo == 5){amount = (float) (amount * 0.333333);}		///ft to yrds
			else if (distanceop == 4 && distanceoptwo == 6){amount = (float) (amount * 0.3048);}		///ft to m
			else if (distanceop == 4 && distanceoptwo == 7){amount = (float) (amount * 0.0003048);}		///ft to km
			else if (distanceop == 4 && distanceoptwo == 8){amount = (float) (amount * 0.000189394);}	///ft to mi
			else if (distanceop == 5 && distanceoptwo == 1){amount = (float) (amount * 914.4);}			///yrds to mm
			else if (distanceop == 5 && distanceoptwo == 2){amount = (float) (amount * 91.44);}			///yrds to cm
			else if (distanceop == 5 && distanceoptwo == 3){amount = (float) (amount * 36);}			///yrds to in
			else if (distanceop == 5 && distanceoptwo == 4){amount = (float) (amount * 3);}				///yrds to ft
			else if (distanceop == 5 && distanceoptwo == 6){amount = (float) (amount * 0.9144);}		///yrds to m
			else if (distanceop == 5 && distanceoptwo == 7){amount = (float) (amount * 0.0009144);}		///yrds to km
			else if (distanceop == 5 && distanceoptwo == 8){amount = (float) (amount * 0.000568182);}	///yrds to mi
			else if (distanceop == 6 && distanceoptwo == 1){amount = (float) (amount * 1000);}			///m to mm
			else if (distanceop == 6 && distanceoptwo == 2){amount = (float) (amount * 100);}			///m to cm
			else if (distanceop == 6 && distanceoptwo == 3){amount = (float) (amount * 39.3701);}		///m to in
			else if (distanceop == 6 && distanceoptwo == 4){amount = (float) (amount * 3.28084);}		///m to ft
			else if (distanceop == 6 && distanceoptwo == 6){amount = (float) (amount * 1.09361);}		///m to yrds
			else if (distanceop == 6 && distanceoptwo == 7){amount = (float) (amount * 0.001);}			///m to km
			else if (distanceop == 6 && distanceoptwo == 8){amount = (float) (amount * 0.000621371);}	///m to mi
			else if (distanceop == 7 && distanceoptwo == 1){amount = (float) (amount * 1000000);}		///km to mm
			else if (distanceop == 7 && distanceoptwo == 2){amount = (float) (amount * 100000);}		///km to cm
			else if (distanceop == 7 && distanceoptwo == 3){amount = (float) (amount * 39370.1);}		///km to in
			else if (distanceop == 7 && distanceoptwo == 4){amount = (float) (amount * 3280.84);}		///km to ft
			else if (distanceop == 7 && distanceoptwo == 5){amount = (float) (amount * 1093.61);}		///km to yrds
			else if (distanceop == 7 && distanceoptwo == 6){amount = (float) (amount * 1000);}			///km to m
			else if (distanceop == 7 && distanceoptwo == 8){amount = (float) (amount * 0.621371);}		///km to mi
			else if (distanceop == 8 && distanceoptwo == 1){amount = (float) (amount * 1609344);}		///mi to mm
			else if (distanceop == 8 && distanceoptwo == 2){amount = (float) (amount * 160934);}		///mi to cm
			else if (distanceop == 8 && distanceoptwo == 3){amount = (float) (amount * 63360);}			///mi to in
			else if (distanceop == 8 && distanceoptwo == 4){amount = (float) (amount * 5280);}			///mi to ft
			else if (distanceop == 8 && distanceoptwo == 5){amount = (float) (amount * 1760);}			///mi to yrds
			else if (distanceop == 8 && distanceoptwo == 6){amount = (float) (amount * 1609.34);}		///mi to m
			else if (distanceop == 8 && distanceoptwo == 7){amount = (float) (amount * 1.60934);}		///mi to km
			
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
			
			switch (weightop)
				{
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
			
			switch (weightoptwo)
			{
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
			
			switch(weightop)
				{
					case 1:
						switch(weightoptwo)
						{
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
						switch(weightoptwo)
						{
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
				}
			
			
			
			}
		
		
			
			
			
			}
			
			

		}

	
	
		
		

	


