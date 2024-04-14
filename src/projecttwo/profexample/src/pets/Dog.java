package projecttwo.profexample.src.pets;

import java.awt.Graphics;

import javax.swing.ImageIcon;

/*
 * CMSC 335: programming sample
 * Dr. Vergamini * Dog subclass, with breed as additional characteristics
 */
public class Dog extends Animal {

	private final String breed;
	final private ImageIcon petImage;

	public Dog(String name, int age, String breed) {
		super(name, "Dog", 4, age);
		this.breed = breed;
		petImage = new ImageIcon("dog.png");
	}

	@Override
	public String getDescriptive() {
		return species + " " + breed;
	}

	public void draw(Graphics graphics) {
		graphics.drawImage(petImage.getImage(), 0, 0, null);
	}

}
