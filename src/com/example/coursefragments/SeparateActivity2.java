package com.example.coursefragments;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.view.Menu;

public class SeparateActivity2 extends Activity {
	
	int index;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.separate_activity2);
		
		index = getIntent().getIntExtra("index", 0);
		
		FragmentManager fm = getFragmentManager();
		DescriptionFragment descriptionFragment = (DescriptionFragment)fm.findFragmentById(R.id.IDDescriptionsFragment);
		
		descriptionFragment.setDisplayedDescription(index);
	}

}
