package br.com.joaojose.questao8;

public class Questao8 {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = merge(a, b);
		System.out.println(c);
	}

	private static int merge(int a, int b) {
		String aStr = String.valueOf(a);
		String bStr = String.valueOf(b);
		int length = aStr.length() + bStr.length();
		StringBuilder cStr = new StringBuilder();
		for (int i = 0; i < length; i++) {
			if (aStr.length() > i) {
				cStr.append(String.valueOf(aStr.charAt(i)));
			}
			if (bStr.length() > i) {
				cStr.append(String.valueOf(bStr.charAt(i)));
			}
		}
		int c = Integer.parseInt(cStr.toString());
		if (c > 1000000) {
			c = -1;
		}
		return c;
	}
}
