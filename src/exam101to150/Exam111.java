package exam101to150;

public class Exam111 {

    public double applyDiscount(Double price) {
        assert (price > 0);
        return price * 0.50;
    }

    public static void main(String[] args) {
        Exam111 p = new Exam111();
        double newPrice = p.applyDiscount(Double.parseDouble(args[0]));
        System.out.println("New Price: " + newPrice);

    }
}
