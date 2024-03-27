/*
 * Jackson, Terrence
 * CMSC 335 Project 1
 * 03.24.2024
 * Summary:
 * Cube child class of ThreeDimensionalShape
 */

package projectone;

public class Cube extends ThreeDimensionalShape {
    private final double sideLength;

    /*
     * Constructor that takes in one double argument for sideLength,
     * calls the parent constructor to calculate/set volume value,
     * and sets object's sideLength value.
     */
    public Cube(double sideLength) {
        // V = s * s * s
        super(sideLength, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return this.sideLength;
    }

    /*
     * Overriden to return a string describing the cube by its volume.
     */
    @Override
    public String toString() {
        return "The volume of the Cube is " + myDecimalFormat.format(getVolume()) + ".";
    }
}
