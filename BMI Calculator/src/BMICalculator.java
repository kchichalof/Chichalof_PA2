import java.util.Scanner;
public class BMICalculator {

	public static void main(String[] args) {
		float userHeightInches;
		float userHeightMeters;
		float userWeightLbs;
		float userWeightKilos;
		float bmi;
		int measurementSystem;
		Scanner scnr = new Scanner(System.in);
	while(true) {	
		System.out.println("Please select from the following options:");
		System.out.println("1 - BMI measured with the imperial system\n2 - BMI measured with the metric system");
		System.out.print("Please enter either 1 or 2:");
		measurementSystem = scnr.nextInt();
		
		if (measurementSystem == 1) 
				{ 
				System.out.println("Please enter your weight in pounds:");
				userWeightLbs = scnr.nextFloat();
				System.out.println("Please enter your height in inches:");
				userHeightInches = scnr.nextFloat();
				bmi = (703 * userWeightLbs) / (userHeightInches * userHeightInches);
				System.out.println("Thank you! Here is your BMI: " + bmi);
				break;
				}
		
	    else if (measurementSystem == 2)
	    		{
	    		System.out.println("Please enter your weight in kilograms:");
				userWeightKilos = scnr.nextFloat();
				System.out.println("Please enter your height in meters:");
				userHeightMeters = scnr.nextFloat();
				bmi = (userWeightKilos) / (userHeightMeters * userHeightMeters);
				System.out.println("Thank you! Here is your BMI:" + bmi);
				break;
	    		}
	    else
	    	System.out.print("Invalid entry, please try again.\n\n");				
				} // closes while loop
		
		System.out.println("\nHere are the BMI categories:");
		System.out.print("Underweight = <18.5\r\n" + 
				"Normal weight = 18.5–24.9\r\n" + 
				"Overweight = 25–29.9\r\n" + 
				"Obesity = BMI of 30 or greater");


	}

}
