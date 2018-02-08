
/**
 * This class shows how to setup a Scanner in
 * Java to read what is typed on the keyboard.
 * 
 * 
 * The first thing to do is bring the Scanner
 * class into your project.
 * This tells Java "I'm going to be using
 * this class and you need to bring it into
 * my program"
 */
import java.util.Scanner;

public class HowToSetupScanner {

	public static void main(String[] args) {
		
		/**
		 * This creates a new Scanner reference
		 * that is set to read/listen for keys pressed
		 * on the keyboard
		 */
		Scanner keyboard = new Scanner(System.in);
		
		// Get the word or words a user typed in
		// on the keyboard
		String sentence		= keyboard.nextLine();
		
		// Get the whole number a user typed in
		// on the keyboard.
		int wholeNumber		= keyboard.nextInt();
		
		// Get the decimal (fractional) number
		// a user typed in on the keyboard
		double fraction		= keyboard.nextDouble();
		
		/**
		 * Close the scanner when we are done.
		 * Closing a scanner tells Java we are done and will
		 * not be using this scanner anymore.
		 * 
		 * If we need to use a scanner again
		 * we have to create a NEW one.
		 */
		keyboard.close();
	}

}
