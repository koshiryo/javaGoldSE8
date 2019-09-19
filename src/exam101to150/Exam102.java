package exam101to150;

public class Exam102 {

    static class Engine {
        double fuelLevel;

        Engine(int fuelLevel) {
            this.fuelLevel = fuelLevel;
        }

        public void start() {
            //line n1
            assert fuelLevel > 0 : "Impossible fuel";
            System.out.println("Started");

        }

        public void stop() {
            System.out.println("Stopped");
        }

    }

    public static void main(String[] args) {
        new Engine(-1).start();
    }
}
