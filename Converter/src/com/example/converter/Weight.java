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

public class Weight extends Activity implements OnItemSelectedListener {
	Spinner sprvi;
	Spinner sdrugi;
	EditText PrvaVelicina;
	 float Rj=0;
	 float Br=0;
	 String sp1;
	 String sp2;
	 ImageView weight;	
	 int id=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weight);
		
		final MediaPlayer mp = MediaPlayer.create(this, R.raw.mjuz);
		sprvi=(Spinner)findViewById(R.id.spinner1);
		sdrugi=(Spinner)findViewById(R.id.spinner2);
		

		
		weight =  (ImageView) findViewById(R.id.imageView1);
		PrvaVelicina=(EditText)findViewById(R.id.editText1);
		weight.setOnClickListener(new View.OnClickListener() 
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
					
				if ( sp1.equals("Kilograms") && sp2.equals("Kilograms"))
					{
				
				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=Br;
				id=10;
					   
					}


			if ( sp1.equals("Kilograms") && sp2.equals("Pounds"))
			{
				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=(float) (Br*2.20462262);
				id=11;
				
				
			}
			if ( sp1.equals("Kilograms") && sp2.equals("Grams"))
			{
				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=Br*1000;
				id=12;
				
			}
			//fahrenheite
			if ( sp1.equals("Pounds") && sp2.equals("Kilograms"))
			{
				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=(float) (Br*0.45359237);
				id=13;
				
			}
			if ( sp1.equals("Pounds") && sp2.equals("Pounds"))
			{
				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=Br;
				id=14;
			}

			
			if ( sp1.equals("Pounds") && sp2.equals("Grams"))
			{

				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=(float) (Br*453.59237);
				id=15;
	
			   
			}

//kelvine
			if ( sp1.equals("Grams") && sp2.equals("Kilograms"))
			{
				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=(float) (Br*0.001);
				id=16;

			}
			if ( sp1.equals("Grams") && sp2.equals("Pounds"))
			{
				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=(float) (Br*0.00220462262);
				id=17;

			}
			if ( sp1.equals("Grams") && sp2.equals("Grams"))
			{
				Br=Float.parseFloat(PrvaVelicina.getText().toString());
				Rj=Br;
				id=18;

			}
			
	
			Intent Intent = new Intent(v.getContext(), Convert.class);
			Intent.putExtra("Rje", Rj);   
			Intent.putExtra("id", id);
			Intent.putExtra("Br", Br);//slanje ID kako ne bi morao raditi poseban activity za svaku osobu
			startActivityForResult(Intent, 0);
				
				
				}}		
			});
		
		

		
		ArrayAdapter adapter=ArrayAdapter.createFromResource(this, R.array.masa,android.R.layout.simple_spinner_item);
		sprvi.setAdapter(adapter);
		
		sprvi.setOnItemSelectedListener(this);
		
		ArrayAdapter adapter1=ArrayAdapter.createFromResource(this, R.array.masa,android.R.layout.simple_spinner_item);
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
		getMenuInflater().inflate(R.menu.weight, menu);
		return true;
	}

}
