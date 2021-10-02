package chapter6.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		String ifn = args[0];
		String ofn = args[1];
		FileInputStream fis = new FileInputStream(ifn);
		FileOutputStream fos = new FileOutputStream(ofn, true);
		int i = fis.read();
		while (i != -1) {
			fos.write(i);
			fos.flush();
			i = fis.read();
		}
		fis.close();
		fos.close();
		
	}
}
