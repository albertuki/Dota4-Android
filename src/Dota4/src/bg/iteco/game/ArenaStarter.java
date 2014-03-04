package Dota4.src.bg.iteco.game;


public class ArenaStarter {
	private static ArenaStarter _instance;
	public Arena a;
	
	public static ArenaStarter Instance()
    {
      if (_instance == null)
      {
        _instance = new ArenaStarter();
      }
      return _instance;
    }

	public void newArenaStarter(Arena a){
		this.a = a;
	}

	public  void startGame(boolean isMagic){
				a.fight(isMagic);
	}
}
