package chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import chapter2.Account;

public class Main {
	public static void main(String[] args) {
//		ラムダ式
		Function<String, Integer> func =
				(String s) -> { return s.length(); };
		int n = func.apply("Java");
		System.out.println("文字列『Java』は" + n + "文字です");
		
		List<Account> list = new ArrayList<>();

		Collections.sort(list, (x, y) -> (x.getZandaka() - y.getZandaka()));

//		Stream API
		List<Hero> heros = new ArrayList<>();
		
		heros.add(new Hero("ミナト", 100));
		heros.add(new Hero("カイト", 0));
		
//		herosのなかにHPが0の要素が存在するかを判定
		boolean knockeOut =
				heros.stream().anyMatch(h -> h.getHp() == 0);
		if (knockeOut) System.out.println("戦闘不能の勇者がいます");
		
		
//		herosの各要素に関数を適用
		System.out.println("全勇者↓");
		heros.stream().forEach(h -> {
			System.out.println("勇者" + h.getName());
		});
		
//		herosの最初の要素を取得
		Optional<Hero> hopt = heros.stream().findFirst();
		if (hopt.isPresent()) {
			System.out.println("先頭は" + hopt.get().getName());
		}
		
//		herosの各要素のHPを比較し、最大の要素を取得
		Optional<Hero> hopt2 = heros.stream().max((x,y) -> (x.getHp() - y.getHp()));
		if (hopt2.isPresent()) {
			System.out.println("最大HPの勇者は" + hopt.get().getName());
		}
		
//		herosの中からHPが0の要素を3つ取り出し、名前をknockeOutNameリストに格納
		List<String> knockeOutNames = heros.stream()
				.filter(h -> h.getHp() == 0)
				.limit(3)
				.map(h -> h.getName())
				.collect(Collectors.toList());
		
		System.out.println("戦闘不能の勇者↓");
		knockeOutNames.stream().forEach(h -> {
			System.out.println(h);
		});
	}
}
