package com.github.fritaly.hackerrank

class FunnyString {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfTests = reader.readLine() as int

		numberOfTests.times {
			def string = reader.readLine()
			def reverse = string.reverse()

			def funny = true
			
			for(int i=0; i < string.length() - 1; i++) {
				def delta1 = Math.abs(string.charAt(i) - string.charAt(i + 1))
				def delta2 = Math.abs(reverse.charAt(i) - reverse.charAt(i + 1))
				
				if (delta1 != delta2) {
					funny = false
					break
				}
			}
			
			println funny ? "Funny" : "Not Funny"
		}
	}
}