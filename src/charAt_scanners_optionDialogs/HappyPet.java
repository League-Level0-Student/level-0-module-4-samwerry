package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String pet;

	public static void main(String[] args) {

		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		pet = JOptionPane.showInputDialog("what pet would you like?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.

		JOptionPane.showOptionDialog(null, "What will you do to make your pet happy?", "a", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "cuddle", "food", "take a walk", "groom", "clean up poop" }, null);
		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

	void walk() {
		if (pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "dog might wag it's tail when walked");
			happinessLevel = +5;
		} else if (pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "cat will not enjoy walking with a human, and walk by itself");
			happinessLevel = -3;
		} else if (pet.equals("bird")) {
			JOptionPane.showMessageDialog(null, "your bird will not enjoy being walked, and fly away");
			happinessLevel = -5;
		}

	}

	void groom() {
		if (pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "dog might lick you if groomed");
			happinessLevel = +7;
		} else if (pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your cat may purr when groomed");
			happinessLevel = +7;
		} else if (pet.equals("Bird")) {
			JOptionPane.showMessageDialog(null, "your bird will most likely enjoy being groomed and tweet");
			happinessLevel = +7;
		}
	}

	void cuddle() {
		if (pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "your dog will love being cuddled and wag his tail");
			happinessLevel = +10;
		} else if (pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "your cat will enjoy being cuddled for a period of time, and purr");
			happinessLevel = +8;
		} else if (pet.equals("bird")) {
			JOptionPane.showMessageDialog(null, "your bird will enjoy being lgihtly cuddled, and be happy");
			happinessLevel = +5;
		}
	}

	void feed() {
		if (pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "your dog will be happy if fed, and be waiting for his next meal");
			happinessLevel = +8;
		} else if (pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "your cat will enjoy being pet, and keep on with its day");
			happinessLevel = +7;
		} else if (pet.equals("bird")) {
			JOptionPane.showMessageDialog(null, "your bird will enjoy being fed, and squak");
			happinessLevel = +6;
		}
	}

	void PoopCleaner() {
		if (pet.equals("dog")) {
			JOptionPane.showMessageDialog(null,
					"Your dog will enjoy having his/her pooped being cleaned up and give you a big smile");
			happinessLevel = +4;
		} else if (pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "your cat will notice that you cleaned its poop and wont care");
		} else if (pet.equals("bird")) {
			JOptionPane.showMessageDialog(null, "Your bird will not care that you cleaned his poop");
		}
	}
}
