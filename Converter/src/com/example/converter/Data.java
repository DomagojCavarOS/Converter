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

public class Data extends Activity implements OnItemSelectedListener {
	Spinner sprvi;
	Spinner sdrugi;
	EditText PrvaVelicina;
	 double Rj=0;
	 double Br=0;
	 String sp1;
	 String sp2;
	 ImageView data;	
	 int id=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_data);
		final MediaPlayer mp = MediaPlayer.create(this, R.raw.mjuz);
		
		sprvi=(Spinner)findViewById(R.id.spinner1);
		sdrugi=(Spinner)findViewById(R.id.spinner2);
		

		
		data =  (ImageView) findViewById(R.id.imageView1);
		PrvaVelicina=(EditText)findViewById(R.id.editText1);
		data.setOnClickListener(new View.OnClickListener() 
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
					
				if ( sp1.equals("Megabyte") && sp2.equals("Megabyte"))
					{
				
				Br=Double.parseDouble(PrvaVelicina.getText().toString());
				Rj=Br;
				id=28;
					   
					}


			if ( sp1.equals("Megabyte") && sp2.equals("Kilobyte"))
			{
				Br=Double.parseDouble(PrvaVelicina.getText().toString());;
				Rj=Br*1024;
				id=29;
				
				
			}
			if ( sp1.equals("Megabyte") && sp2.equals("Gigabyte"))
			{
				Br=Double.parseDouble(PrvaVelicina.getText().toString());;
				Rj=(double) (Br*0.00098);
				id=30;
				
			}
	//fahrenheite
			if ( sp1.equals("Kilobyte") && sp2.equals("Kilobyte"))
			{
				Br=Double.parseDouble(PrvaVelicina.getText().toString());
				Rj=Br;
				id=31;
				
			}
			if ( sp1.equals("Kilobyte") && sp2.equals("Megabyte"))
			{
				Br=Double.parseDouble(PrvaVelicina.getText().toString());
				Rj=(double) (Br*0.00098);
				id=32;
			}

			
			if ( sp1.equals("Kilobyte") && sp2.equals("Gigabyte"))
			{

				Br=Double.parseDouble(PrvaVelicina.getText().toString());
				Rj=Br*(0.0000009546);
				id=33;
	
			   
			}

//kelvine
			if ( sp1.equals("Gigabyte") && sp2.equals("Gigabyte"))
			{
				Br=Double.parseDouble(PrvaVelicina.getText().toString());
				Rj=Br;
				id=34;

			}
			if ( sp1.equals("Gigabyte") && sp2.equals("Megabyte"))
			{
				Br=Double.parseDouble(PrvaVelicina.getText().toString());
				Rj=Br*1024;
				id=35;

			}
			if ( sp1.equals("Gigabyte") && sp2.equals("Kilobyte"))
			{
				Br=Double.parseDouble(PrvaVelicina.getText().toString());
				Rj=(double) (Br*1048576);
				id=36;

			}
			
	
			Intent Intent = new Intent(v.getContext(), Convert.class);
			double RJJ=Rj;
			double BRR=Br;
			Intent.putExtra("Rjed", RJJ);   
			Intent.putExtra("id", id);
			Intent.putExtra("Brd", BRR);//slanje ID kako ne bi morao raditi poseban activity za svaku osobu
			startActivityForResult(Intent, 0);
				
				
				}}		
			});
		
		

		
		ArrayAdapter adapter=ArrayAdapter.createFromResource(this, R.array.data,android.R.layout.simple_spinner_item);
		sprvi.setAdapter(adapter);
		
		sprvi.setOnItemSelectedListener(this);
		
		ArrayAdapter adapter1=ArrayAdapter.createFromResource(this, R.array.data,android.R.layout.simple_spinner_item);
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
		getMenuInflater().inflate(R.menu.data, menu);
		return true;
	}

}
