/*
 * Jackson, Terrence
 * CMSC 335 Project 2
 * 04.06.2024
 * Summary:
 * Torus child class of ThreeDimensionalShape
 */

package projecttwo.shapes;

public class Torus extends ThreeDimensionalShape {
    // donut shape
    private final double majorRadius;
    private final double minorRadius;

    /*
     * Constructor that takes in two double arguments for major and minor radii,
     * calls the parent constructor to set volume value,
     * and sets object's radius values.
     */
    public Torus(double majorRadius, double minorRadius) {
        // V = 2 * pi^2 * R * r^2
        super(((2 * Math.pow(Math.PI, 2)) * majorRadius * (Math.pow(minorRadius, 2))),
                "./src/projecttwo/images/torus.jpg");
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public double getMajorRadius() {
        return this.majorRadius;
    }

    public double getMinorRadius() {
        return this.minorRadius;
    }

    /*
     * Overriden to return a string describing the torus by its name.
     */
    @Override
    public String getName() {
        return "Torus";
    }

    /*
     * Overriden to return a string describing the torus by its radius.
     */
    @Override
    public String toString() {
        return super.toString() + "Major Radius: " + myDecimalFormat.format(getMajorRadius()) + "\nMinor Radius: "
                + myDecimalFormat.format(getMinorRadius());
    }
}
