package com.github.fritaly.hackerrank.warmup

def reader = new BufferedReader(new InputStreamReader(System.in))
def n = reader.readLine() as BigInteger

def factorial(x) { 
	(x <= 1) ? 1 : x * factorial(x - 1) 
}

println factorial(n)