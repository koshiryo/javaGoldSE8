package exam51to100;

import java.io.IOException;

public class Exam51 {
    static class Folder implements AutoCloseable {//line n1

        //line n2
        public void open() {
            System.out.print("Open");
        }

        @Override
        public void close() throws IOException {
            System.out.print("Close");
        }
    }

    public static void main(String[] args) throws Exception {
        try (Folder f = new Folder()) {
            f.open();
        }
    }
}
