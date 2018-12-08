package LearningJava;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
			
	Scanner input = new Scanner(System.in); 
	
	System.out.println("PLease, type in Grand (case matters): ");
		
		int firstWord = 0;

			String Grand = input.nextLine();
			
		int length = Grand.length();	
			
			for(int i = 0;i < length; i++) {
				firstWord = firstWord + Grand.codePointAt(i);
			}
		
			System.out.printf("The value of Grand is: \n");
			
	System.out.println(firstWord);
	
	System.out.println("PLease, type in Circus (case matters): ");
	
		int secondWord = 0;
	
			String Circus = input.nextLine();
			
		int lengthTwo = Circus.length();	
			
			for(int i = 0;i < lengthTwo; i++) {
				secondWord = secondWord + Circus.codePointAt(i);
			}
			
	System.out.printf("The value of Circus is: \n");
			
	System.out.println(secondWord);
	
	//System.out.println(firstWord - secondWord);
	
	System.out.println("The absolute value of Grand minus Cirus is: " + Math.abs(firstWord - secondWord));
	

	
	
	
	}
	
	
	
	}


