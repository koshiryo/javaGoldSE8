package exam51to100;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 此题答案给的是B，但是从运行结果来看应该是D
 */
public class Exam64 {
    public static class Emp {
        private String eName;
        private Integer eAge;

        Emp(String eN, Integer eA) {
            this.eName = eN;
            this.eAge = eA;
        }

        public Integer getEAge() {
            return eAge;
        }

        public String getEName() {
            return eName;
        }
    }

    public static void main(String[] args) throws Exception {
        List<Emp> li = Arrays.asList(new Emp("Sam", 20), new Emp("John", 60), new Emp("Jim", 51));
        Predicate<Emp> agVal = s -> s.getEAge() > 50; //line n1
        li = li.stream().filter(agVal).collect(Collectors.toList());
        Stream<String> names = li.stream().map(Emp::getEName); //line n2
        names.forEach(n -> System.out.print(n + " "));
    }
}
