package edu.cofc.csci230;
import java.util.*;
import java.lang.*;

public class DNA {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter upper DNA strand: ");
		String upperStrand = reader.nextLine();
		upperStrand = upperStrand.toUpperCase(); 
		 
		System.out.print("Enter lower DNA strand: ");
		String lowerStrand = reader.nextLine();
		lowerStrand = lowerStrand.toUpperCase();
		
		//create instance of stringbuilder, will allow for updating characters in a string
		StringBuilder lowerStrandUpdate = new StringBuilder(lowerStrand);
		
		//checks that both upper and lower strands are not empty 
		if (upperStrand.isEmpty() || lowerStrand.isEmpty()) {
			System.out.println("The entered upper or lower strand is not defined... Exiting program."); 
		}
		
		else {
			//check that upper and lower strands are of equal strength
			if (upperStrand.length() == lowerStrand.length()) {
				//check that upper strand only contains A,G,C,T 
				for (int upperCounter = 0; upperCounter < upperStrand.length(); upperCounter++) {
					char upperLetter = upperStrand.charAt(upperCounter);
					if (upperLetter == 'A' || upperLetter == 'G' || upperLetter == 'C' || upperLetter == 'T') {
						//intentionally left blank 
					}
					else {
						System.out.println("The upper and lower strands must only contain combinations of A, G, C, or T... Exiting Program.");
						return;
					}
					
				}
				//check that lower strand only contains A,G,C,T
				for (int lowerCounter = 0; lowerCounter < lowerStrand.length(); lowerCounter++) {
					char lowerLetter = lowerStrand.charAt(lowerCounter);
					if (lowerLetter == 'A' || lowerLetter == 'G' || lowerLetter == 'C' || lowerLetter == 'T') {
						//intentionally left blank 
					}
					else {
						System.out.println("The upper and lower strands must only contain combinations of A, G, C, or T... Exiting Program.");
						return;
					}
				}
				//loop through upper strand and change lower strand when necessary 
				for (int baseCounter = 0; baseCounter < upperStrand.length(); baseCounter++) {
					if (upperStrand.charAt(baseCounter) == 'A' && lowerStrand.charAt(baseCounter) != 'T') {
						//change base
						lowerStrandUpdate.setCharAt(baseCounter, 't');
						//System.out.println(lowerStrandUpdate);
					}
					if (upperStrand.charAt(baseCounter) == 'T' && lowerStrand.charAt(baseCounter) != 'A') {
						//change base 
						lowerStrandUpdate.setCharAt(baseCounter, 'a');
						//System.out.println(lowerStrandUpdate);
					}
					if (upperStrand.charAt(baseCounter) == 'G' && lowerStrand.charAt(baseCounter) != 'C') {
						//change base 
						lowerStrandUpdate.setCharAt(baseCounter, 'c');
						//System.out.println(lowerStrandUpdate);
					}
					if (upperStrand.charAt(baseCounter) == 'C' && lowerStrand.charAt(baseCounter) != 'G') {
						//change base 
						lowerStrandUpdate.setCharAt(baseCounter, 'g');
						//System.out.println(upperStrand.charAt(baseCounter));
						//System.out.println(lowerStrand.charAt(baseCounter));
						//System.out.println(lowerStrandUpdate);
					}
				}
				//loop through lower strand and count differences 
				int changesCounter = 0;
				for (int counter = 0; counter < upperStrand.length(); counter++) {
					if (lowerStrand.charAt(counter) != lowerStrandUpdate.charAt(counter)) {
						changesCounter++;
					}
				}
				//check whether or not differences exist and give correct message
				if (changesCounter > 0) {
					System.out.println("The entered double-strand DNA pattern had base-pair errors that have been corrected: " + upperStrand + " " + lowerStrandUpdate);
				}
				else {
					System.out.println("The entered double-strand DNA pattern is correct... Exiting program");
				}
			
			}		
			else {
				System.out.println("The entered upper and lower strands do not have the same number of chemical bases... Exiting program.");
			}
		}
	}

}
