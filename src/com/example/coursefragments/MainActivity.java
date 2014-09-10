package com.example.coursefragments;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.Split:
			Log.w("Split", "Split");
			startActivity(new Intent(MainActivity.this, SplitActivity.class));
			break;
		case R.id.SeparateActivities:
			Log.w("SeparateActivities", "SeparateActivities");
			startActivity(new Intent(MainActivity.this, SeparateActivity1.class));
			break;
		case R.id.BtnHandling:
			Log.w("BtnHandling", "BtnHandling");
			startActivity(new Intent(MainActivity.this, ButtonHandlingActivity.class));
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
