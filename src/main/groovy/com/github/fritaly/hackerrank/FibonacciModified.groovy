package com.github.fritaly.hackerrank

class FibonacciModified {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def (a, b, n) = reader.readLine().split(' ').collect { it as BigInteger }
		BigInteger c = 0
		
		if (n == 0) {
			println a
		} else if (n == 1) {
			println b 
		} else {
			(n - 2).times {
				c = a + (b * b)
				a = b
				b = c
			}
			
			println c
		}
	}
}