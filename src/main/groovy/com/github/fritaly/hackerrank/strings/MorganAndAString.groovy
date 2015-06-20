package com.github.fritaly.hackerrank.strings

class MorganAndAString {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfTests = reader.readLine() as int
		
		numberOfTests.times {
			def a = reader.readLine()
			def b = reader.readLine()
			
			int i = 0, j = 0
			
			def result = new StringBuilder(a.length() + b.length())
			
			while ((i < a.length()) && (j < b.length())) {
				def c1 = a.charAt(i)
				def c2 = b.charAt(j)
				
				if (c1 < c2) {
					result << c1
					i++
				} else if (c2 > c1) {
					result << c2
					j++
				} else {
					// The 2 characters are equal, compare the next characters in A and B
					def comparison = a.substring(i) <=> b.substring(j)
					
					if (comparison < 0) {
						result << c1
						i++
					} else if (comparison > 0) {
						result << c2
						j++
					} else {
						result << c2
						j++
					}
				}
			}
			
			if (i < a.length()) {
				result << a.substring(i)
			} else if (j < b.length()) {
				result << b.substring(j)
			}
			
			println result
		}
	}
}