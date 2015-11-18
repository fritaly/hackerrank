package com.github.fritaly.hackerrank.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int tests = Integer.parseInt(scanner.nextLine());
		
		while (tests > 0) {
			String pattern = scanner.nextLine();
			
			try {
				Pattern.compile(pattern);

				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");				
			}
		}
	}
}