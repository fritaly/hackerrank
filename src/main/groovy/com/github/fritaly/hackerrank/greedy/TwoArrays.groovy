package com.github.fritaly.hackerrank.greedy

def reader = new BufferedReader(new InputStreamReader(System.in))
def numberOfTests = reader.readLine() as int

numberOfTests.times {
	def (n, k) = reader.readLine().split(' ').collect { it as int }
	def a = reader.readLine().split(' ').collect { it as int }
	def b = reader.readLine().split(' ').collect { it as int }
	
	a.sort()
	b.sort { x, y -> -1 * x.compareTo(y) }
	
	for (int i=0 ; i < a.size() ; i++) {
		if (a[i] + b[i] < k) {
			println 'NO'
			return
		}
	}
	
	println 'YES'
}