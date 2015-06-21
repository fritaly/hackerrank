package com.github.fritaly.hackerrank.greedy

def reader = new BufferedReader(new InputStreamReader(System.in))
def (n, k) = reader.readLine().split(' ').collect { it as int }
def prices = reader.readLine().split(' ').collect { it as int }.toList()
def remainder = k

def solution = []

prices.sort()

while (prices && (prices[0] < remainder)) {
	def price = prices.remove(0)
	remainder -= price
	solution << price
}

println solution.size()