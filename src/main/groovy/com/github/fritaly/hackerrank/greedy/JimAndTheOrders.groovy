package com.github.fritaly.hackerrank.greedy

def class Order implements Comparable<Order> {
	int number, time, duration
	
	int getDeliveryTime() {
		time + duration
	}
	
	@Override
	public int compareTo(Order other) {
		return this.deliveryTime - other.deliveryTime;
	}
}

def reader = new BufferedReader(new InputStreamReader(System.in))
def numberOfOrders = reader.readLine() as int
List<Order> orders = []

for (n in 1..numberOfOrders) {
	def data = reader.readLine().split(' ').collect { it as int }
	def order = new Order(number: n, duration: data[1], time: data[0])
	
	orders << order
}

orders.sort()

println orders.collect { it.number }.join(' ')
