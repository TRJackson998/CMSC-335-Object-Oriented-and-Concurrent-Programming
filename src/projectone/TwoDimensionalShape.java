/*
 * Jackson, Terrence
 * CMSC 335 Project 1
 * 03.27.2024
 * Summary:
 * TwoDimensionalShape child class of Shape
 * Sets area for the shape
 */

package projectone;

public class TwoDimensionalShape extends Shape {
    private final double area;

    /*
     * Constructor that takes in one double argument for area.
     * Calls the parent constructor to set the number of dimensions value.
     * Sets the area value.
     */
    public TwoDimensionalShape(double area) {
        super(2);
        this.area = area;

    }

    public double getArea() {
        return this.area;
    }
}
