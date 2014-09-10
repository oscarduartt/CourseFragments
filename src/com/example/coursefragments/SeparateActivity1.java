package com.example.coursefragments;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.view.Menu;

public class SeparateActivity1 extends Activity implements FragmentInterface{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.separate_activity1);
	}

	@Override
	public void onSelectedChanged(int index) {
		FragmentManager fm = getFragmentManager();
		DescriptionFragment descriptionFragment = (DescriptionFragment)fm.findFragmentById(R.id.IDDescriptionsFragment);
		
		if(descriptionFragment != null && descriptionFragment.isVisible()){
			descriptionFragment.setDisplayedDescription(index);
		}else{
			Intent i = new Intent(SeparateActivity1.this, SeparateActivity2.class);
			i.putExtra("index", index);
			startActivity(i);
		}
		
				
		
	}

}
