package Dota4.src.bg.iteco.model;

public class HealthMagic extends Magic {
	@Override
	public void cast() {
		super.cast();
		System.out.print("heal");
	}
}
