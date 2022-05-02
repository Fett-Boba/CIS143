package com.olympic.cis143.m04.student.homework.tacotruckmap;

import java.util.List;

public interface Orders {
    /**
     * Creates an order based on the order ID. Note that you will need to create an empty array list to put in the map.
     *
     * @param orderid The Id of the order.
     */
    void createOrder(String orderid);

    /**
     * Adds an taco to the orders
     *
     * @param orderid The order id
     * @param taco - The taco to add.
     */
    void addTacoToOrder(String orderid, TacoImpl taco) throws OrderDoesNotExistException;

    /**
     * True if more tacos remain, else false.
     * @return
     */
    boolean hasNext();

    /**
     * Note that this method will remove the order baseed on the orderid and return it.
     *
     * Once returned it should be permenantly removed.
     *
     * Outcome
     * ========
     * It will remove and return the list of Tacos.
     *
     * @param orderid  for the list of tacos.
     * @return The taco.
     */
    List<TacoImpl> closeOrder(String orderid) throws OrderDoesNotExistException;

    /**
     * How many order remain in the tacoQueue
     *
     * @return How many orders are in the queue
     */
    int howManyOrders();

    /**
     * Fetches the list of tacos associated with an order, however, it does not remove them.
     *
     * @param orderid The orderid to get.
     * @return The list of tacos.
     */
    List<TacoImpl> getListOfOrders(String orderid) throws OrderDoesNotExistException;
}
