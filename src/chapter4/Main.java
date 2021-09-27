package chapter4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Properties;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("lsコマンドを実行した結果を表示します");
		ProcessBuilder pb = new ProcessBuilder("ls");
		Process process = pb.start();
		 try (BufferedReader r = new BufferedReader(new InputStreamReader(process.getInputStream(), Charset.defaultCharset()))) {
            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        }

		 System.out.println("利用中のJavaバージョン");
		 System.out.println(System.getProperty("java.version"));

		 Properties p = System.getProperties();
		 Iterator<String> i = p.stringPropertyNames().iterator();
		 System.out.println("システムプロパティ一覧");
		 while (i.hasNext()) {
			 String key = i.next();
			 System.out.println(key + "=");
			 System.out.println(System.getProperty(key));
		 }

		 Class<?> info1 = String.class;
		 System.out.println(info1.getSimpleName());
		 System.out.println(info1.getName());
		 System.out.println(info1.getPackage().getName());
		 System.out.println(info1.isArray());
		 Class<?> info2 = info1.getSuperclass();
		 System.out.println(info2.getName());
		 Class<?> info3 = args.getClass();
		 System.out.println(info3.isArray());

		boolean isErr = true;
		if (isErr) {
			System.out.println("データが壊れています。異常終了します");
			System.exit(1);
		}
		System.out.println("正常終了しました");
	}
}
