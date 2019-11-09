package com.example.baetu;

import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText et, et1;
	Button btn;
	TextView tv;
	SQLiteDatabase sql;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText)findViewById(R.id.editText1);
        et1=(EditText)findViewById(R.id.editText2);
        tv=(TextView)findViewById(R.id.textView1);
        btn=(Button)findViewById(R.id.button1);
        sql=openOrCreateDatabase("you", SQLiteDatabase.CREATE_IF_NECESSARY,null);
        btn.setOnClickListener(new code());
        
        
    }
    class code implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Cursor c=sql.query("table", null, null,null,null,null,null);
			if(c.isAfterLast()==false)
			{
				tv.append(c.getInt(0)+""+c.getString(1));
				c.moveToNext();
			}
		}
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
