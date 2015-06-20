package com.github.fritaly.hackerrank.implementation

class CutTheSticks {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfSticks = reader.readLine() as int
		def sticks = reader.readLine().split(' ').collect { it as int }
		
		while (sticks) {
			def minLength = sticks.min()
			
			int count = 0
			
			sticks = sticks.findAll { 
				def value = it - minLength
			
				if (value >= 0) {
					count++
				}
				
				value
			}
			
			println count
		}
	}
}