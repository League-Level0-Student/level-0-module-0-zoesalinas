import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String summer = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "I know you went on a boat last summer, "+ summer);
}
}
