package com.example.coursefragments;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;

public class SplitActivity extends Activity implements FragmentInterface{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_split);
	}

	@Override
	public void onSelectedChanged(int index) {
		FragmentManager fm = getFragmentManager();
		DescriptionFragment descriptionFragment = (DescriptionFragment)fm.findFragmentById(R.id.IDDescriptionsFragment);
		descriptionFragment.setDisplayedDescription(index);		
	}

}
