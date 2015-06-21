package com.github.fritaly.hackerrank.codegolf

def reader = new BufferedReader(new InputStreamReader(System.in))
def numberOfTests = reader.readLine() as int

def factorial(int n) {
	(n <= 1) ? 1 : n * factorial(n - 1)
}

numberOfTests.times {
	def x = reader.readLine() as double
	double sin = 0, cos = 0
	def a = x, b = 1, c = 1, d = 0, e = 1
	
	5.times {
		sin += e * a / factorial(c)
		cos += e * b / factorial(d)
		
		a *= x*x
		b *= x*x
		c += 2
		d += 2
		e *= -1
	}
	
	printf "%.3f\n", sin
	printf "%.3f\n", cos
}