package com.github.fritaly.hackerrank

class MinMax {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def n = reader.readLine() as int
		def k = reader.readLine() as int

		def values = []

		n.times {
			values << (reader.readLine() as int)
		}

		values.sort()

		def solution = Integer.MAX_VALUE

		for(int i=0; i < n-k+1; i++) {
			def min = values[i]
			def max = values[i+k-1]
			def unfairness = max - min

			solution = Math.min(solution, unfairness)
		}

		println solution
	}
}