package com.github.fritaly.hackerrank.search

class SherlockAndArray {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfTests = reader.readLine() as int

		numberOfTests.times {
			def n = reader.readLine() as int
			def array = reader.readLine().split(' ').collect { it as int }.toArray()
			
			if (array.length == 1) {
				println 'YES'
				return
			}
			
			def total = array.sum()
			
			def leftSum = 0

			for (int i=1 ; (i < array.length - 1) && (leftSum < total / 2); i++) {
				leftSum += array[i-1]
				def rightSum = total - leftSum - array[i]
				
				if (leftSum == rightSum) {
					println 'YES'
					return
				}
			}
			
			println 'NO'
		}
	}
}