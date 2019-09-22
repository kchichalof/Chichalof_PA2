import java.util.Scanner;
public class Decrypt {

	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	int num1;
	int num2;
	int num3;
	int num4;
	int decrypt1;
	int decrypt2;
	int decrypt3;
	int decrypt4;
	int encryptedUserPin;
	
	System.out.print("Please enter your 4 digit encrypted pin: ");
	encryptedUserPin = scnr.nextInt();
	
	num1 = (encryptedUserPin / 1000) % 10;		
	num2 = (encryptedUserPin / 100) % 10;
	num3 = (encryptedUserPin / 10) % 10;
	num4 = encryptedUserPin % 10;

	decrypt1 = (num3 - 7) * 10;
	decrypt2 = (num4 - 7) * 10;
	decrypt3 = (num1 - 7) * 10;
	decrypt4 = (num2 - 7) * 10;
	
	System.out.print("Decrypted pin: " + decrypt1 + "" + decrypt2 + "" + decrypt3 + "" + decrypt4);
	}

}
