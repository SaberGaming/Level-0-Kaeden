import javax.swing.JOptionPane;

public class PrimeNumbers {
	public static void main(String[] args) {
		String Num = JOptionPane.showInputDialog("Input a number.");
		int num = Integer.parseInt(Num);
		if(num%2==1 || num%3==1){
			JOptionPane.showMessageDialog(null, "That is a prime number. :)");
		}
		else{
			JOptionPane.showMessageDialog(null, "That isn't a prime number. :( ");
		}
	}
}
