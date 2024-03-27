/*
 * Jackson, Terrence
 * CMSC 335 Project 1
 * 03.27.2024
 * Summary:
 * Triangle child class of TwoDimensionalShape
 */

package projectone;

public class Triangle extends TwoDimensionalShape {
    // right triangle
    private final double base;
    private final double height;

    /*
     * Constructor that takes in three double arguments for base, height, and
     * hypotenuse, calls the parent constructor to set area value,
     * and sets object's base, height, and hypotenuse values.
     */
    public Triangle(double base, double height) {
        super((base * height) / 2.0);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    /*
     * Overriden to return a string describing the triangle by its area.
     */
    @Override
    public String toString() {
        return "The area of the Triangle is " + myDecimalFormat.format(getArea()) + ".";
    }
}
