package chapter6;

import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

public class TryWithResources {
	public static void main(String[] args){
//		try-with-resources文を用いたファイルへの書き込み
		try (FileWriter fw = new FileWriter("src/chapter6/rpgsave.dat", true);) {
			fw.write('A');
			fw.flush();
		} catch (IOException e) {
			System.out.println("ファイル書き込みエラーです");
		}

//		文字列の読み込み
		String msg = "第1土曜日は資源ゴミの回収です。";
		try (StringReader sr = new StringReader(msg);) {
			System.out.println((char) sr.read());
		} catch (IOException e) {
			System.out.println("文字列の読み込みでエラーが発生しました");
		}

//		バイト配列への書き込み
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream();) {
			baos.write(65);
			baos.write(66);
			byte[] data = baos.toByteArray();
			for (byte b : data) {
				System.out.println(b);
			}
		} catch (IOException e) {
			System.out.println("バイト配列への書き込みでエラーが発生しました");
		}
	}
}
