package _05_greeter;

import javax.swing.JOptionPane;

public class greeder {
	public static void main(String[] args) {
		String input=JOptionPane.showInputDialog("what is your name?");
		JOptionPane.showMessageDialog(null, "hello "+input);
	}

}
