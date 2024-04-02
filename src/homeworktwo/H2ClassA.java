package homeworktwo;

import java.util.ArrayList;

public class H2ClassA {
    ArrayList<H2ClassB> list = new ArrayList<H2ClassB>();

    @Override
    public String toString() {
        StringBuilder listString = new StringBuilder();
        for (H2ClassB item : this.list) {
            listString.append(item);
            listString.append(" ");
        }
        return listString.toString();
    }

    public static void main(String args[]) {
        H2ClassA y = new H2ClassA();
        int[] v = { 4, 3, 7, 5, 99, 3 };
        for (int m : v)
            y.list.add(new H2ClassB(m));
        System.out.println(y);
    } // end main
} // end class H2ClassA

class H2ClassB {
    int x;

    H2ClassB(int a) {
        x = a;
    }

    @Override
    public String toString() {
        return Integer.toString(x);
    }
}
// end H2ClassB
