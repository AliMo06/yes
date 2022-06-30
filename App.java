
import javax.swing.JOptionPane;
public class App {
	public static void main (String[] args) {

		String name = JOptionPane.showInputDialog("Enter Your Name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		//parseInt allows an integer value to take in only an integer from the GUI, not a string
		int age =Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You're " + age + " years old");
		
		
		double temp;
		double inches;
		double feet;
		double height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height in inches"));
		inches = height;
		height = height * 2.54; 
		temp = inches;
		inches = inches % 12;
		inches = temp - inches;
		feet = inches/12;
		inches = temp % 12;
		int feetDisplay = (int)feet;
		int inchesDisplay = (int)inches;
		JOptionPane.showMessageDialog(null, "You're " + feetDisplay + "'" + inchesDisplay + " You are also " + height + " cm tall!");
		JOptionPane.showMessageDialog(null, "Your name is " + name + ". You are " + age + " years old," + " and you are " + feetDisplay + "'" + inchesDisplay + "."  );
		
}
}

