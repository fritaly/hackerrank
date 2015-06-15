package com.github.fritaly.hackerrank

class TimeConversion {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def input = reader.readLine()
		def afternoon = input.endsWith('PM')
		def array = input.substring(0, 8).split(':').collect { it as int }
		
		if (afternoon && (array[0] != 12)) {
			array[0] += 12  
		} else if (!afternoon && (array[0] == 12)) {
			array[0] -= 12
		}
		
		println String.format("%02d:%02d:%02d", array[0], array[1], array[2])
	}
}