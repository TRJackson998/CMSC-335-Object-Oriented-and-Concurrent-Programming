/*
 * Jackson, Terrence
 * CMSC 335 Project 1
 * 03.24.2024
 * Summary:
 * Sphere child class of ThreeDimensionalShape
 */

package projectone;

public class Sphere extends ThreeDimensionalShape {
    private final double radius;

    /*
     * Constructor that takes in one double argument for radius,
     * calls the parent constructor to calculate/set volume value,
     * and sets object's radius value.
     */
    public Sphere(double radius) {
        // V = 4/3 * pi * r^3
        super((4 / 3), Math.PI, Math.pow(radius, 3));
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    /*
     * Overriden to return a string describing the sphere by its volume.
     */
    @Override
    public String toString() {
        return "The volume of the Sphere is " + myDecimalFormat.format(getVolume()) + ".";
    }
}
