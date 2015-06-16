package com.github.fritaly.hackerrank

class Pangrams {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def string = reader.readLine()
		def characters = string.toLowerCase().toCharArray().toList().unique().sort().join()
		def pangram = characters.contains('abcdefghijklmnopqrstuvwxyz')
		
		println pangram ? 'pangram' : 'not pangram'
	}
}