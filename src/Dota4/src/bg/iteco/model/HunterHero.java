package Dota4.src.bg.iteco.model;

public class HunterHero extends Hero {

	public HunterHero(String name) {
		super(name);
		this.health = 150;
		this.attribute = Constant.MAGE_TYPE;
		this.damage = 17;
		this.magic = new HealthMagic();
	}

}
