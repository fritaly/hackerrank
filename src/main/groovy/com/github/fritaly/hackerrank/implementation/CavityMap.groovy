package com.github.fritaly.hackerrank.implementation

class CavityMap {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def n = reader.readLine() as int
		def grid = []

		n.times {
			def row = reader.readLine().toCharArray().collect { (it as String) as int }
			
			grid << row
		}
		
		if (n > 2) {
			println grid[0].join()
			
			for (y in 1..n-2) {
				print grid[y][0]
				
				for (x in 1..n-2) {
					def depth = grid[y][x]
					
					def cavity = (grid[y][x] > grid[y][x-1])
					cavity = cavity && (grid[y][x] > grid[y][x+1])
					cavity = cavity && (grid[y][x] > grid[y+1][x])
					cavity = cavity && (grid[y][x] > grid[y-1][x])
					
					print (cavity ? 'X' : grid[y][x])
				}
				
				print grid[y][n-1]
				println ""
			}
			
			println grid[n-1].join()
		} else {
			for (y in 0..n-1) {
				println grid[y].join()
			}
		}
	}
}