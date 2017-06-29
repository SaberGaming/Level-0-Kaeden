import java.awt.Desktop;
import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What mood are you in?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Stressed", "Happy", "Angry" }, null);

		// 2. Their answer is stored in the userMood variable. Print it out.
		System.out.println(userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a
		// calming song from YouTube.
		if (userMood == 0) {
			playVideo("https://bit.ly/video-for-sad");
		}
		// 4. Play different songs for other moods.
		if (userMood == 1) {
			playVideo("https://bit.ly/video-for-happy");
		}
		if (userMood == 2) {
			playVideo("https://bit.ly/video-for-angry");
		}
		// If you are seeing ads at the beginning of your videos, install
		// Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			Desktop dt = java.awt.Desktop.getDesktop();
			if (dt.isSupported(Desktop.Action.BROWSE)) {
				dt.browse(uri);
			} else {
				System.out.println("Browse not supported.");
			}
		} catch (Exception e) {
			System.out.println(youTubeLink + " Didn't Work!!!!!!!");
		}
	}
}

/**
 * If you can’t think of any, here are some you can use...
 * bit.ly/video-for-happy bit.ly/video-for-sad bit.ly/video-for-angry
 **/
