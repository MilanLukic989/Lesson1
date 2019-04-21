
import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,
				"If you find yourself having to cross a piranha-infested river, here's how to do it...");

		String usersAdjective = JOptionPane.showInputDialog("Enter an adjective: ");
		String usersLiquid = JOptionPane.showInputDialog("Enter a type of liquid: ");
		String usersBpart = JOptionPane.showInputDialog("Enter a enter a body part: ");
		String usersVerb = JOptionPane.showInputDialog("Enter a verb: ");
		String usersPlace = JOptionPane.showInputDialog("Enter a place: ");

		JOptionPane.showMessageDialog(null, "Piranhas are more " + usersAdjective
				+ " during the day, so cross the river at night." + "\r\n" + "Piranhas are attracted to fresh "
				+ usersLiquid + " and will most likely take a bite out of your " + usersBpart + " if you " + usersVerb
				+ ".\r\n" + " Whatever you do, if you have an open wound, try to find another way to get back to the "
				+ usersPlace + ". Good luck!");

	}
}
