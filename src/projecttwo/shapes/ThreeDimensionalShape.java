/*
 * Jackson, Terrence
 * CMSC 335 Project 2
 * 004.06.2024
 * Summary:
 * ThreeDimensionalShape child class of Shape
 * Sets volume for the shape
 * Sets/draws image for the shape
 */

package projecttwo.shapes;

import java.awt.Graphics;
import javax.swing.ImageIcon;

public abstract class ThreeDimensionalShape extends Shape {
    private final double volume;
    private final ImageIcon shapeImage;

    /*
     * Constructor that takes in one double argument for volume
     * and one String argument for filename.
     * Sets the volume value.
     * Sets the shapeImage using the file name passed in.
     */
    protected ThreeDimensionalShape(double volume, String file) {
        this.volume = volume;
        shapeImage = new ImageIcon(file);

    }

    public double getVolume() {
        return this.volume;
    }

    /*
     * Overriden to return a string describing the shape by its volume.
     */
    @Override
    public String toString() {
        return getName() + "\n" + "Volume: " + myDecimalFormat.format(getVolume()) + "\n";
    }

    @Override
    protected void draw(Graphics graphics) {
        graphics.drawImage(shapeImage.getImage(), 200, 200, 250, 250, null);
    }
}
