/*
 * Jackson, Terrence
 * CMSC 335 Project 1
 * 03.27.2024
 * Summary:
 * Circle child class of TwoDimensionalShape
 */

package projectone;

public class Circle extends TwoDimensionalShape {
    private final double radius;

    /*
     * Constructor that takes in one double argument for radius,
     * calls the parent constructor to set area value,
     * and sets object's radius value.
     */
    public Circle(double radius) {
        // A = pi * r^2
        super((Math.PI * Math.pow(radius, 2)));
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    /*
     * Overriden to return a string describing the circle by its area.
     */
    @Override
    public String toString() {
        return "The area of the Circle is " + myDecimalFormat.format(getArea()) + ".";
    }
}
