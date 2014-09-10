package com.example.coursefragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

public class NamesFragment extends Fragment implements View.OnClickListener {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.names_fragment, container, false);
		setupClickListeners(v);
		return v;
	}

	private void setupClickListeners(View v) {
		setupClickListener(v, R.id.Android);
		setupClickListener(v, R.id.IOS);
		setupClickListener(v, R.id.WindowsPhone);
		setupClickListener(v, R.id.BlackBerryOS);
		setupClickListener(v, R.id.UbuntuPhone);
	}

	private void setupClickListener(View v, int childViewId) {
		View childView = v.findViewById(childViewId);
		childView.setOnClickListener(this);
	}

	int translateIdToIndex(int id) {
		int index = 0;
		switch (id) {
		case R.id.Android:
			index = 0;
			break;
		case R.id.IOS:
			index = 1;
			break;
		case R.id.WindowsPhone:
			index = 2;
			break;
		case R.id.BlackBerryOS:
			index = 3;
			break;
		case R.id.UbuntuPhone:
			index = 4;
			break;
		}
		return index;
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		RadioButton rb = (RadioButton) v;
		CharSequence text = rb.getText();
		int index = translateIdToIndex(id);
		Activity act = getActivity();
		FragmentInterface fInterface = (FragmentInterface) act;
		fInterface.onSelectedChanged(index);
	}

}
