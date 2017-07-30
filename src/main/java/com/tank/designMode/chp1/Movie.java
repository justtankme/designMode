package com.tank.designMode.chp1;

/**
 * @author duanzhiwei
 *影片
 */
public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String title;
	private int priceCode;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPriceCode() {
		return priceCode;
	}
	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}
	
	public Movie(){
		
	}
	public Movie(String title, int priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}
}
