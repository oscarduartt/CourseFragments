package com.example.coursefragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DescriptionFragment extends Fragment {
	final String indexStateKey = "Index";
	final int indexDefaultValue = 0;
	TextView txtDescription;
	String[] descriptionsArray;
	int index;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View v = inflater.inflate(R.layout.description_fragment, container,
				false);
		
		txtDescription = (TextView) v.findViewById(R.id.Description);
		
		//Se asigna el valor al arreglo desde Resources.
		descriptionsArray = getResources().getStringArray(R.array.Descriptions);
		
		//Se saca el valor de SaveIntanceState si es que existe de lo contrario se le asigna valor Default.
		index = savedInstanceState == null ? indexDefaultValue
				: savedInstanceState.getInt(indexStateKey, indexDefaultValue);
		setDisplayedDescription(index);
		return v;
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		//Al salir de la vista se guarda el valor de index para poder recuperarlo en el onCreate.
		outState.putInt(indexStateKey, index);
	}

	public void setDisplayedDescription(int index) {
		this.index = index;
		txtDescription.setText(descriptionsArray[index]);
	}
}
