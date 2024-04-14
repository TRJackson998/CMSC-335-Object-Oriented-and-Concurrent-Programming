/*
 * Jackson, Terrence
 * CMSC 335 Project 2
 * 04.06.2024
 * Summary:
 * Parent class for Two and ThreeDimensionalShape
 * Every shape has at least one dimension
 */

package projecttwo.shapes;

import java.text.DecimalFormat;
import java.awt.Graphics;

public abstract class Shape {
    // init variable to use in formatting decimal point numbers in child classes
    protected static final DecimalFormat myDecimalFormat = new DecimalFormat("0.00");

    // methods to be used/implemented by child classes
    protected abstract String getName();

    protected abstract void draw(Graphics graphics);
}
