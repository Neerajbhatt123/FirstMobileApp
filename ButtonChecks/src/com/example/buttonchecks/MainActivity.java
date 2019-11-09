package com.example.buttonchecks;

import android.R.integer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	Button btn,btn1,btn2,btn3;
	EditText et,et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		et = (EditText)findViewById(R.id.editText1);
		et1 = (EditText)findViewById(R.id.editText1);
        btn=(Button)findViewById(R.id.button1);
        btn1=(Button)findViewById(R.id.button2);
        btn1=(Button)findViewById(R.id.button3);
        btn1=(Button)findViewById(R.id.button4);
        btn.setOnClickListener(new b());
        btn.setOnClickListener(new sub());
        btn.setOnClickListener(new multi());
        btn.setOnClickListener(new div());
    }
    class b implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent i =new Intent(MainActivity.this,MainActivity_1.class);
			String num1=et.getText().toString();
			String num2=et1.getText().toString();
			int nu=Integer.parseInt(num1);
			int nu1=Integer.parseInt(num2);
			int result = nu+nu1;
			String result1=String.valueOf(result);
			Bundle b= new Bundle();
			b.putString("name", a);
			i.putExtras(b);
			startActivity(i);
			
		}
    	
    }
    class sub implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub

			Intent i =new Intent(MainActivity.this,MainActivity_1.class);
			String num1=et.getText().toString();
			String num2=et1.getText().toString();
			int nu=Integer.parseInt(num1);
			int nu1=Integer.parseInt(num2);
			int result = nu-nu1;
			String result1=String.valueOf(result);

			Bundle b= new Bundle();
			b.putString("name", sub);
			i.putExtras(b);
			startActivity(i);
		}
    	
    }
    class div implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub

			Intent i =new Intent(MainActivity.this,MainActivity_1.class);
			String num1=et.getText().toString();
			String num2=et1.getText().toString();
			int nu=Integer.parseInt(num1);
			int nu1=Integer.parseInt(num2);
			int result = nu*nu1;
			String result1=String.valueOf(result);

			Bundle b= new Bundle();
			b.putString("name", div);
			i.putExtras(b);
			startActivity(i);
		}
    	
    }
    class multi implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub

			Intent i =new Intent(MainActivity.this,MainActivity_1.class);
			String num1=et.getText().toString();
			String num2=et1.getText().toString();
			int nu=Integer.parseInt(num1);
			int nu1=Integer.parseInt(num2);
			int result = nu/nu1;
			String result1=String.valueOf(result);

			Bundle c= new Bundle();
			c.putString("key", multi);
			i.putExtras(c);
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
