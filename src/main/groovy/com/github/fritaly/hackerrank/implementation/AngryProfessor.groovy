package com.github.fritaly.hackerrank.implementation

class AngryProfessor {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfTests = reader.readLine() as int

		numberOfTests.times {
			def (n, k) = reader.readLine().split(' ').collect { it as int }
			def arrivalTimes = reader.readLine().split(' ').collect { it as int }
			def present = arrivalTimes.findAll { it <= 0 }.size()
			
			println ((present < k) ? 'YES' : 'NO')
		}
	}
}