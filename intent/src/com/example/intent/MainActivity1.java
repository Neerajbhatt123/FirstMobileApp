package com.example.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity1 extends Activity {
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity1);
		tv=(TextView)findViewById(R.id.textView1);
		Intent i=getIntent();
		Bundle b=i.getExtras();
		String a=b.getString("name");
		tv.setText(a);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity1, menu);
		return true;
	}

}
