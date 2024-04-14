/*
 * Jackson, Terrence
 * CMSC 335 Project 2
 * 04.06.2024
 * Summary:
 * Cylinder child class of ThreeDimensionalShape
 */

package projecttwo.shapes;

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
        super((Math.PI * Math.pow(radius, 2) * height), "./src/projecttwo/images/cylinder.jpg");
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
     * Overriden to return a string describing the cylinder by its name.
     */
    @Override
    public String getName() {
        return "Cylinder";
    }

    /*
     * Overriden to return a string describing the cylinder by its radius and
     * height.
     */
    @Override
    public String toString() {
        return super.toString() + "Radius: " + myDecimalFormat.format(getRadius()) + "\nHeight: "
                + myDecimalFormat.format(getHeight());
    }
}
