package exam51to100;

public class Exam94 {
    String pname;

    public Exam94(String pname) {
        this.pname = pname;
    }

    public static void main(String[] args) {
        Exam94 p1 = new Exam94("PowerCharger");
        Exam94 p2 = p1;
        System.out.println(p1.equals(p2));
        Exam94 p3 = new Exam94("PowerCharger");
        System.out.println(p1.equals(p3));

    }
}
