package com.olympic.cis143.m04.student.homework.tacotruckmap;

import com.olympic.cis143.m04.student.homework.tacotruckmap.impl.OrdersMapImpl;

import java.util.List;

public class OrdersTest {

    public static void main(final String[] args) throws OrderDoesNotExistException {
        OrdersTest tests = new OrdersTest();
        tests.testGetListOfOrders();
        tests.testAddTaco();
        tests.testCloseOrder();
        tests.testHowManyOrders();
        tests.testExceptionsAreThrownForGetListOfOrders();
        tests.testExceptionsAreThrownForAddOrder();
        tests.testExceptionsAreThrownForCloseOrder();
    }

    public void testGetListOfOrders() throws OrderDoesNotExistException {
        Orders orders = new OrdersMapImpl();
        orders.createOrder("Order1");
        List<TacoImpl> tacos = orders.getListOfOrders("Order1");
        if (tacos == null) {
            throw new RuntimeException(":( testOne failed. You need to instanciate the arraylist when creating the tacos.");
        }
        if (tacos.size() > 0 ) {
            throw new RuntimeException(":( testOne failed. Your list of tacos should be empty");
        }
        System.out.println(">> testGetListOfOrders passed.!");
    };

    public void testAddTaco() throws OrderDoesNotExistException {
        Orders orders = new OrdersMapImpl();
        orders.createOrder("Order1");
        orders.addTacoToOrder("Order1", new TacoImpl(TacoImpl.Protien.BEAN, true));
        if(orders.getListOfOrders("Order1").size() != 1) {
            throw new RuntimeException(":( testAddTaco fail. You should have one order for order1");
        }
        System.out.println(">> testAddTaco passed.!");
    }

    public void testCloseOrder() throws OrderDoesNotExistException {
        Orders orders = new OrdersMapImpl();
        orders.createOrder("Order1");
        orders.addTacoToOrder("Order1", new TacoImpl(TacoImpl.Protien.BEAN, true));
        List tacos = orders.closeOrder("Order1");
        if (tacos.size() != 1) {
            throw new RuntimeException(":( testCloseOrder failed. You should have one taco in the list.");
        }
        if (orders.hasNext()) {
            throw new RuntimeException(":( testCloseOrder failed. You should have no orders left");
        }
        System.out.println(">> testCloseOrder passed.!");
    }

    public void testHowManyOrders() throws OrderDoesNotExistException {
        Orders orders = new OrdersMapImpl();
        orders.createOrder("Order1");
        if (orders.howManyOrders() != 1 ) {
            throw new RuntimeException(":( testHowManyOrders failed. You should have 1 order.");
        }
        orders.createOrder("Order2");
        if (orders.howManyOrders() != 2 ) {
            throw new RuntimeException(":( testHowManyOrders failed. You should have 2 order.");
        }
        orders.closeOrder("Order1");
        if (orders.howManyOrders() != 1 ) {
            throw new RuntimeException(":( testHowManyOrders failed. You should have 1 order.");
        }
        System.out.println(">> testHowManyOrders passed.!");
    }

    public void testExceptionsAreThrownForGetListOfOrders() {
        Orders orders = new OrdersMapImpl();
        try {
            orders.getListOfOrders("DoesNotExist");
            throw new RuntimeException(":( testExceptionsAreThrownForGetListOfOrders failed. Should throw an exception");
        } catch (OrderDoesNotExistException e) {
            System.out.println(">> testExceptionsAreThrownForGetListOfOrders getListOfOrders passed  ");
        }
    }

    public void testExceptionsAreThrownForAddOrder() {
        Orders orders = new OrdersMapImpl();
        try {
            orders.addTacoToOrder("DoesNotExist", new TacoImpl(TacoImpl.Protien.BEAN, true));
            throw new RuntimeException(":( testExceptionsAreThrownForAddOrder failed. Should throw an exception");
        } catch (OrderDoesNotExistException e) {
            System.out.println(">> testExceptionsAreThrownForAddOrder getListOfOrders passed  ");
        }
    }

    public void testExceptionsAreThrownForCloseOrder() {
        Orders orders = new OrdersMapImpl();
        try {
            orders.closeOrder("DoesNotExist");
            throw new RuntimeException(":( testExceptionsAreThrownForCloseOrder failed. Should throw an exception");
        } catch (OrderDoesNotExistException e) {
            System.out.println(">> testExceptionsAreThrownForCloseOrder getListOfOrders passed  ");
        }
    }
}
