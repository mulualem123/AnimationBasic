import java.util.Scanner;

/** This program shows how one can create the illusion of animation by repeatedly 
 * printing blank lines and slightly shifted text in the console...
 * 
 * @author Great Wizard Stonedahl
 * @date   11/25/2018 (updated)  
 */
public class AnimationDemo {

	public static void main(String[] args) {
		System.out.println("Manual animation:");
		lengthyPause();
		animationManual();
		lengthyPause();

		System.out.println();
		System.out.println("Simple loop animation:");
		lengthyPause();
		animationSimpleLoop();
		lengthyPause();
		
		System.out.println();
		System.out.println("Fancy loop animation:");
		lengthyPause();
		animationFancyLoop();
		lengthyPause();
		
	}

	public static void animationManual() {
		briefPause(); 
		makeConsoleAppearBlank(); 
		System.out.println("~~~~~~~~~");
		System.out.println("~~~~~~~~~");
		System.out.println("~@~~~~~~~");
		briefPause(); 
		makeConsoleAppearBlank(); 
		System.out.println("~~~~~~~~~");
		System.out.println("~~~~~~~~~");
		System.out.println("~~@~~~~~~");
		briefPause(); 
		makeConsoleAppearBlank(); 
		System.out.println("~~~~~~~~~");
		System.out.println("~~~~~~~~~");
		System.out.println("~~~@~~~~~");
		briefPause(); 
		makeConsoleAppearBlank(); 
		System.out.println("~~~~~~~~~");
		System.out.println("~~~~~~~~~");
		System.out.println("~~~~@~~~~");
		briefPause(); 
		makeConsoleAppearBlank(); 
		System.out.println("~~~~~~~~~");
		System.out.println("~~~~@~~~~");
		System.out.println("~~~~~~~~~");
		briefPause(); 
		makeConsoleAppearBlank(); 
		System.out.println("~~~~@~~~~");
		System.out.println("~~~~~~~~~");
		System.out.println("~~~~~~~~~");
		briefPause(); 
		makeConsoleAppearBlank(); 
		System.out.println("~~~@~~~~~");
		System.out.println("~~~~~~~~~");
		System.out.println("~~~~~~~~~");
		briefPause(); 
		makeConsoleAppearBlank(); 
		System.out.println("~~@~~~~~~");
		System.out.println("~~~~~~~~~");
		System.out.println("~~~~~~~~~");
		briefPause(); 
		makeConsoleAppearBlank(); 
		System.out.println("~@~~~~~~~");
		System.out.println("~~~~~~~~~");
		System.out.println("~~~~~~~~~");
		briefPause(); 
		makeConsoleAppearBlank(); 
		System.out.println("@~~~~~~~~");
		System.out.println("~~~~~~~~~");
		System.out.println("~~~~~~~~~");
	}
	
	// This example is somewhat similar to what you'll need to do for the project.
	public static void animationSimpleLoop() {
		
		// the outer loop controls how far over we want the text to be printed
		for (int xColumn = 30; xColumn >= 10; xColumn--) {
			
			briefPause(); // pause, because otherwise the computer runs too fast to see anything
			makeConsoleAppearBlank(); // scroll the console to effectively "blank" the screen.

			// the inner loop repeatedly prints spaces (on the same line) so that
			// the text that gets printed after this will be shifted over the correct amount.
			for (int space = 0; space < xColumn; space++) {
				System.out.print(" ");
			}
			// now we print the text that we want to appear to be moving
			System.out.println("<--{ Moving left from 30 to 10! }");
		}
	}

	
	/** This static method prints out 12 blank lines.  
	 * This is useful because it scrolls everything that was showing
	 * in the console off the screen, so we can print some new text
	 * where the old text was, and create the illusion of animation!
	 * 
	 * NOTE: You do *NOT* need to modify the code in this method
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

	/** Pauses the running program for 5 seconds, before continuing... 
	 * (similar to briefPause() above...) */
	public static void lengthyPause() {
		try {
 			Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		} catch (InterruptedException ex) { }
	}

	
	// This fancy example is more complex than you really need for the project.
	public static void animationFancyLoop() {
		
		int arrow1Loc = 0;  // initial locations
		int arrow2Loc = 40;   

		// the outer loop controls how much time has past
		for (int time = 0; time < 20; time++) {
			
			briefPause(); // pause, because otherwise the computer runs too fast to see anything
			makeConsoleAppearBlank(); // scroll the console to effectively "blank" the screen.


			for (int space = 0; space < arrow1Loc; space++) {
				System.out.print(" ");
			}
			System.out.print("}->");  // arrow 1
			for (int space = 0; space < arrow2Loc - arrow1Loc; space++) {
				System.out.print(" ");
			}
			System.out.println("<-{");  // arrow 2
			System.out.println("Gap distance: " + (arrow2Loc - arrow1Loc));
			arrow1Loc++;
			arrow2Loc--;
		}
		// Once arrows collide, make a little explosion...
		briefPause(); 
		makeConsoleAppearBlank(); 
		System.out.println("                   (***)");
		System.out.println("boom!");
		briefPause(); 
		makeConsoleAppearBlank(); 
		System.out.println("                  [*#*#*]");
		System.out.println("BOOM!");
		briefPause(); 
		makeConsoleAppearBlank(); 
		System.out.println("                  .:.:.:.");
		System.out.println("boom!");
		
	}
	

	
}
