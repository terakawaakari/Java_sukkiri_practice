package chapter7;

import java.io.FileReader;

public class CSV {
	public static void main(String[] args) throws Exception {
		String s = "ミナト,アサカ,スガワラ";
		String[] st = s.split(",");
		for (String t: st) {
			System.out.println(t);
		}
		
		FileReader fr = new FileReader("src/chapter7/rpgdata.csv");
//		Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(fr);
//		for (CSVRecord r : records) {
//			String name = r.get(0);
//			String hp = r.get(1);
//			String mp = r.get(2);
//			System.out.println(name + "/" + hp + "/" + mp);
//		}
		fr.close();
	}
}
