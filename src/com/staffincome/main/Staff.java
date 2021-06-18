package com.staffincome.main;

public class Staff {

	private String name;
	private String id;
	private Income income;

	public Staff(String name, String id, Income income) {
		super();
		this.name = name;
		this.id = id;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	double calculateNetIncome() {
		return income.getAmount() - income.getTotalTax();

	}
}
