package com.example.tipcalculator;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
@SuppressWarnings("deprecation")
public class MainActivity extends Activity {

	//EditText balance;
	//Button calTip;
	//TextView showtext;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//balance= (EditText)findViewById(int id editText1);
		initDisplayButton();
	}

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void initDisplayButton(){
		Button displayButton = (Button) findViewById(R.id.button1);
		displayButton.setOnClickListener(new OnClickListener(){		
		@Override
			public void onClick(View arg0){
			
		
			EditText editName = (EditText) findViewById(R.id.editText1);
			
			TextView textDisplay10 = (TextView) findViewById(R.id.textView2);
			TextView textDisplay15 = (TextView) findViewById(R.id.textView3);
			TextView textDisplay20 = (TextView) findViewById(R.id.textView4);
			
			String name = editName.getText().toString();
			
			int n= Integer.parseInt(editName.getText().toString());
			double n10= n*1.10;
			double n15=n*1.15;
			double n20=n*1.20;
			
			textDisplay10.setText(""+n10);
			textDisplay15.setText(""+n15);
			textDisplay20.setText(""+n20);
			});
	
}
}
