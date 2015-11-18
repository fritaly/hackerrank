package com.github.fritaly.hackerrank.strings;

import java.util.Scanner;

public class JavaStringToken {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
		String[] words = string.split("[ !,?.\\_'@]");
		
		int count = 0;
		
		for (String word : words) {
			if (!"".equals(word)) {
				count++;
			}
		}
		
		System.out.println(count);
		
		for (String word : words) {
			if (!"".equals(word)) {
				System.out.println(word);
			}
		}
	}
}