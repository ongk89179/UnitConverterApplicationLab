//Kevin Ong
//UnitConverterApplications
//6-25-2021

import java.util.Scanner;
//Scanner function import

public class Menu {

	public static void main(String[] args) {
		int MenuSelect = 0; //Creates Menu Select Variable.
		
		Scanner myScanner = new Scanner(System.in); //Makes scanner and userinput work
		Menu menuOptions = new Menu(); //Creates menu object

		do { //do while to force at least 1 menu - menu select
			System.out.println("Menu \n 1. Volume Conversions \n 2. Distance Conversions \n 3. Weight Conversion \n 4. Duck Conversion \n 5.Exit");
			MenuSelect = myScanner.nextInt();
			switch(MenuSelect) {
			
			case 1: //Volume Conversion Prompt
				volumeConversionMenu(MenuSelect, myScanner, menuOptions);
				break;
			case 2:	//Distance Conversion Prompt
				distanceConversionMenu(MenuSelect, myScanner, menuOptions);
				break;
			case 3: //Weight Conversion Prompt
				weightConversionMenu(MenuSelect, myScanner, menuOptions);
				break;
			case 4: //Duck Conversion Prompt
				duckConversionMenu(MenuSelect, myScanner, menuOptions);
				break;
			case 5:	//Break
				break;
			default: 
				System.out.println("Error: Invalid Menu Option \n Please enter a valid Menu Option (1 - 5)"); //Lazy error checking
				break;
			}
		} while (MenuSelect != 5); //Exit option
		
		System.out.println("Good Bye."); //Goodbye message
	}
	/*
	 * Volume Menu and Options (US Measurements NOT IMPERIAL)
	 * 
	 * */
	public static void volumeConversionMenu(int MenuSelect, Scanner myScanner, Menu menuOptions) 
	{	//Volume Menu Output
		System.out.println("Volume Menu \n 1. Teaspoons to Tablespoons (US) \n 2. Tablespoons to Teaspoons (US) \n 3. Fluid Ounces to Cups (US) \n 4. Cups to Fluid Ounces (US) \n 5. Back");
		MenuSelect = myScanner.nextInt();
		double quantity = 0;
		switch(MenuSelect) 
		{
			case 1: //Teaspoons to Tablespoons
				System.out.println("What is the quantity you want to exchange? "); 
				quantity = myScanner.nextDouble();
				teaspoonToTablespoon(quantity);
				break;
			case 2: //Tablespoon to Teaspoons
				System.out.println("What is the quantity you want to exchange? "); 
				quantity = myScanner.nextDouble();
				tablespoonToTeaspoon(quantity);
				break;
			case 3: //Fluid Ounces to Cup
				System.out.println("What is the quantity you want to exchange? "); 
				quantity = myScanner.nextDouble();
				flToCup(quantity);
				break;
			case 4: //Cup to Fluid Ounces
				System.out.println("What is the quantity you want to exchange? "); 
				quantity = myScanner.nextDouble();
				cupToFl(quantity);
				break;
			case 5:	//Break
				MenuSelect = 5;
				break;
			default: 
				System.out.println("Error: Invalid Menu Option \n Please enter a valid Menu Option (1 - 5)");
		}
	}
	public static void teaspoonToTablespoon(double quantity) 
	{	//Teaspoon to Tablespoons
		double changed = 0;
		changed = quantity / 3.0;
		System.out.println(quantity + " Teaspoons = " + changed + " Tablespoons.");
	}
	public static void tablespoonToTeaspoon(double quantity) 
	{	//Tablespoons to Teaspoons
		double changed = 0;
		changed = quantity * 3.0;
		System.out.println(quantity + " Tablespoons = " + changed + " Teaspoons.");
	}	
	public static void flToCup(double quantity) 
	{	//Fluid Ounces to Cup
		double changed = 0;
		changed = quantity / 8.0;
		System.out.println(quantity + " Fluid Ounces = " + changed + " Cups.");
	}	
	public static void cupToFl(double quantity) 
	{	//Cup to Fluid Ounces
		double changed = 0;
		changed = quantity * 8.0;
		System.out.println(quantity + " Cups = " + changed + " Fluid Ounces.");
	}	
	
	
	/*
	 * Distance / Length Menu and Options
	 * 
	 * */
	public static void distanceConversionMenu(int MenuSelect, Scanner myScanner, Menu menuOptions) 
	{	//Print Distance Conversion Menu
		System.out.println("Distance Menu \n 1. Meters to Feet \n 2. Feet to Meters \n 3. Miles to Kilometers \n 4. Kilometers to Miles \n 5. Back");
		MenuSelect = myScanner.nextInt();
		double quantity = 0; //Quantity Variable
		switch(MenuSelect) //Switch cases 
		{
			case 1://Meter to Feet
				System.out.println("What is the quantity you want to exchange? "); 
				quantity = myScanner.nextDouble();
				meterToFeet(quantity);
				break;
			case 2: //Feet to Meter
				System.out.println("What is the quantity you want to exchange? "); 
				quantity = myScanner.nextDouble();
				feetToMeter(quantity);
				break;
			case 3: //Mile to Kilometer
				System.out.println("What is the quantity you want to exchange? "); 
				quantity = myScanner.nextDouble();
				mileToKilometer(quantity);
				break;
			case 4: //Kilometer to Meter
				System.out.println("What is the quantity you want to exchange? "); 
				quantity = myScanner.nextDouble();
				kilometerToMile(quantity);
				break;
			case 5:	//Back
				MenuSelect = 5;
				break;
			default: 
				System.out.println("Error: Invalid Menu Option \n Please enter a valid Menu Option (1 - 5)");
		}
	}
	public static void meterToFeet(double quantity) 
	{	//Meter to feet calculation
		double changed = 0;
		changed = quantity * 3.280839895;
		System.out.println(quantity + " Meters = " + changed + " Feet.");
	}
	public static void feetToMeter(double quantity) 
	{	//Feet to meter calculation
		double changed = 0;
		changed = quantity / 3.280839895;
		System.out.println(quantity + " Feet = " + changed + " Meters.");
	}public static void mileToKilometer(double quantity) 
	{	//Mile to Kilometer calculation
		double changed = 0;
		changed = quantity * 1.60935;
		System.out.println(quantity + " Miles = " + changed + " Kilometers.");
	}
	public static void kilometerToMile(double quantity) 
	{	//Kilometer to Mile calculation
		double changed = 0;
		changed = quantity / 1.60935;
		System.out.println(quantity + " Kilometers = " + changed + " Miles.");
	}
	
	/*
	 * Weight Menu and Options
	 * 
	 * */
	public static void weightConversionMenu(int MenuSelect, Scanner myScanner, Menu menuOptions) 
	{	//Print Weight Conversion Menu
		System.out.println("Weight Menu \n 1. Pounds to Kilograms \n 2. Kilograms to Pounds \n 3. Back");
		MenuSelect = myScanner.nextInt();
		double quantity = 0; //Quantity Variable
		switch(MenuSelect) //Switch cases 
		{
			case 1://Pounds to Kilograms
				System.out.println("What is the quantity you want to exchange? "); 
				quantity = myScanner.nextDouble();
				meterToFeet(quantity);
				break;
			case 2: //Kilograms to Pounds
				System.out.println("What is the quantity you want to exchange? "); 
				quantity = myScanner.nextDouble();
				feetToMeter(quantity);
				break;
			case 3:	//Back
				MenuSelect = 5;
				break;
			default: 
				System.out.println("Error: Invalid Menu Option \n Please enter a valid Menu Option (1 - 3)");
		}
	}
	public static void poundToKG(double quantity) 
	{	//Pound to Kilograms calculation
		double changed = 0;
		changed = quantity * 0.453592;
		System.out.println(quantity + " Pounds = " + changed + " Kilograms.");
	}
	public static void kgToPounds(double quantity) 
	{	//Kilograms to pound calculation
		double changed = 0;
		changed = quantity / 0.453592;
		System.out.println(quantity + " Kilograms = " + changed + " Pounds.");
	}


	/* 
	 * Duck Conversion Menu and Options
	 * 
	 * */
	public static void duckConversionMenu(int MenuSelect, Scanner myScanner, Menu menuOptions) 
	{
		/*
		 * Too Lazy for creating even more methods for something I did for fun. 
		 * Conversion from pounds to various ducks based on average weight of ducks.
		 * */
		System.out.println("Duck Conversion Menu \n 1. Pounds to Mallards \n 2. Pounds to Canvasbacks \n 3. Pounds to Marbled Duck \n 4. Pounds to Fulvous Whistling Duck \n 5. Back");
		MenuSelect = myScanner.nextInt(); //Option select. Could create a new variable but easier just to use menu select
		double quantity = 0; //Create variable to hold quantity
		double changed = 0; //Create variable to hold amount of ducks
		switch(MenuSelect) 
		{
			case 1: //Case 1 - Mallard Duck conversion
				System.out.println("What is the quantity you want to exchange? "); 
				quantity = myScanner.nextDouble();
				changed = quantity * 3.3;
				System.out.println(quantity + " Pounds = " + changed + " Mallard Ducks.");
				break;
			case 2: //Case 2 - Canvasback Duck Conversion
				System.out.println("What is the quantity you want to exchange? "); 
				quantity = myScanner.nextDouble();
				changed = quantity * 2.7;
				System.out.println(quantity + " Pounds = " + changed + " Canvasback Ducks.");
				break;
			case 3: //Case 3 - Marbled Ducks Conversion
				System.out.println("What is the quantity you want to exchange? "); 
				quantity = myScanner.nextDouble();
				changed = quantity * 1.1;
				System.out.println(quantity + " Pounds = " + changed + " Marbled Ducks.");
				break;
			case 4: //Case 4 - Fulvous Whistling Duck Conversion
				System.out.println("What is the quantity you want to exchange? "); 
				quantity = myScanner.nextDouble();
				changed = quantity * 1.6;
				System.out.println(quantity + " Pounds = " + changed + " Fulvous Whistling Ducks.");
				break;
			case 5:	//Case 5 - Exit Duck Menu
				MenuSelect = 5;
				break;
			default: 
				System.out.println("Error: Invalid Menu Option \n Please enter a valid Menu Option (Whole Number)");
		}
	}
}
