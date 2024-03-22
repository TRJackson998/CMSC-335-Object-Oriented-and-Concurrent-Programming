package projectone.prof_example.src.pets;

/*
 * CMSC 335: programming sample
 * Dr. Vergamini * Dog subclass, with breed as additional characteristics
 */
public class Dog extends Animal {

	private final String breed;

	public Dog(String name, int age, String breed) {
		super(name, "Dog", 4, age);
		this.breed = breed;
	}

	@Override
	public String getDescriptive() {
		return species + " " + breed;
	}

}
