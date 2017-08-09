package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's
		// how to do it...
		JOptionPane.showMessageDialog(null,
				"If you find yourself having to cross a piranha-infested river, here's how to do it...");

		// Get the user to enter an adjective
		String adjective = JOptionPane.showInputDialog("Enter an Adjective");

		// Get the user to enter a type of liquid
		String liquid = JOptionPane.showInputDialog("Enter a Type of Liquid");

		// Get the user to enter a body part
		String limb = JOptionPane.showInputDialog("Enter a Body Part");

		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog("Enter a Verb");

		// Get the user to enter a place
		String place = JOptionPane.showInputDialog("Enter a Place");

		// Fit the user's words into this sentence, and save it in a String:

		// Piranhas are more speedy during the day, so cross the river at
		// night. Piranhas are attracted to fresh vodka and will most
		// likely take a bite out of your left nostril if you sneeze. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to Moscow. Good luck!

		// Make a pop-up for the final story. You can use \n to go to the next
		// line.
		JOptionPane.showMessageDialog(null,
				"Piranhas are more speedy during the day, so cross the river night. /n Piranhas are attracted to fresh vodka and will most likely take a bite out of your left nostril if you sneeze./n  Whatever you do, if you have an open wound, try to find another way to get back to Moscow. /nGood luck!");

	}
}
