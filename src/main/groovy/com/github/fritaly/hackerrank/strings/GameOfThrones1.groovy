package com.github.fritaly.hackerrank.strings

class GameOfThrones1 {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def string = reader.readLine()

		def chars = [:]

		for(c in string.toCharArray()) {
			chars[c] = (chars[c] ?: 0) + 1
		}
		
		def palindrome = chars.values().findAll { it % 2 == 1 }.size() <= 1
		
		println palindrome ? 'YES' : 'NO'
	}
}