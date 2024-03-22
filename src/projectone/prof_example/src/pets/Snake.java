package projectone.prof_example.src.pets;

/*
 * CMSC 335: programming sample
 * Dr. Vergamini
 * Snake subclass, with type and scale color
 */

public class Snake extends Animal {

	private final String type;
	private final String scaleColor;

	public Snake(String name, int age, String type, String scaleColor) {
		super(name, "snake", 0, age);
		this.type = type;
		this.scaleColor = scaleColor;
	}

	@Override
	public String getDescriptive() {
		return type + " " + species + " with " + scaleColor + " scales";
	}

}
