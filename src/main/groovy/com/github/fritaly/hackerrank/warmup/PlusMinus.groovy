package com.github.fritaly.hackerrank.warmup

class PlusMinus {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def total = Integer.parseInt(reader.readLine())
		def array = reader.readLine().split(' ').collect { it as int }

		def negative = 0, positive = 0, zero = 0

		array.each {
			if (it < 0) {
				negative++
			} else if (it > 0) {
				positive++
			} else {
				zero++
			}
		}

		println String.format('%.3f', positive / total)
		println String.format('%.3f', negative / total)
		println String.format('%.3f', zero / total)
	}
}