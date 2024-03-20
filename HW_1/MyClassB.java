package HW_1;
/*
 * HW 1 Problem 2
 * What is wrong with the following program and how should it be fixed?
 */

// original
// public class MyClassB {
//     int v = 12;

//     public void MyClassB(int pV) {
//         v = pV;
//     }

//     public static void main(String args[]) {
//         MyClassB m = new MyClassB(23);
//     } // end main
// } // end class MyClassB

// fixed
public class MyClassB {
    int v = 12;

    public MyClassB(int pV) { // constructor, doesn't return void
        v = pV;
    }

    public static void main(String args[]) {
        MyClassB m = new MyClassB(23);
    } // end main
} // end class MyClassB