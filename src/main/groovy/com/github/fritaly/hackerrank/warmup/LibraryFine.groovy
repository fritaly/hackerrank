package com.github.fritaly.hackerrank.warmup

class LibraryFine {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def (actualDay, actualMonth, actualYear) = reader.readLine().split(' ').collect { it as int }
		def (expectedDay, expectedMonth, expectedYear) = reader.readLine().split(' ').collect { it as int }
		
		if (actualYear == expectedYear) {
			if (actualMonth == expectedMonth) {
				if (actualDay > expectedDay) {
					println 15 * (actualDay - expectedDay)
				} else {
					println 0
				}
			} else {
				if (actualMonth > expectedMonth) {
					println 500 * (actualMonth - expectedMonth)
				} else {
					println 0
				}
			}
		} else {
			if (actualYear > expectedYear) {
				println 10000
			} else {
				println 0
			}
		}
	}
}