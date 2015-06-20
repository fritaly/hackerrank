package com.github.fritaly.hackerrank.implementation

class FindDigits {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfTests = reader.readLine() as int

		numberOfTests.times {
			def text = reader.readLine()
			def n = text as int
			def count = text.findAll { c -> (c != '0') && (n % (c as int) == 0) }.size()
			
			println count
		}
	}
}