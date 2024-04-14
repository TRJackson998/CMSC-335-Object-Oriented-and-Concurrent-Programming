package projecttwo.utils;
/*
 * Jackson, Terrence
 * CMSC 335 Project 2
 * 04.06.2024
 * Based on - 
 * CMSC 335: programming sample
 * Dr. Vergamini
 * generic class that binds together a menu choice with a label and a method that builds an instance corresponding to that choice.
 * the abstract method are the method to get user input, and the method building an instance corresponding to the choice.
 * Changes by Terrence Jackson commented in code
 */

import java.util.function.Function;

public abstract class MenuEntry<A> { // change: linter recommends generics are 1 uppercase letter
	private final String label;

	protected MenuEntry(String label) { // change: linter recommends protected constructor for abstract class
		this.label = label;
	}

	public String toString() {
		return label;
	}

	public abstract A get(); // change: reorder modifiers

	public String getQuestion(String attributeName) {
		return "What is the " + attributeName + " for " + label + "?";
	}

	public abstract String getStringAttribute(String attributeName); // change: reorder modifiers

	public Double getPositiveDoubleAttribute(String attributeName) {
		return getDoubleAttribute(attributeName, value -> (value > 0)); // change: linter recommended removing
																		// parenthesis
	}

	public Double getDoubleAttribute(String attributeName, Function<Double, Boolean> filter) {
		final Double value = Double.valueOf(getStringAttribute(attributeName));
		if (filter == null || (value != null && filter.apply(value))) {
			return value;
		}
		return null;
	}

}