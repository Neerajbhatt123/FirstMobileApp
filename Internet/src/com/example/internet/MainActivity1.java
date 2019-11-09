package com.example.internet;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity1 extends Activity {
	WebView w;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity1);
		w=(WebView)findViewById(R.id.webView1);
		w.setWebViewClient(new MyBrowser());
		Intent in=getIntent();
		Bundle b=in.getExtras();
		String s=b.getString("key");
		// String url="+s+";
		
		w.loadUrl(s);
		
		
	}
	public class MyBrowser extends WebViewClient {
		   public boolean shouldOverrideUrlLoading(WebView view, String url) {
		      view.loadUrl(url);
		      return false;
		   }
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity1, menu);
		return true;
	}

}
