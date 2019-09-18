package exam51to100;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exam76 {

    static class TechName {
        String techName;

        TechName(String techName) {
            this.techName = techName;
        }
    }

    public static void main(String[] args) {
        List<TechName> tech = Arrays.asList(
                new TechName("Java-"),
                new TechName("Oracle DB-"),
                new TechName("J2EE-")
        );
        Stream<TechName> stre = tech.stream();
        //line n1
        stre.map(a-> a.techName).forEach(System.out::print);
    }
}
