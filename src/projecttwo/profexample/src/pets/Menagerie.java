package projecttwo.profexample.src.pets;

/*
 * CMSC 335: programming sample
 * Dr. Vergamini
 * Test program, with a simple menu.
 */
import java.util.ArrayList;
import java.util.Scanner;

import projecttwo.profexample.src.utils.MenuEntry;

public class Menagerie {

	private abstract static class MenuEntryConsole extends MenuEntry<Animal> {
		private final Scanner scanner;

		public MenuEntryConsole(String label, Scanner scanner) {
			super(label);
			this.scanner = scanner;
		}

		public String getStringAttribute(String attributeName) {
			System.out.println(getQuestion(attributeName));
			return scanner.nextLine();
		}

	}

	public static void main(String[] ignored) {
		final Scanner inputScanner = new Scanner(System.in);
		final MenuEntryConsole dogEntry = new MenuEntryConsole("Dog", inputScanner) {
			@Override
			public Animal get() {
				return new Dog(getStringAttribute("name"), getPositiveIntegerAttribute("age"),
						getStringAttribute("breed"));
			}

		};
		final MenuEntryConsole snakeEntry = new MenuEntryConsole("Snake", inputScanner) {

			@Override
			public Animal get() {
				return new Snake(getStringAttribute("name"), getPositiveIntegerAttribute("age"),
						getStringAttribute("type"), getStringAttribute("scale color"));
			}

		};
		final MenuEntry<Animal>[] entries = new MenuEntryConsole[] { dogEntry, snakeEntry };
		final ArrayList<Animal> menagerie = new ArrayList<>();
		try {
			while (true) {
				int menuSelection = -1;
				System.out.println("Select from the menu below:\n");
				for (int entryIndex = 0; entryIndex < entries.length; ++entryIndex) {
					// entries are counted from 1 for the user, but from 0 in the Java array
					System.out.println((entryIndex + 1) + ". Construct a " + entries[entryIndex].toString());
				}
				System.out.println((entries.length + 1) + ". Exit the program ");
				try {
					menuSelection = Integer.parseInt(inputScanner.nextLine());
				} catch (NumberFormatException numberFormatException) {
					menuSelection = -1;
				}
				if (menuSelection >= 1 && menuSelection <= entries.length) {
					// an actual valid shape selection has been made
					final String label = entries[menuSelection - 1].toString();
					System.out.println("You have selected a " + label);
					try {
						final Animal animal = entries[menuSelection - 1].get();
						System.out.println(animal);
						menagerie.add(animal);
					} catch (Exception badInput) {
						System.out.println("Invalid input for " + label);
					}
				} else if (menuSelection != entries.length + 1) {
					// no valid input
					System.out.println("Bad input");
				} else {
					// the last option was selected, this is the end of the interaction loop
					break;
				}
				String continueInput = "";
				while (true) {
					System.out.println("Would you like to continue? (Y or N)");
					continueInput = inputScanner.nextLine().toUpperCase();
					if ("Y".equals(continueInput) || "N".equals(continueInput)) {
						break;
					}
					System.out.println("Sorry I do not understand. Enter Y or N");
				}
				if ("N".equals(continueInput)) {
					// end of the interaction loop not triggered by the main menu
					break;
				}
			}
		} finally {
			inputScanner.close();
		}
		System.out.println("***********");
		menagerie.forEach(animal -> {
			System.out.println(animal);
		});

	}

}
