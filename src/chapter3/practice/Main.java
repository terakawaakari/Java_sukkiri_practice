package chapter3.practice;

public class Main {
	public static void main(String[] args) {
		FuncList list = new FuncList();
		Func1 f1 = FuncList::isOdd;
		Func2 f2 = list::passCheck;
		
		System.out.println(f1.isOdd(15));
		System.out.println(f2.passCheck(80, "佐藤"));
	}
}
