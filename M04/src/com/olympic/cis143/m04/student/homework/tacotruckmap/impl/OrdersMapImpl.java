package com.olympic.cis143.m04.student.homework.tacotruckmap.impl;

import com.olympic.cis143.m04.student.homework.tacotruckmap.OrderDoesNotExistException;
import com.olympic.cis143.m04.student.homework.tacotruckmap.Orders;
import com.olympic.cis143.m04.student.homework.tacotruckmap.TacoImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrdersMapImpl implements Orders {

	List<TacoImpl> tacoList = new ArrayList<TacoImpl>();  
	Map<String, List<TacoImpl>> orderMap = new HashMap<>();
	
    @Override
    public void createOrder(final String orderid) {
    	orderMap.put(orderid, tacoList);
    }

    @Override
    public void addTacoToOrder(final String orderid, final TacoImpl taco) throws OrderDoesNotExistException {
    	doesOrderExist(orderid);
    	tacoList.add(taco);
    	orderMap.put(orderid, tacoList);
    }

    @Override
    public boolean hasNext() {
    	return !this.orderMap.isEmpty();
    }

    @Override
    public List<TacoImpl> closeOrder(final String orderid) throws OrderDoesNotExistException {
    	doesOrderExist(orderid);
    	return orderMap.remove(orderid);
    }

    @Override
    public int howManyOrders() {
        return orderMap.size();
    }

    @Override
    public List<TacoImpl> getListOfOrders(final String orderid) throws OrderDoesNotExistException {
    	doesOrderExist(orderid);
    	return orderMap.get(orderid);
    }
    
    private void doesOrderExist(final String orderid) throws OrderDoesNotExistException {
    	if (!orderMap.containsKey(orderid)) {
    		throw new OrderDoesNotExistException(orderid);
    	}
    }
    
    
}
