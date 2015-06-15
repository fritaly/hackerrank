package com.github.fritaly.hackerrank

class UtopianTree {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfTests = reader.readLine() as int

		numberOfTests.times {
			def cycles = reader.readLine() as int

			def height = 1
			
			for(int i = 1; i <= cycles ; i++) {
				if (i % 2 == 1) {
					height = height << 1
				} else {
					height++
				}
			}
			
			println height
		}
	}
}