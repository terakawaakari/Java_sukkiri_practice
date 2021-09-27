package chapter3.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		Function<Integer, Boolean> f1 = (x) -> {return (x % 2 == 1);};
		Func2 f2 = (point, name) -> {return name + "さんは" + (point > 65 ? "合格" : "不合格");};

		System.out.println(f1.apply(15));
		System.out.println(f2.passCheck(80, "佐藤"));


		List<String> names = new ArrayList<>();
		names.add("大江岳人");
		names.add("菅原拓真");
		names.add("湊雄輔");
		names.add("朝香あゆみ");

		names.stream().forEach(name -> {
			if (name.length() <= 4) {
				System.out.println(name + "さん");
			}
		});
	}
}
