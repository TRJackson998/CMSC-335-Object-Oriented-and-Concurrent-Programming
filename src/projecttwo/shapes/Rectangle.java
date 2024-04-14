/*
 * Jackson, Terrence
 * CMSC 335 Project 2
 * 04.06.2024
 * Summary:
 * Rectangle child class of TwoDimensionalShape
 */

package projecttwo.shapes;

import java.awt.Graphics;

public class Rectangle extends TwoDimensionalShape {
    private final double width;
    private final double height;

    /*
     * Constructor that takes in two double arguments for width and height,
     * calls the parent constructor to set area value,
     * and sets object's width and height values.
     */
    public Rectangle(double width, double height) {
        // A = w * h
        super((width * height));
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
     * Overriden to return a string describing the Rectangle by its name.
     */
    @Override
    public String getName() {
        return "Rectangle";
    }

    /*
     * Overriden to return a string describing the rectangle by its width and
     * height.
     */
    @Override
    public String toString() {
        return super.toString() + "Width: " + myDecimalFormat.format(getWidth()) + "\nHeight: "
                + myDecimalFormat.format(getHeight());
    }

    /*
     * Draw the rectangle using the width and height
     * Graphics requires integer coordinates,
     * cast to int after calculations for best accuracy.
     * Separated calculation into a few extra variables for readability
     */
    @Override
    public void draw(Graphics graphics) {
        int x = (int) (200 - width / 2);
        int y = (int) (200 - height / 2);
        graphics.drawRect(x, y, (int) width, (int) height);
    }
}
