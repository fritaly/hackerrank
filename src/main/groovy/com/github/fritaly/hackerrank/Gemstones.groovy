package com.github.fritaly.hackerrank

class Gemstones {

	static void main(args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		def numberOfRocks = reader.readLine() as int
		List<String> compositions = []
		
		numberOfRocks.times {
			compositions << reader.readLine()
		}
		
		def elements = compositions.join().toCharArray().toList().unique().sort()
		
		println elements.findAll { element -> compositions.every { it.contains(element as String) }}.size()
	}
}