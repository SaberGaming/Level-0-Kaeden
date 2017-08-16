import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.

	int happy = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in
		// variable
		HappyPet pet = new HappyPet();
		String kind = JOptionPane.showInputDialog("What kind of pet would you like to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (; true;) {

			// 3. Use showOptionDialog to ask the user what they want to do to
			// make their pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happy", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Water", "Feed your pet", "Take a walk" },
					null);
			if (task == 0) {
				pet.water();
			} else if (task == 1) {
				pet.food();
			} else if (task == 2) {
				pet.walk();
			}
			if (pet.happy == 6) {
				JOptionPane.showMessageDialog(null, "Your pet is happy enough!!!");
				System.exit(0);
			}
		}

		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	public void water() {
		JOptionPane.showMessageDialog(null, "Slurp!");
		happy++;
	}

	public void food() {
		JOptionPane.showMessageDialog(null, "Yum!!");
		happy++;
	}

	public void walk() {
		JOptionPane.showMessageDialog(null, "Bark!!!");
		happy++;
	}

}
