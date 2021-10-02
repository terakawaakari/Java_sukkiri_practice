package chapter6.practice;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Main {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("起動パラメータの指定が不正です");
			return;
		}	
		String ifn = args[0];
		String ofn = args[1];
		
		try (
			FileInputStream fis = new FileInputStream(ifn);
			FileOutputStream fos = new FileOutputStream(ofn, true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			GZIPOutputStream zos = new GZIPOutputStream(bos);)
		{
			int i = fis.read();
			while (i != -1) {
				zos.write(i);
				i = fis.read();
			}
			zos.flush();
		} catch (IOException e) {
			System.out.println("エラーが発生しました");
		}
	}
}
