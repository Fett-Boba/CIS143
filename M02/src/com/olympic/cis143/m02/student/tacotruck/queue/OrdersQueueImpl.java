package com.olympic.cis143.m02.student.tacotruck.queue;

import com.olympic.cis143.m02.student.tacotruck.TacoImpl;

import java.util.ArrayDeque;
import java.util.Deque;

public class OrdersQueueImpl {

	private Deque<TacoImpl> tacoQueue = new ArrayDeque<>();
    
	// Add an order to the queue
    public void addOrder(TacoImpl tacoOrder) {
    	tacoQueue.add(tacoOrder);							
    }
    
    // Check if queue is empty. True if more tacos remain, else false.
    public boolean hasNext() {
    	return tacoQueue.isEmpty() ? false : true;
    }
    
    // First order completed, remove it from the queue and return it
    public TacoImpl closeNextOrder() {
        return tacoQueue.removeFirst();						
    }
    
    // Return number of orders on the queue
    public int howManyOrders() {
        return tacoQueue.size();							
    }
}
