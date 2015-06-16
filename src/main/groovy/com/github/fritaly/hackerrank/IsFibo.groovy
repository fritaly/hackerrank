package com.github.fritaly.hackerrank

class IsFibo {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfTests = reader.readLine() as int

		numberOfTests.times {
			def n = reader.readLine() as long
			
			long a = 0, b = 1
			
			while (true) {
				long c = a + b
				
				if (c == n) {
					println 'IsFibo'
					break
				} else if (c > n) {
					println 'IsNotFibo'
					break
				}
				
				a = b
				b = c
			}
		}
	}
}