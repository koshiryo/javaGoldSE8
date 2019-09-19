package exam101to150;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Exam130 {
    String name;
    Integer price;

    Exam130(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public void printVal() {
        System.out.print(name + " Price:" + price + " ");
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public static void main(String[] args) {
        List<Exam130> li = Arrays.asList(new Exam130("TV",1000),new Exam130("Refrigerator",2000));
        Consumer<Exam130>raise=e->e.setPrice(e.getPrice()+100);
        li.forEach(raise);
        li.stream().forEach(Exam130::printVal);
    }

}
