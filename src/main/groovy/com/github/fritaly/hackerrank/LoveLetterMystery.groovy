package com.github.fritaly.hackerrank

class LoveLetterMystery {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfTests = reader.readLine() as int

		def letters = 'abcdefghijklmnopqrstuvwxyz'

		numberOfTests.times {
			def count = 0
			def array = reader.readLine().toCharArray()

			for(int i = 0; i < array.length / 2; i++) {
				def a = array[i]
				def b = array[array.length - 1 - i]
				
				if (a != b) {
					count += Math.abs(letters.indexOf(b as String) - letters.indexOf(a as String))
				}
			}

			println count
		}
	}
}