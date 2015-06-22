package com.github.fritaly.hackerrank.implementation

def reader = new BufferedReader(new InputStreamReader(System.in))
def (n, t) = reader.readLine().split(' ').collect { it as int }
def widths = reader.readLine().split(' ').collect { it as int }.toList()

t.times {
	def (i, j) = reader.readLine().split(' ').collect { it as int }
	def sublist = widths.subList(i, j + 1)
	def min = sublist.min()
	
	println min
}