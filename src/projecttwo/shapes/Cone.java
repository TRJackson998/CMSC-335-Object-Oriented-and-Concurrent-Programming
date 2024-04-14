/*
 * Jackson, Terrence
 * CMSC 335 Project 2
 * 04.06.2024
 * Summary:
 * Cone child class of ThreeDimensionalShape
 */
package projecttwo.shapes;

public class Cone extends ThreeDimensionalShape {
    // Right circular cone
    private final double radius;
    private final double height;

    /*
     * Constructor that takes in two double arguments for radius and height,
     * calls the parent constructor to set volume value,
     * and sets object's radius and height values.
     */
    public Cone(double radius, double height) {
        // V = pi * r^2 * (h/3)
        super((Math.PI * Math.pow(radius, 2) * (height / 3.0)), "./src/projecttwo/images/cone.png");
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
     * Overriden to return a string describing the cone by its name.
     */
    @Override
    public String getName() {
        return "Cone";
    }

    /*
     * Overriden to return a string describing the cone by its radius and height.
     */
    @Override
    public String toString() {
        return super.toString() + "Radius: " + myDecimalFormat.format(getRadius()) + "\nHeight: "
                + myDecimalFormat.format(getHeight());
    }

}
