package com.olympic.cis143.m04.student.tacotruck.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.olympic.cis143.m04.student.tacotruck.Orders;
import com.olympic.cis143.m04.student.tacotruck.TacoImpl;

public class OrdersSetImpl  implements Orders {

	private Set<TacoImpl> orderSet = new HashSet<>();
	
	@Override
    public void addOrder(TacoImpl tacoOrder) {
		orderSet.add(tacoOrder);
    }

    @Override
    public boolean hasNext() {
    	return !orderSet.isEmpty(); 
    }

    @Override
    public TacoImpl closeNextOrder() {

    	// Copy hashset to array list (hashsets have no guaranteed order)
    	List <TacoImpl> al = new ArrayList<>(orderSet);
    	
    	// Remove first taco from arraylist, and also from hashset
    	TacoImpl removedTaco = (TacoImpl) al.get(0);
    	orderSet.remove(removedTaco);
    	
    	return removedTaco;
    }

    @Override
    public int howManyOrders() {
    	return orderSet.size();
    }

}
