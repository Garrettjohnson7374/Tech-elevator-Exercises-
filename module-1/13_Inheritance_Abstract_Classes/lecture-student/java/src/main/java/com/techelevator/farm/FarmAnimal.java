package com.techelevator.farm;

import java.math.BigDecimal;

public  abstract class FarmAnimal implements Singable{
	private final String name;

	public FarmAnimal(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public abstract String makeSound();

	public String getArticle() {
		return "a";
	}



}