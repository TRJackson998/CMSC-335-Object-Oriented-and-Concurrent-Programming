/*
 * Jackson, Terrence
 * CMSC 335 Project 2
 * 04.06.2024
 * Summary:
 * TwoDimensionalShape child class of Shape
 * Sets area for the shape 
 */

package projecttwo.shapes;

public abstract class TwoDimensionalShape extends Shape {
    private final double area;

    /*
     * Constructor that takes in one double argument for area.
     * Sets the area value.
     */
    protected TwoDimensionalShape(double area) {
        this.area = area;

    }

    public double getArea() {
        return this.area;
    }

    /*
     * Overriden to return a string describing the shape by its area.
     */
    @Override
    public String toString() {
        return getName() + "\n" + "Area: " + myDecimalFormat.format(getArea()) + "\n";
    }
}
