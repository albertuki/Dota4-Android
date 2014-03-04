package com.example.dota4_android;

import Dota4.src.bg.iteco.game.ArenaStarter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends Activity {
	 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game);
		
		
		
		Button fight = (Button)findViewById(R.id.button1);
		Button magic = (Button)findViewById(R.id.button2);
	    final TextView turn = (TextView)findViewById(R.id.textView1);
		final TextView health1 = (TextView)findViewById(R.id.textView2);
		final TextView health2 = (TextView)findViewById(R.id.textView3);
		
		fight.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(ArenaStarter.Instance().a.isPlayer1Turn){
					turn.setText("Player1 Turn");
				}else{
					turn.setText("Player2 Turn");
				}
				health1.setText("Player1 Health: " + new Integer(ArenaStarter.Instance().a.player1.health).toString());
				health2.setText("Player2 Health: " + new Integer(ArenaStarter.Instance().a.player2.health).toString());
				
				fight(1);
				isWinner();
			}
		});
		
		magic.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(ArenaStarter.Instance().a.isPlayer1Turn){
					turn.setText("Player1 Turn");
				}else{
					turn.setText("Player2 Turn");
				}
				health1.setText(ArenaStarter.Instance().a.player1.health);
				health2.setText(ArenaStarter.Instance().a.player2.health);
				
				fight(2);
				isWinner();
			}
		});
		
	}
	
	void fight(int i){
		switch(i){
			case 1: ArenaStarter.Instance().startGame(false); break;
			case 2: ArenaStarter.Instance().startGame(true); break;
		}
		
	}
	
	public void isWinner(){
		if(ArenaStarter.Instance().a.player1.health <= 0){
			Toast msg = Toast.makeText(this, "Player 2 is a winner!", Toast.LENGTH_LONG);
			msg.show();
			Intent i = new Intent(this, MainActivity.class);
			i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(i);
		}
		
		if(ArenaStarter.Instance().a.player2.health <= 0){
		//	PrintString.print(player1.name + " is a winner.");
			Toast msg = Toast.makeText(this, "Player 1 is a winner!", Toast.LENGTH_LONG);
			msg.show();

			Intent i = new Intent(this, MainActivity.class);
			i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(i);
		}
	}
	
}
