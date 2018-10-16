import java.util.Random;

import javax.swing.JOptionPane;

public class NumberGuessingGame {
public static void main(String[] args) {
	int choice = 1;
	Random F = new Random();

String value =	JOptionPane.showInputDialog(null,"What number am i guessing about");

int f = Integer.parseInt(value);

	if(f == choice) { JOptionPane.showMessageDialog(null, "your correct");
	
	}
	else { 
		JOptionPane.showMessageDialog(null, "your wrong");
}
}
}

