package exam151to166;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exam157 {

	public static void main(String[] args) throws IOException {
		writeFiles();
	}

	public static void writeFiles() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("E://data.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("E://alldata.txt"));
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.append(line + "\n");
		}
		bw.flush();
	}

}