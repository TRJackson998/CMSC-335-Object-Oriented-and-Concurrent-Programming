/*
 * Jackson, Terrence
 * CMSC 335 Project 1
 * 03.24.2024
 * Summary:
 * Triangle child class of TwoDimensionalShape
 */

package projectone;

public class Triangle extends TwoDimensionalShape {
    // right triangle
    private final double base;
    private final double height;
    private final double hypotenuse;

    /*
     * Constructor that takes in three double arguments for base, height, and
     * hypotenuse, calls the parent constructor to calculate/set area value,
     * and sets object's base, height, and hypotenuse values.
     */
    public Triangle(double base, double height, double hypotenuse) {
        super(base, height);
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    public double getHypotenuse() {
        return this.hypotenuse;
    }

    /*
     * Overriden to return a string describing the triangle by its area.
     */
    @Override
    public String toString() {
        return "The area of the Triangle is " + myDecimalFormat.format(getArea()) + ".";
    }
}
