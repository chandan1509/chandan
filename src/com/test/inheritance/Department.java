package com.test.inheritance;

public class Department {

	int budget = 500;
	private String minbudget, maxbudget;

	public String getMinbudget() {
		return minbudget;
	}

	public void setMinbudget(String minbudget) {
		this.minbudget = minbudget;
	}

	public String getMaxbudget() {
		return maxbudget;
	}

	public void setMaxbudget(String maxbudget) {
		this.maxbudget = maxbudget;
	}
}
