package com.github.fritaly.hackerrank.search

def reader = new BufferedReader(new InputStreamReader(System.in))
def n = reader.readLine() as int
def list1 = reader.readLine().split(' ') as List
def m = reader.readLine() as int
def list2 = reader.readLine().split(' ') as List

def frequencies1 = list1.groupBy { it }.collectEntries { k, v -> [(k): v.size()] }
def frequencies2 = list2.groupBy { it }.collectEntries { k, v -> [(k): v.size()] }

def result = []

frequencies2.each { value, frequency2 ->
	def frequency1 = frequencies1[value] ?: 0

	if (frequency2 - frequency1 > 0) {
		result << value
	}	
}

result.sort()

println result.join(' ')