package com.olympic.cis143.m02.student.tacotruck.queue;

import com.olympic.cis143.m02.student.tacotruck.TacoImpl;

public interface Orders {

	// Add an order to the queue
	void addOrder(TacoImpl tacoOrder);

	// Check if queue is empty. True if more tacos remain, else false.
	boolean hasNext();

	// First order completed, remove it from the queue and return it
	TacoImpl closeNextOrder();

	// Return number of orders on the queue
	int howManyOrders();

}