package HW_1;
/*
 * HW 1 Problem 1
 * What is wrong with the following program and how should it be fixed?
 */

// original
// public class MyClassA {
//     int v = 12;

//     public MyClassA(int pV) {
//         v = pV;
//     }

//     public static void main(String args[]) {
//         MyClassA m = new MyClassA();
//     } // end main
// } // end class MyClassA

// fixed
public class MyClassA {
    int v = 12;

    public MyClassA(int pV) {
        v = pV;
    }

    public static void main(String args[]) {
        MyClassA m = new MyClassA(12); // constructor takes an arg
    } // end main
} // end class MyClassA