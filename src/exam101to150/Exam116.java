package exam101to150;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exam116 {
    int vId;
    String vName;

    public Exam116(int vIdArg, String vNameArg) {
        this.vId = vIdArg;
        this.vName = vNameArg;
    }

    public int getVId() {
        return vId;
    }

    public String getVName() {
        return vName;
    }

    @Override
    public String toString() {
        return vName;

    }

    public static void main(String[] args) {
        List<Exam116> vehicle = Arrays.asList(new Exam116(2, "Car"),
                new Exam116(3, "Bike"), new Exam116(1, "Truck"));
        vehicle.stream()
                //line n1
        		.sorted(Comparator.comparing(Exam116 ::getVName).reversed())    //answer----B改版
              .sorted((v1, v2) -> Integer.compare(v1.getVId(), v2.getVId()))//answer----D
//                .sorted(Comparator.comparing((Exam116 v) -> v.getVId()))    //answer----E
                .forEach(System.out::print);
    }

}
