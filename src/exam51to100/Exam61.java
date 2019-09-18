package exam51to100;

public class Exam61 {
    public static void main(String[] args) throws Exception {
        Moveable<Integer> animal = n -> System.out.println("Running" + n);
        animal.run(100);
        animal.walk(20);
    }

    public interface Moveable<Integer> {
        public default void walk(Integer distance) {
            System.out.println("Walking");
        }

        public void run(Integer distance);
    }
}

