package com.olympic.cis143.m03.student.tacotruck;

public interface Orders {
    /**
     *
     * @param tacoOrder
     */
    void addOrder(TacoImpl tacoOrder);

    /**
     * True if more tacos remain, else false.
     * @return
     */
    boolean hasNext();

    /**
     * Note that this method will remove the first (in terms of FIFO)taco from the tacoQueue and return it.
     *
     * Once returned it should be permenantly removed.
     *
     * Outcome
     * ========
     * It will remove and return the FIFO record. This is tested in the test file.
     *
     * @return The taco.
     */
    TacoImpl closeNextOrder();

    /**
     * How many order remain in the tacoQueue
     *
     * @return How many orders are in the queue
     */
    int howManyOrders();
}
