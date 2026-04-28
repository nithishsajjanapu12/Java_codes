package com.javastring;

public class StringDemo3 {

	public static void main(String[] args) {
		String s = "Dini";
		boolean ifVisited = false;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			boolean isRepeated = false;

			for (int j = 0; j < s.length(); j++) {
				if (i != j && ch == s.charAt(j)) {
					isRepeated = true;
					continue;
				}
			}
			if (!isRepeated) {
				System.out.println("Unique character are : " + ch);
				ifVisited = true;

			}
		}
		if (!ifVisited) {
			System.out.println("No non-repeating character found.");
		}
	}

}
