package com.example.coursefragments;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.view.Menu;
import android.view.View;

public class ButtonHandlingActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.button_handling_activity);
	}
	
	public void myButtonClickHandler(View v){
		FragmentManager fm = getFragmentManager();
		ButtonHandlingFragment fragment = (ButtonHandlingFragment)fm.findFragmentById(R.id.IDButtonHandlingFragment);
		fragment.myButtonClickHandler(v);
	}

}
