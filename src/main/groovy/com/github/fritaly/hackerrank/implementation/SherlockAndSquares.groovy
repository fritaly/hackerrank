package com.github.fritaly.hackerrank.implementation

class SherlockAndSquares {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfTests = reader.readLine() as int

		numberOfTests.times {
			def (a, b) = reader.readLine().split(' ').collect { it as int }
			def lower = Math.floor(Math.sqrt(a)) as int
			def upper = Math.ceil(Math.sqrt(b)) as int
			def result = upper - lower + 1
			
			if (!(lower * lower in a..b)) {
				result--
			}
			if (!(upper * upper in a..b)) {
				result--
			}
			
			println result
		}
	}
}