package exam101to150;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Exam137 {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("E://version.txt");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr);) {
            if (br.markSupported()) {
                System.out.print((char) br.read());
                br.mark(2);
                System.out.print((char) br.read());
                br.reset();
                System.out.print((char) br.read());
                System.out.print((char) br.read());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
