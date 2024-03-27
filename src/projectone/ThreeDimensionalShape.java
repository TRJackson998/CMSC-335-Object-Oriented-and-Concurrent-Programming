/*
 * Jackson, Terrence
 * CMSC 335 Project 1
 * 03.27.2024
 * Summary:
 * ThreeDimensionalShape child class of Shape
 * Sets volume for the shape
 */

package projectone;

public class ThreeDimensionalShape extends Shape {
    private final double volume;

    /*
     * Constructor that takes in one double argument for volume.
     * Calls the parent constructor to set the number of dimensions value.
     * Sets the volume value.
     */
    public ThreeDimensionalShape(double volume) {
        super(3);
        this.volume = volume;

    }

    public double getVolume() {
        return this.volume;
    }
}
