import java.util.Scanner;

/*
 * This program simulates owls racing!
 * 
 * Fill in all of the following information before submitting.
 * 
 * Mulualem Hailom
 * 12/05/2018
 * 
 * I was assisted by: Drop in tutoring. 
 *  (He gave me suggestion on steps to follow.)
 *   
 * I gave assistance to: (list classmates if applicable)
 *  (Explain how you assisted)
 *   
 * Brief reflection on what you learned from this programming assignment,
 *  what was the most challenging part, and whether or not you enjoyed it:
 *   
 *
 */
public class Project1OwlRacing{

	// this constant named CONSOLE will allow us to get keyboard input from the user...
	public static final Scanner CONSOLE = new Scanner(System.in); // <- don't change this line! 
	

	/**
	 * The main method runs the whole owl race.
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to the owl race track!");
		System.out.println("[insert engaging backstory here...]");
		System.out.println();
		System.out.println("How many owls will perform distance trials today? ");
		int numOwlsDoingTrials = CONSOLE.nextInt();
	   for(int i=1;i<=numOwlsDoingTrials;i++) {
		racing();}
	  /* for(int j=1;j<=numOwlsDoingTrials-1;j++) {
	   System.out.print("What owl will perform a distance trial next?");
	   }*/
		
		// the following code waits until the user has typed in a number and hit ENTER,
		// and then the number they typed gets assigned to the numOwlsDoingTrials variable.
		
			
		// TODO: For each owl (i.e. repeat numOwlsDoingTrials times)
		//     *call* a static method (you'll need to create one below) 
		//     that will handle the job of racing ONE owl.
	} 
	
	public static void racing() {
		System.out.println("what owl will perform a distance trialnext?");
			String nameowl = CONSOLE.next();
			int namelength= nameowl.length();
			int distancetra= namelength*171%23+8;
	
			// the outer loop controls how far over we want the text to be printed
			for (int xColumn =1; xColumn <= distancetra ; xColumn++) {
				
				briefPause(); // pause, because otherwise the computer runs too fast to see anything
				makeConsoleAppearBlank(); // scroll the console to effectively "blank" the screen.

				// the inner loop repeatedly prints spaces (on the same line) so that
				// the text that gets printed after this will be shifted over the correct amount.
				for (int space = 1; space < xColumn+1; space++) {
					System.out.print(".");
				}
				// now we print the text that we want to appear to be moving
				System.out.println("<--"+nameowl);
			}
			System.out.println(nameowl+" flew a total distance of " + distancetra);
			
			}
			
	
		
		// TODO: After all owls have flown, display some story-ending text. 
	


	//TODO: create a static method here that will accomplish racing ONE owl.
    // 		Racing one owl consists of: 
	//       - asking the user to enter the owl's name (match the sample transcript)
	//       - calculating how far that owl will go
	//       - showing the owl flight animation that goes that distance.
	
	
	
	
	
	/** This static method prints out 12 blank lines.  
	 * This is useful because it scrolls everything that was showing
	 * in the console off the screen, so we can print some new text
	 * where the old text was, and create the illusion of animation!
	 * 
	 * NOTE: You do *NOT* need to modify the code in this method.
	 */
	public static void makeConsoleAppearBlank() {
		for (int i = 1; i <= 12; i++) {
			System.out.println();
		}
	}
	
	/**
	 *  This static method causes the Java program to 
	 *  wait 0.2 seconds before the program continues running.
	 *  
	 *  NOTE: Don't worry about the fancy incantations inside of this code.
	 *  You do NOT need to modify (or even understand) this method.
	 *  You will just need to *CALL* this method from your own methods by writing:
	 *    briefPause();
	 */
	public static void briefPause() {
		try {
 			Thread.sleep(200); // 200 milliseconds = 0.2 seconds
		} catch (InterruptedException ex) { }
	}

	/** Pauses the running program for 4 seconds, before continuing... 
	 * (similar to briefPause() above) */
	public static void lengthyPause() {
		try {
 			Thread.sleep(4000); // 4000 milliseconds = 4 seconds
		} catch (InterruptedException ex) { }
	}

}
