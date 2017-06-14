import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		int cow = JOptionPane.showConfirmDialog(null, "Do you want a Cow?");
		/* 2. Make it so that the user can keep entering new animals. */
		System.out.println(cow);

		if (cow == 0) {
			playMoo();
		}

		int duck = JOptionPane.showConfirmDialog(null, "Do you want a Duck?");
		if (duck == 0) {
			playQuack();
		}

		int dog = JOptionPane.showConfirmDialog(null, "Do you want a Dog?");
		if (dog == 0) {
			playWoof();
		}
		int cat = JOptionPane.showConfirmDialog(null, "Do you want a Cat?");
		if (cat == 0) {
			playMeow();
		}
		int llama = JOptionPane.showConfirmDialog(null, "Do you want a Llama?");
		if (llama == 0) {
			playllama();
		}	
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	void playMeow(){
		playNoise(meowFile);
	}
	void playllama(){
		playNoise(llamaFile);
	}
	String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
