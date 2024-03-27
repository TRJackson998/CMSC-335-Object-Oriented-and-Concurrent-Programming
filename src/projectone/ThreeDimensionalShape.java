/*
 * Jackson, Terrence
 * CMSC 335 Project 1
 * 03.24.2024
 * Summary:
 * ThreeDimensionalShape child class of Shape
 * Calculates and sets volume for the shape
 */

package projectone;

public class ThreeDimensionalShape extends Shape {
    private final double dimension2;
    private final double dimension3;
    private final double volume;

    /*
     * Constructor that takes in three double arguments for the three dimensions.
     * Calls the parent constructor to set the
     * number of dimensions value and the first dimension value.
     * Sets the other two dimension values, calculates and sets the volume value.
     */
    public ThreeDimensionalShape(double dimension1, double dimension2, double dimension3) {
        super(3, dimension1);
        this.dimension2 = dimension2;
        this.dimension3 = dimension3;
        this.volume = calculateVolume();

    }

    /*
     * Multiplies the three dimensions together to calculate the volume of the shape
     */
    public double calculateVolume() {
        return getDimension1() * getDimension2() * getDimension3();
    }

    public double getVolume() {
        return this.volume;
    }

    public double getDimension2() {
        return this.dimension2;
    }

    public double getDimension3() {
        return this.dimension3;
    }
}
