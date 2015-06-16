package com.github.fritaly.hackerrank

class ValidPanFormat {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfTests = reader.readLine() as int
		
		numberOfTests.times {
			def text = reader.readLine()

			println text.matches('[A-Z]{5}[0-9]{4}[A-Z]') ? 'YES' : 'NO'			
		}
	}
}