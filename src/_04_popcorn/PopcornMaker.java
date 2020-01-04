package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavour = JOptionPane.showInputDialog(null, "What flavour popcorn do you want?");
		Popcorn popcorn = new Popcorn(flavour);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		int time = Integer.parseInt(JOptionPane.showInputDialog(null, "How long do you want to put the popcorn in for"));
		microwave.setTime(time);
		microwave.startMicrowave();
	}
}
