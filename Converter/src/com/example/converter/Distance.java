package com.example.converter;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Distance extends Activity implements OnItemSelectedListener {
	Spinner sprvi;
	Spinner sdrugi;
	EditText PrvaVelicina;
	 float Rj=0;
	 float Br=0;
	 String sp1;
	 String sp2;
	 ImageView distance;	
	 int id=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_distance);
		
		final MediaPlayer mp = MediaPlayer.create(this, R.raw.mjuz);
		sprvi=(Spinner)findViewById(R.id.spinner1);
		sdrugi=(Spinner)findViewById(R.id.spinner2);
		

		
		distance =  (ImageView) findViewById(R.id.imageView1);
		PrvaVelicina=(EditText)findViewById(R.id.editText1);
		distance.setOnClickListener(new View.OnClickListener() 
		{
				
				@Override
				public void onClick(View v) {
					 //TODO Auto-generated method stub
					mp.start();
					if (PrvaVelicina.getText() == null || "".equals(PrvaVelicina.getText().toString()))
					{
						Toast.makeText(getBaseContext(), "Please enter number", Toast.LENGTH_SHORT).show();
						
			            }
					else{
					
				if ( sp1.equals("Metres") && sp2.equals("Metres"))
					{
				
				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=Br;
				id=19;
					   
					}


			if ( sp1.equals("Metres") && sp2.equals("Feets"))
			{
				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=(float) (Br*3.2808399);
				id=20;
				
				
			}
			if ( sp1.equals("Metres") && sp2.equals("Inches"))
			{
				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=(float) (Br*39.3700787);
				id=21;
				
			}
			//fahrenheite
			if ( sp1.equals("Feets") && sp2.equals("Feets"))
			{
				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=Br;
				id=22;
				
			}
			if ( sp1.equals("Feets") && sp2.equals("Metres"))
			{
				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=(float) (Br*0.3048);
				id=23;
			}

			
			if ( sp1.equals("Feets") && sp2.equals("Inches"))
			{

				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=Br*12;
				id=24;
	
			   
			}

//kelvine
			if ( sp1.equals("Inches") && sp2.equals("Inches"))
			{
				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=Br;
				id=25;

			}
			if ( sp1.equals("Inches") && sp2.equals("Metres"))
			{
				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=(float) (Br*0.0254);
				id=26;

			}
			if ( sp1.equals("Inches") && sp2.equals("Feets"))
			{
				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=(float) (Br*0.0833333333);
				id=27;

			}
			
	
			Intent Intent = new Intent(v.getContext(), Convert.class);
			Intent.putExtra("Rje", Rj);   
			Intent.putExtra("id", id);
			Intent.putExtra("Br", Br);//slanje ID kako ne bi morao raditi poseban activity za svaku osobu
			startActivityForResult(Intent, 0);
				
				
				}}		
			});
		
		

		
		ArrayAdapter adapter=ArrayAdapter.createFromResource(this, R.array.duljina,android.R.layout.simple_spinner_item);
		sprvi.setAdapter(adapter);
		
		sprvi.setOnItemSelectedListener(this);
		
		ArrayAdapter adapter1=ArrayAdapter.createFromResource(this, R.array.duljina,android.R.layout.simple_spinner_item);
		sdrugi.setAdapter(adapter1);
		
		sdrugi.setOnItemSelectedListener(this);	

		
		
	}
		
		
	
		


	public void onItemSelected(AdapterView<?> adapterView, View view, int i,long l) {
		// TODO Auto-generated method stub
		TextView myText=(TextView) view;
		Toast.makeText(this," You have chosen "+myText.getText(), Toast.LENGTH_SHORT).show();
		final MediaPlayer mp = MediaPlayer.create(this, R.raw.mjuz);
		mp.start();
		sp1 = sprvi.getSelectedItem().toString();
		sp2 = sdrugi.getSelectedItem().toString();
	
		
		
	
		
	}
	

	



	public void onNothingSelected(AdapterView<?> adapterView) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.distance, menu);
		return true;
	}

}
