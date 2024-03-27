/*
 * Jackson, Terrence
 * CMSC 335 Project 1
 * 03.24.2024
 * Summary:
 * Cylinder child class of ThreeDimensionalShape
 */

package projectone;

public class Cylinder extends ThreeDimensionalShape {
    // right circular cylinder
    private final double radius;
    private final double height;

    /*
     * Constructor that takes in two double arguments for radius and height,
     * calls the parent constructor to calculate/set volume value,
     * and sets object's radius and height values.
     */
    public Cylinder(double radius, double height) {
        // V = pi * r^2 * h
        super((Math.PI * Math.pow(radius, 2) * height));
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
     * Overriden to return a string describing the cylinder by its volume.
     */
    @Override
    public String toString() {
        return "The volume of the Cylinder is " + myDecimalFormat.format(getVolume()) + ".";
    }
}
