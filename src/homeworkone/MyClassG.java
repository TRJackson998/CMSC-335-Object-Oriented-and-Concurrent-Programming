package homeworkone;
/*
 * HW 1 Problem 5
 * Given all the problems identified in problems 1 through 4, 
 * explain in detail why the following code works, ie, compiles without errors or warnings.
 */

import java.util.List;

// original
public class MyClassG {
    public static void main(String args[]) {
        MyClassH m = new MyClassH(23, true); // accessing public constructor, passing in correct number of args
    } // end main
} // end class MyClassG

class MyClassH {
    int v = 12;

    // constructors correctly declared w/no return
    public MyClassH(int x, boolean b) {
        this(x); // inside the class, can call private constructor
    }

    private MyClassH(int pV) {
        v = pV; // setting MyClassH.v, not declaring a new local variable
    }

} // end class MyClassH
