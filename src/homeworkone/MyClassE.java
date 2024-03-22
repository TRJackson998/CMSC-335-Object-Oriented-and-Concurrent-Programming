package homeworkone;
/*
 * HW 1 Problem 4
 * What is wrong with the following program and how should it be fixed?
 */

// original
// public class MyClassE {
//     public static void main(String args[]) {
//         MyClassF m = new MyClassF(23);
//     } // end main
// } // end class MyClassE

// class MyClassF {
//     int v = 12;

//     private MyClassF(int pV) {
//         v = pV;
//     }

// } // end class MyClassF

// fixed
public class MyClassE {
    public static void main(String args[]) {
        MyClassF m = new MyClassF(23);
    } // end main
} // end class MyClassE

class MyClassF {
    int v = 12;

    public MyClassF(int pV) { // private constructor wasn't accessible to MyClassE
        v = pV;
    }

} // end class MyClassF