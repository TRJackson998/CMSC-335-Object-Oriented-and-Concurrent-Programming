/*
 * Jackson, Terrence
 * CMSC 335 Project 1
 * 03.24.2024
 * Summary:
 * 		Main method
 * 		Prints out a menu of each kind of shape
 * 		Takes in user input
 * 		Prints out information on chosen shapes
 * Based on :
 * 		CMSC 335: programming sample
 * 		Dr. Vergamini
 * 		Test program, with a simple menu.
 */

package projectone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import projectone.utils.MenuEntry;

public class ShapeBox {

	private abstract static class MenuEntryConsole extends MenuEntry<Shape> {
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
		String radiusAttribute = "radius";
		String heightAttribute = "height";
		final MenuEntryConsole circleEntry = new MenuEntryConsole("Circle", inputScanner) {
			@Override
			public Shape get() {
				return new Circle(getPositiveDoubleAttribute(radiusAttribute));
			}

		};

		final MenuEntryConsole coneEntry = new MenuEntryConsole("Cone", inputScanner) {
			@Override
			public Shape get() {
				return new Cone(getPositiveDoubleAttribute(radiusAttribute),
						getPositiveDoubleAttribute(heightAttribute));
			}

		};

		final MenuEntryConsole cubeEntry = new MenuEntryConsole("Cube", inputScanner) {
			@Override
			public Shape get() {
				return new Cube(getPositiveDoubleAttribute("sideLength"));
			}

		};

		final MenuEntryConsole cylinderEntry = new MenuEntryConsole("Cylinder", inputScanner) {
			@Override
			public Shape get() {
				return new Cylinder(getPositiveDoubleAttribute(radiusAttribute),
						getPositiveDoubleAttribute(heightAttribute));
			}

		};

		final MenuEntryConsole rectangleEntry = new MenuEntryConsole("Rectangle", inputScanner) {
			@Override
			public Shape get() {
				return new Rectangle(getPositiveDoubleAttribute("width"), getPositiveDoubleAttribute(heightAttribute));
			}

		};

		final MenuEntryConsole sphereEntry = new MenuEntryConsole("Sphere", inputScanner) {
			@Override
			public Shape get() {
				return new Sphere(getPositiveDoubleAttribute(radiusAttribute));
			}
		};

		final MenuEntryConsole squareEntry = new MenuEntryConsole("Square", inputScanner) {
			@Override
			public Shape get() {
				return new Square(getPositiveDoubleAttribute("sideLength"));
			}
		};

		final MenuEntryConsole torusEntry = new MenuEntryConsole("Torus", inputScanner) {
			@Override
			public Shape get() {
				return new Torus(getPositiveDoubleAttribute("majorRadius"), getPositiveDoubleAttribute("minorRadius"));
			}
		};

		final MenuEntryConsole triangleEntry = new MenuEntryConsole("Triangle", inputScanner) {
			@Override
			public Shape get() {
				return new Triangle(getPositiveDoubleAttribute("base"),
						getPositiveDoubleAttribute(heightAttribute));
			}
		};

		final MenuEntry<Shape>[] entries = new MenuEntryConsole[] { circleEntry, coneEntry, cubeEntry, cylinderEntry,
				rectangleEntry, sphereEntry, squareEntry, torusEntry, triangleEntry };
		final ArrayList<Shape> shapeBox = new ArrayList<>();
		try {
			System.out.println("*********Welcome to the Java OO Shapes Program **********");
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
						final Shape shape = entries[menuSelection - 1].get();
						System.out.println(shape);
						shapeBox.add(shape);
					} catch (Exception badInput) {
						System.out.println("Invalid input for " + label);
					}
				} else if (menuSelection != entries.length + 1) {
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
		shapeBox.forEach(shape -> {
			System.out.println(shape);
		});

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd 'at' h:mm a", Locale.ENGLISH);
		String formattedDateTime = now.format(formatter);
		System.out.println("Thank you for using this program. Today is " + formattedDateTime);

	}

}
