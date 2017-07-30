package com.tank.designMode.chp1;

import java.util.Vector;

/**
 * @author duanzhiwei
 *顾客
 */
public class Customer {
	private String name;
	private Vector<Rental> rentals = new Vector<>();
	
	public Customer(String name){
		this.name = name;
	}
	
	public void addRental(Rental arg){
		rentals.addElement(arg);
	}
	
	public String getName(){
		return this.name;
	}
}
