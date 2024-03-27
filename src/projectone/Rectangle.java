/*
 * Jackson, Terrence
 * CMSC 335 Project 1
 * 03.24.2024
 * Summary:
 * Rectangle child class of TwoDimensionalShape
 */

package projectone;

public class Rectangle extends TwoDimensionalShape {
    private final double width;
    private final double height;

    /*
     * Constructor that takes in two double arguments for width and height,
     * calls the parent constructor to calculate/set area value,
     * and sets object's width and height values.
     */
    public Rectangle(double width, double height) {
        // A = w * h
        super(width, height);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    /*
     * Overriden to return a string describing the rectangle by its area.
     */
    @Override
    public String toString() {
        return "The area of the Rectangle is " + myDecimalFormat.format(getArea()) + ".";
    }
}
