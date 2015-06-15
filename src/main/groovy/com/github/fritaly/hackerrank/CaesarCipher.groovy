package com.github.fritaly.hackerrank

class CaesarCipher {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def length = reader.readLine() as int
		def string = reader.readLine()
		def k = ((reader.readLine() as int) % 26)
		
		def lower = 'abcdefghijklmnopqrstuvwxyz'
		def upper = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
		
		def lowerCiphered = lower.substring(k, 26) + lower.substring(0, k)
		def upperCiphered = upper.substring(k, 26) + upper.substring(0, k)
		
		def chars = string.toCharArray().collect {
			if (lower.contains(it as String)) {
				return lowerCiphered.charAt(lower.indexOf(it as String))
			} else if (upper.contains(it as String)) {
				return upperCiphered.charAt(upper.indexOf(it as String))
			}
			
			it
		}
		
		println chars.join()
	}
}