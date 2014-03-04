package com.example.dota4_android;

import Dota4.src.bg.iteco.model.Hero;
import Dota4.src.bg.iteco.model.MageHero;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	String h;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView tv = (TextView)findViewById(R.id.textView1);
		Button mage = (Button)findViewById(R.id.button1);
		Button warrior = (Button)findViewById(R.id.button2);
		Button hunter = (Button)findViewById(R.id.button3);
		
		tv.setText("Изберете първия герой.");
		
		mage.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				h = "mage";
				secondPick();
			}
		});
		
		warrior.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				h = "warrior";
				secondPick();
			}
		});
		
		hunter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				h = "hunter";
				secondPick();
			}
		});
		
	}

	void secondPick(){
		Intent i = new Intent(this, SecondPick.class);
		i.putExtra("hero", h);	
		startActivity(i);
	}
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
