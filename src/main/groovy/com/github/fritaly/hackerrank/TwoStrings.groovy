package com.github.fritaly.hackerrank

class TwoStrings {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfTests = reader.readLine() as int

		numberOfTests.times {
			def a = reader.readLine()
			def b = reader.readLine()
			def chars1 = a.toCharArray().toList().unique()
			def chars2 = b.toCharArray().toList().unique()
			
			println chars1.intersect(chars2) ? 'YES' : 'NO'
		}
	}
}