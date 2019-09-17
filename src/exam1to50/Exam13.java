package exam1to50;

import java.io.File;
import java.io.IOException;

public class Exam13 {

	// 删除本目录以及子目录下所有的.class文件
	public static void main(String[] args) throws IOException {
		recDelete("E:\\test");
	}

	public static void recDelete(String dirName) throws IOException {
		File[] listOfFiles = new File(dirName).listFiles();
		if (listOfFiles != null && listOfFiles.length > 0) {
			for (File aFile : listOfFiles) {
				if (aFile.isDirectory()) {
					recDelete(aFile.getAbsolutePath());
				} else {
					if (aFile.getName().endsWith(".class"))
						aFile.delete();
				}
			}
		}
	}

}