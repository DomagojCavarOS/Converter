package com.example.converter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class Convert extends Activity {
	TextView rijesenje;
	TextView prvo;
	int id;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_convert);
		rijesenje=(TextView) findViewById(R.id.textView1);
		prvo=(TextView) findViewById(R.id.textView2);
		rijesenje=(TextView) findViewById(R.id.textView1);
		
		Bundle b = getIntent().getExtras();
		float Rj = b.getFloat("Rje");
		id=b.getInt("id");
		float Br = b.getFloat("Br");
		double Brr = b.getDouble("Brd");
		double Rjj = b.getDouble("Rjed");
		
		
		
		if (id==1)
		{
			prvo.setText(String.format("%.2f Celsius to \n Celsius is:",Br));
			rijesenje.setText(String.format("%.2f °C", Rj));
		}
		if(id==2)
		{
			prvo.setText(String.format("%.2f Celsius to \n Fahrenheite is:",Br));
			rijesenje.setText(String.format("%.2f °F", Rj));	
		}
		if (id==3)
		{
			prvo.setText(String.format("%.2f Fahrenheite to \n Kelvine is:",Br));
			rijesenje.setText(String.format("%.2f K", Rj));
		}
		if(id==4)
		{
			prvo.setText(String.format("%.2f Fahrenheite to \n Celsius is:",Br));
			rijesenje.setText(String.format("%.2f °C", Rj));	
		}
		if (id==5)
		{
			prvo.setText(String.format("%.2f Fahrenheite to \n Fahrenheite is:",Br));
			rijesenje.setText(String.format("%.2f °F", Rj));
		}
		if(id==6)
		{
			prvo.setText(String.format("%.2f Kelvine to \n Kelvine is:",Br));
			rijesenje.setText(String.format("%.2f K", Rj));	
		}
		if (id==7)
		{
			prvo.setText(String.format("%.2f Kelvine to \n Fahrenheite is:",Br));
			rijesenje.setText(String.format("%.2f °F", Rj));
		}
		if(id==8)
		{
			prvo.setText(String.format("%.2f Kelvine to \n Celsius is:",Br));
			rijesenje.setText(String.format("%.2f °C", Rj));	
		}
		if(id==9)
		{
			prvo.setText(String.format("%.2f Celsius to \n Kelvine is:",Br));
			rijesenje.setText(String.format("%.2f K", Rj));	
		}
		
		//Weight
		if (id==10)
		{
			prvo.setText(String.format("%.2f Kilograms to \n Kilograms is:",Br));
			rijesenje.setText(String.format("%.2f Kg", Rj));
		}
		if(id==11)
		{
			prvo.setText(String.format("%.2f Kilograms to \n Pounds is:",Br));
			rijesenje.setText(String.format("%.2f lb", Rj));	
		}
		if (id==12)
		{
			prvo.setText(String.format("%.2f Kilograms to \n Grams is:",Br));
			rijesenje.setText(String.format("%.2f g", Rj));
		}
		if(id==13)
		{
			prvo.setText(String.format("%.2f Pounds to \n Kilograms is:",Br));
			rijesenje.setText(String.format("%.2f Kg", Rj));	
		}
		if (id==14)
		{
			prvo.setText(String.format("%.2f Pounds to \n Pounds is:",Br));
			rijesenje.setText(String.format("%.2f lb", Rj));
		}
		if(id==15)
		{
			prvo.setText(String.format("%.2f Pounds to \n Grams is:",Br));
			rijesenje.setText(String.format("%.2f g", Rj));	
		}
		if (id==16)
		{
			prvo.setText(String.format("%.2f Grams to \n Kilograms is:",Br));
			rijesenje.setText(String.format("%.2f Kg", Rj));
		}
		if(id==17)
		{
			prvo.setText(String.format("%.2f Grams to \n Pounds is:",Br));
			rijesenje.setText(String.format("%.2f lb", Rj));	
		}
		if(id==18)
		{
			prvo.setText(String.format("%.2f Grams to \n grams is:",Br));
			rijesenje.setText(String.format("%.2f g", Rj));	
		}
		//Distance
		if (id==19)
		{
			prvo.setText(String.format("%.2f Metres to \n Metres is:",Br));
			rijesenje.setText(String.format("%.2f m", Rj));
		}
		if(id==20)
		{
			prvo.setText(String.format("%.2f Metres to \n Feets is:",Br));
			rijesenje.setText(String.format("%.2f feets", Rj));	
		}
		if (id==21)
		{
			prvo.setText(String.format("%.2f Metres to \n Inches is:",Br));
			rijesenje.setText(String.format("%.2f inches", Rj));
		}
		if(id==22)
		{
			prvo.setText(String.format("%.2f Feets to \n Feets is:",Br));
			rijesenje.setText(String.format("%.2f feets", Rj));	
		}
		if (id==23)
		{
			prvo.setText(String.format("%.2f Feets to \n Metres is:",Br));
			rijesenje.setText(String.format("%.2f m", Rj));
		}
		if(id==24)
		{
			prvo.setText(String.format("%.2f Feets to \n Inches is:",Br));
			rijesenje.setText(String.format("%.2f inches", Rj));	
		}
		if (id==25)
		{
			prvo.setText(String.format("%.2f Inches to \n Inches is:",Br));
			rijesenje.setText(String.format("%.2f inches", Rj));
		}
		if(id==26)
		{
			prvo.setText(String.format("%.2f Inches to \n Metres is:",Br));
			rijesenje.setText(String.format("%.2f m", Rj));	
		}
		if(id==27)
		{
			prvo.setText(String.format("%.2f Inches to \n Feets is:",Br));
			rijesenje.setText(String.format("%.2f feets", Rj));	
		}
		
	//Data
		if (id==28)
		{
			prvo.setText(String.format("%.2f Megabyte to \n Megabyte is:",Brr));
			rijesenje.setText(String.format("%.2f MB", Rjj));
		}
		if(id==29)
		{
			prvo.setText(String.format("%.2f Megabyte to \n Kilobyte is:",Brr));
			rijesenje.setText(String.format("%.2f KB", Rjj));	
		}
		if (id==30)
		{
			prvo.setText(String.format("%.2f Megabyte to \n Gigabyte is:",Brr));
			rijesenje.setText(String.format("%.2f GB", Rjj));
		}
		if(id==31)
		{
			prvo.setText(String.format("%.2f Kilobyte to \n Kilobyte is:",Brr));
			rijesenje.setText(String.format("%.2f KB", Rjj));	
		}
		if (id==32)
		{
			prvo.setText(String.format("%.2f Kilobyte to \n Megabyite is:",Brr));
			rijesenje.setText(String.format("%.5f MB", Rjj));
		}
		if(id==33)
		{
			prvo.setText(String.format("%.2f Kilobyte to \n Gigabyte is:",Brr));
			rijesenje.setText(String.format("%.7f GB", Rjj));	
		}
		if (id==34)
		{
			prvo.setText(String.format("%.2f Gigabyte to \n Gigabyte is:",Brr));
			rijesenje.setText(String.format("%.2f GB", Rjj));
		}
		if(id==35)
		{
			prvo.setText(String.format("%.2f Gigabyte to \n Megabyte is:",Brr));
			rijesenje.setText(String.format("%.2f MB", Rjj));	
		}
		if(id==36)
		{
			prvo.setText(String.format("%.2f Gigabyte to \n Kilobyte is:",Brr));
			rijesenje.setText(String.format("%.2f KB", Rjj));	
		}
		
		
		
	}
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.convert, menu);
		return true;
	}

}
