package chapter4.practice;

import java.lang.reflect.Method;

public class Launcher {
	public static void main(String[] args) {
		String cn = args[0];
		String sp = args[1];

		showMemory();
		try {
			Class<?> clazz = Class.forName(cn);
			if (sp.equals("E")) {
				launchExternal(clazz);
			} else if (sp.equals("I")) {
				launchInternal(clazz);
			} else {
				throw new IllegalArgumentException(
						"起動方法の指定が不正です");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}
		showMemory();
		System.exit(0);
	}

//	現在のメモリ使用量を表示するメソッド
	public static void showMemory() {
		long free = Runtime.getRuntime().freeMemory();
		long total = Runtime.getRuntime().totalMemory();
		long usage = (total - free) / 1024 / 1024;
		System.out.println("現在のメモリ使用量：" + usage + "MB");
	}

//	引数で渡されたクラスのメソッド一覧を表示するメソッド
	public static void listMethods(Class<?> clazz) {
		System.out.println("メソッドの一覧を表示します");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println(m.getName());
		}
	}

//	別プロセスとして起動するメソッド
	public static void launchExternal(Class<?> clazz) throws Exception {
		ProcessBuilder pb = new ProcessBuilder("java", clazz.getName());
		Process proc = pb.start();
		proc.waitFor();
	}

//	mainメソッドを呼び出すメソッド
	public static void launchInternal(Class<?> clazz) throws Exception {
		Method m = clazz.getMethod("main", String[].class);
		String[] args = {};
		m.invoke(null, (Object)args);
	}

}
