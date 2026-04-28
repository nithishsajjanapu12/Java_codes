package com.javastring;

public class StringDemo8 {

	public static void main(String[] args) {
		System.out.println("MAin method started");
		String str = "going2 to3 school4 iam1";
		String[] words = str.split("\\s");
		String res[] = new String[words.length];

		for (String word : words) {
			char ch = word.charAt(word.length() - 1);

			String wrd = word.substring(0, word.length() - 1);

//			System.out.println(ch+" "+wrd);

			int pos = Integer.parseInt(ch + "");
			res[pos - 1] = wrd;

		}

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
}

	}


