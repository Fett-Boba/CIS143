package com.olympic.cis143.m03.student.tacotruck.queue;

import com.olympic.cis143.m03.student.tacotruck.Orders;
import com.olympic.cis143.m03.student.tacotruck.TacoImpl;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Reference the following when working on the queue implementation:
 * https://www.baeldung.com/java-array-deque#2-arraydeque-as-a-queue
 *
 * Note that the orders are a queue, so its FIFO approach.
 */
public class OrdersQueueImpl implements Orders {

    /**
     * This is the queue that will hold and manage the TacoImpl
     */
    private Deque<TacoImpl> tacoQueue = new ArrayDeque<>();

    @Override
    public void addOrder(TacoImpl tacoOrder) {
        this.tacoQueue.offer(tacoOrder);
    }

    @Override
    public boolean hasNext() {
        return !this.tacoQueue.isEmpty();
    }

    @Override
    public TacoImpl closeNextOrder() {
        return  this.tacoQueue.poll();
    }

    @Override
    public int howManyOrders() {
        return this.tacoQueue.size();
    }
}
