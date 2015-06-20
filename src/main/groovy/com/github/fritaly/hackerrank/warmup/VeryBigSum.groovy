package com.github.fritaly.hackerrank.warmup

class VeryBigSum {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def n = reader.readLine() as int
		
		println reader.readLine().split(' ').collect { it as long }.sum()
	}
}