/*
 * Jackson, Terrence
 * CMSC 335 Project 1
 * 03.24.2024
 * Summary:
 * Torus child class of ThreeDimensionalShape
 */

package projectone;

public class Torus extends ThreeDimensionalShape {
    // donut shape
    private final double majorRadius;
    private final double minorRadius;

    /*
     * Constructor that takes in two double arguments for major and minor radii,
     * calls the parent constructor to calculate/set volume value,
     * and sets object's radius values.
     */
    public Torus(double majorRadius, double minorRadius) {
        // V = 2 * pi^2 * R * r^2
        super((2 * Math.pow(Math.PI, 2)), majorRadius, (Math.pow(minorRadius, 2)));
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public double getMajorRadius() {
        return this.majorRadius;
    }

    public double getminorRadius() {
        return this.minorRadius;
    }

    /*
     * Overriden to return a string describing the torus by its volume.
     */
    @Override
    public String toString() {
        return "The volume of the Torus is " + myDecimalFormat.format(getVolume()) + ".";
    }
}
