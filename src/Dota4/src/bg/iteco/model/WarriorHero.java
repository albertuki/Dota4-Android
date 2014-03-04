package Dota4.src.bg.iteco.model;


public class WarriorHero extends Hero {
	
	public WarriorHero(String name) {
		super(name);
		this.health = 100;
		this.attribute = Constant.WARRIOR_TYPE;
		this.damage = 10;
		this.magic = new SkipMoveMagic();
	}

}
