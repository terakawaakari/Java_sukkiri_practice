package chapter4.practice;

import java.util.Locale;

public class MemoryEater {
	public static void main(String[] args) {
		Locale loc = Locale.getDefault();
		String lang = loc.getLanguage();
		if (lang.equals("ja")) {
			System.out.println("メモリを消費しています...");
		} else {
			System.out.println("eating memory...");
		}
		long[] memory = new long[1280000];
		for (int i = 0; i < memory.length; i++) {
			memory[i] = i;
		}
	}
}
