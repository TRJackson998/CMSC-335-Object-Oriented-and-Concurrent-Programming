package HW_1;
/*
 * HW 1 Problem 3
 * What is wrong with the following program and how should it be fixed?
 */

// original
// public class MyClassD {
//     public static void main(String args[]) {
//         MyClassC m = new MyClassC(23);
//     } // end main
// } // end class MyClassD

// class MyClassC {
//     int v = 12;

//     public MyClassC(int pV) {
//         int v = pV;
//     }

// } // end class MyClassC

// fixed
public class MyClassD {
    public static void main(String args[]) {
        MyClassC m = new MyClassC(23);
    } // end main
} // end class MyClassD

class MyClassC {
    int v = 12;

    public MyClassC(int pV) {
        v = pV; // don't redeclare v
    }

} // end class MyClassC