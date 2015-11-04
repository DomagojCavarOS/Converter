package com.example.converter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	int id=0;
	TextView masa1;
	TextView podaci1;
	TextView duljina1;
	TextView temp1;
	ImageView gumb;
	ImageView temp;
	ImageView podaci;
	ImageView duljina;
	ImageView tezina;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		masa1=(TextView) findViewById(R.id.textView2);
		podaci1=(TextView) findViewById(R.id.textView3);
		duljina1=(TextView) findViewById(R.id.textView4);
		temp1=(TextView) findViewById(R.id.textView1);
		

		final MediaPlayer mp = MediaPlayer.create(this, R.raw.mjuz);
		
		 

		
		
		 gumb =  (ImageView) findViewById(R.id.imageView1);
		 temp =  (ImageView) findViewById(R.id.imageView2);
	     podaci =  (ImageView) findViewById(R.id.imageView3);
	     duljina =  (ImageView) findViewById(R.id.imageView4);
	     tezina =  (ImageView) findViewById(R.id.imageView5);
		
		 temp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 //TODO Auto-generated method stub
				mp.start();
				gumb.setImageResource(R.drawable.gumbcrveno);
				temp1.setText(Html.fromHtml(getString(R.string.tempstring)));
				podaci1.setText(getString(R.string.reset));
				masa1.setText(getString(R.string.reset));
				duljina1.setText(getString(R.string.reset));
				id=1;
			
			}		
		});
		 
		 podaci.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 //TODO Auto-generated method stub
					mp.start();
					gumb.setImageResource(R.drawable.gumbzuto);
					podaci1.setText(Html.fromHtml(getString(R.string.podacistring)));
					temp1.setText(getString(R.string.reset));
					masa1.setText(getString(R.string.reset));
					duljina1.setText(getString(R.string.reset));
			
					id=2;
				}
			});
		 
		 duljina.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 //TODO Auto-generated method stub
					mp.start();
					gumb.setImageResource(R.drawable.gumbzelena);
					duljina1.setText(Html.fromHtml(getString(R.string.duljinastring)));
					podaci1.setText(getString(R.string.reset));
					masa1.setText(getString(R.string.reset));
					temp1.setText(getString(R.string.reset));
				
					id=3;
				}
			});
		 
		 tezina.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 //TODO Auto-generated method stub
					mp.start();
					gumb.setImageResource(R.drawable.gumbplavo);
					masa1.setText(Html.fromHtml(getString(R.string.masastring)));
					podaci1.setText(getString(R.string.reset));
					temp1.setText(getString(R.string.reset));
					duljina1.setText(getString(R.string.reset));
				
					id=4;
				}
			});
		 gumb.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 //TODO Auto-generated method stub
					mp.start();
					if (id==1)
					{
						Intent intent = new Intent(v.getContext(), Temperature.class);
						startActivityForResult(intent, 0);
					//	intent.putExtra("id", id);                 //slanje ID kako ne bi morao raditi poseban activity za svaku osobu
						

					}
					if (id==2)
					{
						Intent intent = new Intent(v.getContext(), Data.class);
						startActivityForResult(intent, 0);
					}
					if(id==3)
					{
						Intent intent = new Intent(v.getContext(), Distance.class);
						startActivityForResult(intent, 0);
					}
					if(id==4)
					{
						Intent intent = new Intent(v.getContext(), Weight.class);
						startActivityForResult(intent, 0);
					}
					
					
				}
			});
		 
	/*	 Thread t1 = new Thread(){
				public void run(){
					runOnUiThread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							
							TextView tempe = (TextView) findViewById(R.id.textView1);
							AnimationDrawable animation2 = new AnimationDrawable();
					        animation2.addFrame(getResources().getString(R.string.temp1), 3400);
					        animation2.addFrame(getResources().getDrawable(R.drawable.knjiga22), 3400);
					        animation2.addFrame(getResources().getDrawable(R.drawable.knjiga33), 3400);
					        animation2.addFrame(getResources().getDrawable(R.drawable.knjiga55), 3400);
					        animation2.setOneShot(false);
					        tempe.setBackgroundDrawable(animation2);
					        animation2.start();
					        			        
					      
							
					        
						}
					});
				}
				};*/

		 
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
