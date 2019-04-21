import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		String quarters = JOptionPane.showInputDialog("How many quarters do you have?");

		int intNickels = Integer.parseInt(nickels);
		// double nickelsToDollars = intNickels * 0.05;

		int intDimes = Integer.parseInt(dimes);
		// double dimesToDollars = intDimes * 0.10;

		int intQuarters = Integer.parseInt(quarters);
		// double quartersToDollars = intQuarters * 0.25;

		// double finalDollars = nickelsToDollars + dimesToDollars + quartersToDollars;

		double finalDollars = 0.05 * intNickels + 0.10 * intDimes + 0.25 * intQuarters;

		JOptionPane.showMessageDialog(null,
				"You have: " + finalDollars + " dollars." + " And here is a sandwich for you!");

	}
}
