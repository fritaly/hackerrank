package com.github.fritaly.hackerrank.strings

class Anagram {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfTests = reader.readLine() as int

		numberOfTests.times {
			def string = reader.readLine()
			int length = string.length() / 2
			def s1 = string.substring(0, length).toCharArray().toList().sort().join()
			def s2 = string.substring(length).toCharArray().toList().sort().join()

			int result = -1

			if (s1.length() == s2.length()) {
				result = 0
				
				def chars1 = [:], chars2 = [:]
				
				s1.each { c ->
					chars1[c] = (chars1[c] ?: 0) + 1
				}
				s2.each { c ->
					chars2[c] = (chars2[c] ?: 0) + 1
				}
				
				def chars = (s1+s2).toCharArray().toList().unique().sort().collect { it as String }
				
				chars.each { c ->
					result += Math.abs((chars1[c] ?: 0) - (chars2[c] ?: 0))
				}
				
				result = result / 2
			}

			println result
		}
	}
}