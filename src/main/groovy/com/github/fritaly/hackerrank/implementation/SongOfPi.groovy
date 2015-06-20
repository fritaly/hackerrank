package com.github.fritaly.hackerrank.implementation

class SongOfPi {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfTests = reader.readLine() as int
		def pi = '314159265358979323846'
		
		numberOfTests.times {
			def words = reader.readLine().split(' ')
			def value = words.collect { it.length() as String }.join()
			
			if (pi.startsWith(value) || value.startsWith(pi)) {
				println "It's a pi song."
			} else {
				println "It's not a pi song."
			}
		}
	}
}