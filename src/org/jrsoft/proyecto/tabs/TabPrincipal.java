package org.jrsoft.proyecto.tabs;

import org.jrsoft.proyecto.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TabPrincipal extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View rootView = inflater.inflate(R.layout.fragment_tab_principal, container, false);
		
		return rootView;
	}
	
	

}
