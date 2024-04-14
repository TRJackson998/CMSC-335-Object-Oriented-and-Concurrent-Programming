/*
 * Jackson, Terrence
 * CMSC 335 Project 2
 * 04.06.2024
 * Summary:
 * Cube child class of ThreeDimensionalShape
 */

package projecttwo.shapes;

public class Cube extends ThreeDimensionalShape {
    private final double sideLength;

    /*
     * Constructor that takes in one double argument for sideLength,
     * calls the parent constructor to set volume value,
     * and sets object's sideLength value.
     */
    public Cube(double sideLength) {
        // V = s * s * s
        super((sideLength * sideLength * sideLength), "./src/projecttwo/images/cube.png");
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return this.sideLength;
    }

    /*
     * Overriden to return a string describing the cube by its name.
     */
    @Override
    public String getName() {
        return "Cube";
    }

    /*
     * Overriden to return a string describing the cube by its side length.
     */
    @Override
    public String toString() {
        return super.toString() + "Side Length: " + myDecimalFormat.format(getSideLength());
    }
}
