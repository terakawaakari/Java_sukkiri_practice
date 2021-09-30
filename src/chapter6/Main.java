package chapter6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		
//		テキストファイル書き込み
		FileWriter fw = new FileWriter("src/chapter6/rpgsave.dat", true);
		
		fw.write('A');
		fw.flush();
		fw.close();
		
//		テキストファイル読み込み
		FileReader fr = new FileReader("src/chapter6/rpgsave.dat");
		System.out.println("全てのデータを読み込んで表示します");
		int i = fr.read();
		while (i != -1) {
			char c = (char) i;
			System.out.println(c);
			i = fr.read();
		}
		System.out.println("ファイルの末尾に到達しました");
		fr.close();
		
//		バイナリファイル書き込み
		FileOutputStream fos =
				new FileOutputStream("src/chapter6/b_rpgsave.dat", true);
		fos.write(65);
		fos.flush();
		fos.close();
		
//		バイナリファイル読み込み
		FileInputStream fis =
				new FileInputStream("src/chapter6/b_rpgsave.dat");
		int j = fis.read();
		while (j != -1) {
			System.out.println(j);
			j = fis.read();
		}
		fis.close();
		
	}
}
