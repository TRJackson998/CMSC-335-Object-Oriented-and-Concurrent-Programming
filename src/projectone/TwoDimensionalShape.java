/*
 * Jackson, Terrence
 * CMSC 335 Project 1
 * 03.24.2024
 * Summary:
 * TwoDimensionalShape child class of Shape
 * Calculates and sets area for the shape
 */

package projectone;

public class TwoDimensionalShape extends Shape {
    private final double area;
    private final double dimension2;

    /*
     * Constructor that takes in two double arguments for the two dimensions.
     * Calls the parent constructor to set the
     * number of dimensions value and the first dimension value.
     * Sets the other dimension value, calculates and sets the area value.
     */
    public TwoDimensionalShape(double dimension1, double dimension2) {
        super(2, dimension1);
        this.dimension2 = dimension2;
        this.area = calculateArea();

    }

    /*
     * Multiplies the two dimensions together to calculate the area of the shape
     */
    public double calculateArea() {
        return getDimension1() * getDimension2();
    }

    public double getArea() {
        return this.area;
    }

    public double getDimension2() {
        return this.dimension2;
    }
}
