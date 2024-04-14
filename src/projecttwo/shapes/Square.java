/*
 * Jackson, Terrence
 * CMSC 335 Project 2
 * 04.06.2024
 * Summary:
 * Square child class of TwoDimensionalShape
 */

package projecttwo.shapes;

import java.awt.Graphics;

public class Square extends TwoDimensionalShape {
    private final double sideLength;

    /*
     * Constructor that takes in one double argument for sideLength,
     * calls the parent constructor to calculate/set area value,
     * and sets object's sideLength value.
     */
    public Square(double sideLength) {
        // A = s * s
        super(sideLength * sideLength);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return this.sideLength;
    }

    /*
     * Overriden to return a string describing the square by its name.
     */
    @Override
    public String getName() {
        return "Square";
    }

    /*
     * Overriden to return a string describing the square by its sideLength.
     */
    @Override
    public String toString() {
        return super.toString() + "SideLength: " + myDecimalFormat.format(getSideLength());
    }

    /*
     * Draw the square using the side length
     * Graphics requires integer coordinates,
     * cast to int after calculations for best accuracy.
     * Separated calculation into a few extra variables for readability
     */
    @Override
    public void draw(Graphics graphics) {
        int coordinate = (int) (200 - sideLength / 2);
        graphics.drawRect(coordinate, coordinate, (int) sideLength, (int) sideLength);
    }
}
