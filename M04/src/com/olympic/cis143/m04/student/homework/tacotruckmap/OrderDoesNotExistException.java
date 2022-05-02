package com.olympic.cis143.m04.student.homework.tacotruckmap;

public class OrderDoesNotExistException extends Exception {

    /**
     * Const.
     * @param orderid The order id that does not exist.
     */
    public OrderDoesNotExistException(String orderid) {
        super("Order Does Not Exist for Order id: " +  orderid);
    }
}
