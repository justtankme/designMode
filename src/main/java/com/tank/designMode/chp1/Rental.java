package com.tank.designMode.chp1;

/**
 * @author duanzhiwei
 *租赁
 */
public class Rental {
	private Movie movie;
	private int dausRented;
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public int getDausRented() {
		return dausRented;
	}
	public void setDausRented(int dausRented) {
		this.dausRented = dausRented;
	}
	public Rental(Movie movie, int dausRented) {
		super();
		this.movie = movie;
		this.dausRented = dausRented;
	}
	
	
}
