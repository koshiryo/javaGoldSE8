package exam101to150;

import java.io.Console;

public class Exam107 {

	// 本题需在命令行中运行
	
    public static void main(String[] args) {
        Console console = System.console();
        char[] pass = console.readPassword("Enter password:");		//line n1
        String password = new String(pass);							//line n2
    }
}
