package chapter2.practice;

import static chapter2.practice.KeyType.*;

public class Main {
	public static void main(String[] args) {
		StrongBox<String> box = new StrongBox<>(PADLOCK);
		box.put("金庫");
		System.out.println(box.getItem());
		System.out.println("1回施行" + box.getType());

		int cnt = 0;
		while (cnt <= 1024) {
			box.getType();
			cnt++;
		}
		System.out.println("1024回施行" + box.getType());
	}
}
