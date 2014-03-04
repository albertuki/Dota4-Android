package Dota4.src.bg.iteco.model;

public class Hero {
	public String name;
	public int attribute;
	public int damage;
	public int health;
	public Magic magic;
	public boolean isCasted = false;
	
	
	Hero(String name){
		this.name = name;
	}
}
