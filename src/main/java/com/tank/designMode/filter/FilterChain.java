package com.tank.designMode.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	private List<MyFilter> myFilters = new ArrayList<MyFilter>();
	private Target target;

	public void addMyFilter(MyFilter MyFilter) {
		myFilters.add(MyFilter);
	}

	public void execute(String request) {
		for (MyFilter MyFilter : myFilters) {
			MyFilter.execute(request);
		}
		target.execute(request);
	}

	public void setTarget(Target target) {
		this.target = target;
	}
}
