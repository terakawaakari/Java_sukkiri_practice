package chapter3.practice;

public class Main {
	public static void main(String[] args) {
		Func1 f1 = (x) -> {return (x % 2 == 1);};
		Func2 f2 = (point, name) -> {return name + "さんは" + (point > 65 ? "合格" : "不合格");};
		
		System.out.println(f1.isOdd(15));
		System.out.println(f2.passCheck(80, "佐藤"));
	}
}
