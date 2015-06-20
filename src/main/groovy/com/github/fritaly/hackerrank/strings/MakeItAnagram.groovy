package com.github.fritaly.hackerrank.strings

class MakeItAnagram {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def s1 = reader.readLine()
		def s2 = reader.readLine()
		
		def chars1 = [:], chars2 = [:]
		
		s1.each { c ->
			chars1[c] = (chars1[c] ?: 0) + 1
		}
		s2.each { c ->
			chars2[c] = (chars2[c] ?: 0) + 1
		}
		
		def chars = (s1+s2).toCharArray().toList().unique().sort().collect { it as String }
		def result = 0
		
		chars.each { c ->
			result += Math.abs((chars1[c] ?: 0) - (chars2[c] ?: 0))
		}
		
		println result
	}
}