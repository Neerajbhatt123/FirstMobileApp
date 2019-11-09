package com.example.iodemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tx=(TextView)findViewById(R.id.textView1);
        WebView wv=(WebView)findViewById(R.id.webView1);
        wv.loadUrl("http://www.yourdomain.com/magento/");
        
        try{
        	FileOutputStream ob=openFileOutput("myr.txt", MODE_PRIVATE);
        	ob.write("Hii my name is neeraj".getBytes());
        	ob.close();
        	
        	FileInputStream ob1=openFileInput("myr.txt");
        	byte []reader=new byte[ob1.available()];
        	while(ob1.read(reader)!=-1)
        	{
        		String a = (new String(reader));
        		tx.setText(a);
        	}
        	ob1.close();
        	
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
