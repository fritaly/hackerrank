package com.github.fritaly.hackerrank.warmup

class DiagonalDifference {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def size = Integer.parseInt(reader.readLine())

		def matrix = new int[size][size]

		for (int y = 0; y < size; y++) {
			def digits = reader.readLine().split(' ')

			for (int x = 0; x < size; x++) {
				matrix[y][x] = digits[x] as int
			}
		}

		int sum1 = 0, sum2 = 0

		for (int i = 0; i < size; i++) {
			sum1 += matrix[i][i]
			sum2 += matrix[i][size - i - 1]
		}

		println Math.abs(sum1 - sum2)
	}
}