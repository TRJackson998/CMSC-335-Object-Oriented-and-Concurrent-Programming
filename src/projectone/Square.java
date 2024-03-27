/*
 * Jackson, Terrence
 * CMSC 335 Project 1
 * 03.24.2024
 * Summary:
 * Square child class of TwoDimensionalShape
 */

package projectone;

public class Square extends TwoDimensionalShape {
    private final double sideLength;

    /*
     * Constructor that takes in one double argument for sideLength,
     * calls the parent constructor to calculate/set area value,
     * and sets object's sideLength value.
     */
    public Square(double sideLength) {
        // A = s * s
        super(sideLength, sideLength);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return this.sideLength;
    }

    /*
     * Overriden to return a string describing the square by its area.
     */
    @Override
    public String toString() {
        return "The area of the Square is " + myDecimalFormat.format(getArea()) + ".";
    }
}
