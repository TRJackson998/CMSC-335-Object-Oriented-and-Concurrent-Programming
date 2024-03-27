/*
 * Jackson, Terrence
 * CMSC 335 Project 1
 * 03.24.2024
 * Summary:
 * Parent class for Two and ThreeDimensionalShape
 * Every shape has at least one dimension
 */

package projectone;

import java.text.DecimalFormat;

public abstract class Shape {
    protected final int numberOfDimensions;

    // init variable to use in formatting decimal point numbers in child classes
    protected static final DecimalFormat myDecimalFormat = new DecimalFormat("0.00");

    /*
     * Constructor that takes in one double argument for numberOfDimensions,
     * and sets object's numberOfDimensions value.
     * Protected constructor for abstract class because only child classes should
     * need to construct an object of this type.
     */
    protected Shape(int numberOfDimensions) {
        this.numberOfDimensions = numberOfDimensions;
    }

    public int getNumberOfDimensions() {
        return this.numberOfDimensions;
    }
}
