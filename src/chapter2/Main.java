package chapter2;

public class Main {
	public static void main(String[] args) {
		Pocket<String> p = new Pocket<>();
		p.put("1992");
		String s = p.get();
		System.out.println(s);
		
	}
}
