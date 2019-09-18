package exam51to100;

import java.util.ResourceBundle;

public class Exam99 {

    static class Resource implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("Close-");
        }

        public void open() {
            System.out.println("Open-");
        }

    }

    public static void main(String[] args) {
        Resource res1 = new Resource();
        try {
            res1.open();
            res1.close();
        } catch (Exception e) {
            System.out.println("Exception - 1");
        }
        try (Resource res2 = new Resource()) {                                //line 1
            res2.open();
        } catch (Exception e) {
            System.out.println("Exception - 2");
        }
    }
}
