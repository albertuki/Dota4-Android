package com.example.dota4_android;

import Dota4.src.bg.iteco.game.Arena;
import Dota4.src.bg.iteco.game.ArenaStarter;
import Dota4.src.bg.iteco.model.Hero;
import Dota4.src.bg.iteco.model.HunterHero;
import Dota4.src.bg.iteco.model.MageHero;
import Dota4.src.bg.iteco.model.WarriorHero;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondPick extends Activity {
	
	Hero hero1;
	Hero hero2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView tv = (TextView)findViewById(R.id.textView1);
		Button mage = (Button)findViewById(R.id.button1);
		Button warrior = (Button)findViewById(R.id.button2);
		Button hunter = (Button)findViewById(R.id.button3);
		
		String value = getIntent().getExtras().getString("hero");
		if (value.equals("mage")) {
			hero1 = new MageHero("Gosho");
		}
		else if(value.equals("warrior")) {
			hero1 = new WarriorHero("Gosho");
		}
		else if(value.equals("hunter")) {
			hero1 = new HunterHero("Gosho");
		}
		
		tv.setText("Изберете втория герой.");
		mage.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				hero2 = new MageHero("Pesho");
				game();
								
			}
		});
		
		warrior.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				hero2 = new WarriorHero("Pesho");
				game();
								
			}
		});
		
		hunter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				hero2 = new HunterHero("Pesho");
				game();
								
			}
			
		});
	}
	
	void game(){
		ArenaStarter.Instance().newArenaStarter(new Arena(hero1, hero2));
		Intent i = new Intent(this, Game.class);	
		startActivity(i);
	}
}
