package Dota4.src.bg.iteco.model;


public class MageHero extends Hero{
	
	public MageHero(String name){
		super(name);
		this.health = 100;
		this.attribute = Constant.MAGE_TYPE;
		this.damage = 23;
		this.magic = new DamageMagic();
	}
}
