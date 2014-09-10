package com.example.coursefragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ButtonHandlingFragment extends Fragment {
	
	TextView lblclickCount;
	int clickCount = 0;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.button_handling_fragment, container, false);
		
		lblclickCount = (TextView)v.findViewById(R.id.lblClickCount);
		return v;
	}
	
	public void myButtonClickHandler(View v){
		clickCount++;
		lblclickCount.setText("Click Count: "+clickCount);
	}

}
