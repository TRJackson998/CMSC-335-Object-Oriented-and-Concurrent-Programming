/*
 * Jackson, Terrence
 * CMSC 335 Project 2
 * 04.06.2024
 * Summary:
 * Circle child class of TwoDimensionalShape
 */

package projecttwo.shapes;

import java.awt.Graphics;

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
        return radius;
    }

    /*
     * Overriden to return a string describing the circle by its name.
     */
    @Override
    public String getName() {
        return "Circle";
    }

    /*
     * Overriden to return a string describing the circle by its radius.
     */
    @Override
    public String toString() {
        return super.toString() + "Radius: " + myDecimalFormat.format(getRadius());
    }

    /*
     * Draw the circle using the radius
     * Graphics requires integer coordinates,
     * cast to int after calculations for best accuracy.
     * Separated calculation into a few extra variables for readability
     */
    @Override
    public void draw(Graphics graphics) {
        int x = (int) (200 - radius);
        int y = (int) (200 - radius);
        int diameter = (int) (2 * radius);
        graphics.drawOval(x, y, diameter, diameter);
    }

}
