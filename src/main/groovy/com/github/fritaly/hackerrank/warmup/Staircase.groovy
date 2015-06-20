package com.github.fritaly.hackerrank.warmup

class Staircase {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def height = Integer.parseInt(reader.readLine())

		for (int n=1; n <= height; n++) {
			println " " * (height - n) + "#" * n
		}
	}
}