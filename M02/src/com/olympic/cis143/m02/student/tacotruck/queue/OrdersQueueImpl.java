package com.olympic.cis143.m02.student.tacotruck.queue;

import com.olympic.cis143.m02.student.tacotruck.TacoImpl;

import java.util.ArrayDeque;
import java.util.Deque;

public class OrdersQueueImpl {

	private Deque<TacoImpl> tacoQueue = new ArrayDeque<>();
    
    public void addOrder(TacoImpl tacoOrder) {
    	tacoQueue.add(tacoOrder);							
    }
    
    public boolean hasNext() {
    	return tacoQueue.isEmpty() ? false : true;
    }
    
    public TacoImpl closeNextOrder() {
        return tacoQueue.removeFirst();						
    }
    
    public int howManyOrders() {
        return tacoQueue.size();							
    }
}
