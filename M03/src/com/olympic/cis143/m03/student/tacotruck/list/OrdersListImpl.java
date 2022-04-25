package com.olympic.cis143.m03.student.tacotruck.list;

import java.util.ArrayList;
import java.util.List;

import com.olympic.cis143.m03.student.tacotruck.Orders;
import com.olympic.cis143.m03.student.tacotruck.TacoImpl;

public class OrdersListImpl implements Orders {

	List <TacoImpl> tacoList = new ArrayList<>();
	
	@Override
	public void addOrder(TacoImpl tacoOrder) {
		this.tacoList.add(tacoOrder);
	}

	@Override
	public boolean hasNext() {
		return !this.tacoList.isEmpty();
	}

	@Override
	public TacoImpl closeNextOrder() {
		return this.tacoList.remove(0);
	}

	@Override
	public int howManyOrders() {
		return this.tacoList.size();
	}

}
