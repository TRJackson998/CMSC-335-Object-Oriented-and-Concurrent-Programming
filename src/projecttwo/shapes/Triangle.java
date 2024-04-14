/*
 * Jackson, Terrence
 * CMSC 335 Project 2
 * 04.06.2024
 * Summary:
 * Triangle child class of TwoDimensionalShape
 */

package projecttwo.shapes;

import java.awt.Graphics;

public class Triangle extends TwoDimensionalShape {
    // right triangle
    private final double base;
    private final double height;

    /*
     * Constructor that takes in three double arguments for base and height, calls
     * the parent constructor to set area value,
     * and sets object's base and height values.
     */
    public Triangle(double base, double height) {
        // A = (b * h) / 2
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
     * Overriden to return a string describing the triangle by its name.
     */
    @Override
    public String getName() {
        return "Triangle";
    }

    /*
     * Overriden to return a string describing the triangle by its base and
     * height.
     */
    @Override
    public String toString() {
        return super.toString() + "Base: " + myDecimalFormat.format(getBase()) + "\nHeight: "
                + myDecimalFormat.format(getHeight());
    }

    /*
     * Draw the triangle using the base and height
     * Graphics requires integer coordinates,
     * cast to int after calculations for best accuracy.
     * Separated calculation into a few extra variables for readability
     */
    @Override
    public void draw(Graphics graphics) {
        int x = (int) (200 + base);
        int y = (int) (200 + height);
        int[] xPoints = { 200, x, 200 };
        int[] yPoints = { 200, 200, y };
        graphics.drawPolygon(xPoints, yPoints, 3);
    }
}
