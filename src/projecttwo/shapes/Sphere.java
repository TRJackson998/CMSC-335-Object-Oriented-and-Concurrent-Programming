/*
 * Jackson, Terrence
 * CMSC 335 Project 2
 * 04.06.2024
 * Summary:
 * Sphere child class of ThreeDimensionalShape
 */

package projecttwo.shapes;

public class Sphere extends ThreeDimensionalShape {
    private final double radius;

    /*
     * Constructor that takes in one double argument for radius,
     * calls the parent constructor to set volume value,
     * and sets object's radius value.
     */
    public Sphere(double radius) {
        // V = 4/3 * pi * r^3
        super(((4.0 / 3.0) * Math.PI * Math.pow(radius, 3)), "./src/projecttwo/images/sphere.jpg");
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    /*
     * Overriden to return a string describing the sphere by its name.
     */
    @Override
    public String getName() {
        return "Sphere";
    }

    /*
     * Overriden to return a string describing the sphere by its radius.
     */
    @Override
    public String toString() {
        return super.toString() + "Radius: " + myDecimalFormat.format(getRadius());
    }

}
