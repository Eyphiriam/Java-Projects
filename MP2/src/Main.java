
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the file input name."); 
		// src\\SampleInputFile is the input name
		String inputFileName = console.nextLine();
		MowerWareHouse wareHouse = new MowerWareHouse();
		wareHouse.saveMowerData(inputFileName);
		
		boolean continueOptions = true;
		while(continueOptions) {
			System.out.println("Enter your choice of mower to get information.");
			System.out.println("Type C for Commercial Mower, G for Gas Powered Mower, P for Push Reel Mower, L for Lawn Tractor, and S to stop.");
			String choice = console.nextLine();
			if(choice.equalsIgnoreCase("C")||choice.equalsIgnoreCase("G")||choice.equalsIgnoreCase("P")||choice.equalsIgnoreCase("L")) {
				wareHouse.readMowerData(choice);
			}
			else if(choice.equalsIgnoreCase("S")) {
				continueOptions = false;
				System.out.println("Selection Stopped, please try again.");
			}
		}
		
		
	}
	

}
