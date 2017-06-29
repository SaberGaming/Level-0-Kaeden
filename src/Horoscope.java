import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String sign = JOptionPane.showInputDialog("What is your Zodiac Sign?");
		if (sign.equalsIgnoreCase("aries")) {
			JOptionPane.showMessageDialog(null, "The typical Aries person is full of vitality.");
		}
		if (sign.equalsIgnoreCase("taurus")) {
			JOptionPane.showMessageDialog(null, "Taurus people are not in a hurry.");
		}
		if (sign.equalsIgnoreCase("gemini")) {
			JOptionPane.showMessageDialog(null,
					"Gemini are never happier than when they are sharing ideas and concepts with someone else. ");
		}
		if (sign.equalsIgnoreCase("cancer")) {
			JOptionPane.showMessageDialog(null,
					"The typical cancer person is all about home and family and is very dedicated and loyal to friends and family.");
		}
		if (sign.equalsIgnoreCase("virgo")) {
			JOptionPane.showMessageDialog(null, "Virgo people are mild mannered on the surface.");
		}
		if (sign.equalsIgnoreCase("libra")) {
			JOptionPane.showMessageDialog(null,
					"Libra people need to keep a balance between work lives and recreational lives and an equal balance in their emotional and spiritual/physical lives.");
		}
		if (sign.equalsIgnoreCase("scorpio")) {
			JOptionPane.showMessageDialog(null,
					"The scorpio person is not necessarily aggressive on its own, unless provoked and in general would rather be contemplative.");
		}
		if (sign.equalsIgnoreCase("sagittarius")) {
			JOptionPane.showMessageDialog(null,
					"Sagittarians crave the freedom of the open road, both metaphorically and physically.");
		}
		if (sign.equalsIgnoreCase("capricorn")) {
			JOptionPane.showMessageDialog(null,
					"Capricorn people are the type that are goal oriented and driven to succeed despite all odds.");
		}
		if (sign.equalsIgnoreCase("aquarius")) {
			JOptionPane.showMessageDialog(null,
					"This is because Aquarians are often generous with their time and resources.");
		}
		if (sign.equalsIgnoreCase("pisces")) {
			JOptionPane.showMessageDialog(null,
					"Pisces tend to be daydreamers, often dreaming up brilliant ideas and plans which they are unable to facilitate themselves.");
		}

	}
}
