package com.github.fritaly.hackerrank

class SherlockAndAnagrams {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfTests = reader.readLine() as int

		numberOfTests.times {
			def string = reader.readLine()
			
			Map<String, Set<String>> substrings = [:]
			
			for(int i=0; i < string.length(); i++) {
				for(int j=i+1; j <= string.length(); j++) {
					// Normalize the string to detect anagrams
					def s = string.substring(i, j).toCharArray().toList().sort().join()
					
					if (!substrings[s]) {
						substrings[s] = new TreeSet()
					}
					
					substrings[s] << "${i+1}:${j}"
				}
			}
			
			def factorial = { n -> (n <= 1) ? BigInteger.ONE : n * call(n - 1) }
			
			def combinations = { n, k ->
				def result = BigInteger.ONE
				
				for (int i=0; i < k; i++) {
					result *= (n - i)
				}
				
				result
			}
			
			def result = 0
			
			substrings.each { s, indices ->
				int n = indices.size()
				
				if (n > 1) {
					int k = 2
					
					result += combinations(n, k) / factorial(k)
				}
			}
			
			println result
		}
	}
}