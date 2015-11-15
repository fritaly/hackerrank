package com.github.fritaly.hackerrank.strings;

import java.util.Scanner;

public class JavaStringCompare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		int k = scanner.nextInt();

		String smallest = null, largest = null;
		
		for (int i = 0; i < string.length() - k + 1; i++) {
			String substring = string.substring(i, i + k);
			
			if (smallest == null || (smallest.compareTo(substring) > 0)) {
				smallest = substring;
			}
			if (largest == null || (largest.compareTo(substring) < 0)) {
				largest = substring;
			}
		}
		
		System.out.println(smallest);
		System.out.println(largest);
	}
}