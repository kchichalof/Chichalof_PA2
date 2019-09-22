import java.util.Scanner;
public class Encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int num4;
		int encrypt1;
		int encrypt2;
		int encrypt3;
		int encrypt4;
		int userPin;
		
		System.out.println("Please enter your 4 digit pin: ");
		userPin = scnr.nextInt();
		
		num1 = (userPin / 1000) % 10;		
		num2 = (userPin / 100) % 10;
		num3 = (userPin / 10) % 10;
		num4 = userPin % 10;
		
		encrypt1 = (num3 + 7) % 10;
		encrypt2 = (num4 + 7) % 10;
		encrypt3 = (num1 + 7) % 10;
		encrypt4 = (num2 + 7) % 10;
		
		System.out.print("Encrypted pin: " + encrypt1 + "" + encrypt2 + "" + encrypt3 + "" + encrypt4);
		


	}

}
