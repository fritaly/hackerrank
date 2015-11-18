package com.github.fritaly.hackerrank.strings;

public class JavaRegex {

	String part = "([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])";
	
	String pattern = String.format("%s\\.%s\\.%s\\.%s", part, part, part, part);
}