import java.util.Scanner;

public class PollingProgram {
//This program does not work. I can only display the topics and the 
//stored values mean nothing. Like this program. And the past 3 days.
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String [] topics =  {
			"Video games do not cause violence", 
			"Pineapple belongs on pizza", 
			"Guns should be regulated",
			"College tuition should be free",
			"Vaccinations should be mandatory"
							};	
		int [][] responses = {
						 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 
						 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
						 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 
						 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
						 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
						 };
		System.out.println("Please rate the importance of the following topics from 1-10 with 1 being the least important and 10 being the most important");
	for (int row = 0; row < 4; row++ ) {
		System.out.println(topics[0]);
		System.out.println(topics[1]);
		System.out.println(topics[2]);
		System.out.println(topics[3]);
		System.out.println(topics[4]);
		
		for (int col = 0; col <= 4; col++) {
			responses[row][col] = scnr.nextInt();
										   }//ends 2nd for loop
		
								break;	   }// ends 1st for loop
System.out.print(responses);
	} // ends main
}