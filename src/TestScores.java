import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String Score = JOptionPane.showInputDialog("What was your text score?");
		int score = Integer.parseInt(Score);
		if (score < 60) {
			JOptionPane.showMessageDialog(null, "YOU DID TERRIBLE STUDY MORE!!!!!!!!!!!!😡😡😡");
		}
		if (score >= 60 && score < 70) {
			JOptionPane.showMessageDialog(null, "You can do better.😞😞😞😑😑");
		}
		if (score >= 70 && score < 80) {
			JOptionPane.showMessageDialog(null, "Study more.😬😬😬");
		}
		if (score >= 80 && score < 90) {
			JOptionPane.showMessageDialog(null, "You're so close.");
		}
		if (score >= 99 && score < 100) {
			JOptionPane.showMessageDialog(null, "GOOD JOB!!!!!!! 👍👍👍 ");
		}
		if (score == 100) {
			JOptionPane.showMessageDialog(null, "YOU DID AMAZING!!! NICE JOB!!!😃😃😃👍👍👍");
		}
	}
}
