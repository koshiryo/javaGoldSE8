package exam51to100;

public class Exam63 {
    class FuelNotAvailException extends Exception {
    }

    static class Vehicle {
        protected void ride() throws Exception {                  //line n1
            System.out.println("Happy Journey!");
        }
    }

    static class SolarVehicle extends Vehicle {
        public void ride() throws Exception {                       //line n2
            super.ride();
        }
    }

    public static void main(String[] args) throws FuelNotAvailException, Exception {
        Vehicle v = new SolarVehicle();
        v.ride();
    }
}
