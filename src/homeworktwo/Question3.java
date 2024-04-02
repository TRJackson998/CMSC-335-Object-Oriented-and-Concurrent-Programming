package homeworktwo;

public class Question3 {
    public class H2ClassC {
        int a;

        H2ClassC(int a) {
            this.a = a;
        }
    } // end class H2ClassC

    class H2ClassD extends H2ClassC {
        H2ClassD(int b) {
            super(b);
        }
    } // end class H2ClassD
}
