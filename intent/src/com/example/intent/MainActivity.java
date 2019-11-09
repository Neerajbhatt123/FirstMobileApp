package com.example.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	Button btn;
	EditText et;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button1);
        et=(EditText)findViewById(R.id.editText1);
        
        btn.setOnClickListener(new a());
    }
    class a implements OnClickListener 
    {

		@Override
		public void onClick(View arg0) {
		
			Intent i = new Intent(MainActivity.this,MainActivity1.class);
			String a=et.getText().toString();
			Bundle b= new Bundle();
			b.putString("name", a);
			i.putExtras(b);
			startActivity(i);		
			
		}
		}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
