/*
 * Jackson, Terrence
 * CMSC 335 Project 1
 * 03.24.2024
 * Summary:
 * Cone child class of ThreeDimensionalShape
 */
package projectone;

public class Cone extends ThreeDimensionalShape {
    // Right circular cone
    private final double radius;
    private final double height;

    /*
     * Constructor that takes in two double arguments for radius and height,
     * calls the parent constructor to calculate/set volume value,
     * and sets object's radius and height values.
     */
    public Cone(double radius, double height) {
        // V = pi * r^2 * (h/3)
        super(Math.PI, Math.pow(radius, 2), (height / 3));
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getRadius() {
        return this.radius;
    }

    /*
     * Overriden to return a string describing the cone by its volume.
     */
    @Override
    public String toString() {
        return "The volume of the Cone is " + myDecimalFormat.format(getVolume()) + ".";
    }
}
