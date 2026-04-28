package com.javastring;

public class StringDemo1 {

	public static void main(String[] args) {
		String s = "Nithish";
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			boolean isvisted = false;

			for (int j = 0; j < i; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					isvisted = true;
					break;

				}
			}
			if (isvisted) {
				continue;
			}
			for (int k = 0; k < s.length(); k++) {
				if (s.charAt(i) == s.charAt(k)) {
					count++;
				}
			}
			System.out.println(s.charAt(i) + "-" + count);
		}

	}
}

