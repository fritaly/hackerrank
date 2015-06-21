package com.github.fritaly.hackerrank.codegolf

(1..100).each { n ->
	def a = (n % 3 == 0)
	def b = (n % 5 == 0)
	
	println ((a && b) ? 'FizzBuzz' : a ? 'Fizz' : b ? 'Buzz' : n)
}