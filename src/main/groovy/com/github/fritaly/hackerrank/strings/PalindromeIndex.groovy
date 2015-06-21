package com.github.fritaly.hackerrank.strings

def reader = new BufferedReader(new InputStreamReader(System.in))
def numberOfTests = reader.readLine() as int

def palindrome(string) {
	string == new StringBuilder(string).reverse().toString()
}

numberOfTests.times {
	def string = reader.readLine()
	
	for (int i=0 ; i < string.length() / 2 ; i++) {
		if (string[i] != string[string.length() - 1 - i]) {
			if (palindrome(string.substring(0, i) + string.substring(i + 1))) {
				println i
			} else {
				println string.length() - 1 - i
			}
			
			return
		}
	}
	
	println '-1'
}
