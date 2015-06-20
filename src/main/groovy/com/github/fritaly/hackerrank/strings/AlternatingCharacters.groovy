package com.github.fritaly.hackerrank.strings

class AlternatingCharacters {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfTests = reader.readLine() as int
		
		numberOfTests.times {
			def string = reader.readLine()
			def count = 0
			
			for(int i=0; i< string.length() - 1; i++) {
				if (string.charAt(i) == string.charAt(i+1)) {
					count++
				}
			}
			
			println count
		}
	}
}