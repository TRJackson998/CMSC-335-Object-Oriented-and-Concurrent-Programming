package projectone.prof_example.src.utils;
/*
 * CMSC 335: programming sample
 * Dr. Vergamini
 * generic class that binds together a menu choice with a label and a method that builds an instance corresponding to that choice.
 * the abstract method are the method to get user input, and the method building an instance corresponding to the choice.
 */

import java.util.function.Function;

public abstract class MenuEntry<Anything> {
	private final String label;

	public MenuEntry(String label) {
		this.label = label;
	}

	public String toString() {
		return label;
	}

	abstract public Anything get();

	public String getQuestion(String attributeName) {
		return "What is the " + attributeName + " for " + label + "?";
	}

	abstract public String getStringAttribute(String attributeName);

	public Integer getPositiveIntegerAttribute(String attributeName) {
		return getIntegerAttribute(attributeName, (value) -> (value > 0));
	}

	public Integer getIntegerAttribute(String attributeName, Function<Integer, Boolean> filter) {
		final Integer value = Integer.valueOf(getStringAttribute(attributeName));
		if (filter == null || (value != null && filter.apply(value))) {
			return value;
		}
		return null;
	}

}