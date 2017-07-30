package com.tank.designMode.filter;

public class FilterManager {
	FilterChain filterChain;

	public FilterManager(Target target) {
		filterChain = new FilterChain();
		filterChain.setTarget(target);
	}

	public void setFilter(MyFilter filter) {
		filterChain.addMyFilter(filter);
	}

	public void filterRequest(String request) {
		filterChain.execute(request);
	}
}
