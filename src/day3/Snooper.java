package day3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog(null, "Welcome! Please enter your name for security purposes.");
	    String age=JOptionPane.showInputDialog(null, "Please confirm your age for security purposes.");
	    String address=JOptionPane.showInputDialog(null, "Please enter your addreess for final security confirmation." );
	    
	    JOptionPane.showInputDialog(null,"You are "name", "age" years old and are currently living on "address.");"
		
	}

}
