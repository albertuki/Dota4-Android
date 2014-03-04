package Dota4.src.bg.iteco.game;

import android.widget.Toast;
import Dota4.src.bg.iteco.model.Hero;
import Dota4.src.bg.iteco.model.MageHero;
import Dota4.src.bg.iteco.model.WarriorHero;

public class Arena {
	public Hero player1, player2;
	public boolean isPlayer1Turn = true;
	
	public Arena(Hero player1, Hero player2){

		this.player1 = player1;
		this.player2 = player2;
	}
	
	public boolean isWinner(){
		if(player1.health <= 0){
			//PrintString.print(player2.name + " is a winner.");
			return false;
		}
		
		if(player2.health <= 0){
		//	PrintString.print(player1.name + " is a winner.");
			return false;
		}
		
		return true;
	}
	
	public void fight(boolean isMagic){
		if (isPlayer1Turn){
			if (isMagic == false){
				player2.health -= player1.damage;
				this.isPlayer1Turn = false;
			}else{ 
				if (!player1.isCasted){
					player1.isCasted=true;
					player1.magic.cast();
					this.isPlayer1Turn = false;
				}else{
					player2.health -= player1.damage;
					this.isPlayer1Turn = false;
				}
			}
		}else{
			if (isMagic == false){
				player1.health -= player2.damage;
				this.isPlayer1Turn = true;
			}else{
				if (!player2.isCasted){
					player2.isCasted=true;
					player2.magic.cast();
					this.isPlayer1Turn = false;
				}else{
					player1.health -= player2.damage;
					this.isPlayer1Turn = false;
				}
			}
		}
		
	}

}
