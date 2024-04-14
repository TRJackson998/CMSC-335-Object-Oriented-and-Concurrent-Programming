package projecttwo.profexample.src.pets;

import java.awt.Graphics;

/*
 * CMSC 335: programming sample
 * Dr. Vergamini
 * Base class for Animal, holding only a String for the species and the name and integers for the number of legs, and for the age of the instance
 */

public abstract class Animal {

	protected final String name;
	protected final String species;
	protected final int numberOfLegs;
	protected final int age;

	public Animal(String name, String species, int numberOfLegs, int age) {
		this.species = species;
		this.numberOfLegs = numberOfLegs;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("%s: %s with %d legs, %d years old", name, getDescriptive(), numberOfLegs, age);
	}

	public abstract String getDescriptive();

	protected abstract void draw(Graphics graphics);

}
