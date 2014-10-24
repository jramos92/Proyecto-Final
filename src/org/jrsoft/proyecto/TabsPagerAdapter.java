package org.jrsoft.proyecto;

import org.jrsoft.proyecto.tabs.TabAlgo;
import org.jrsoft.proyecto.tabs.TabDatos;
import org.jrsoft.proyecto.tabs.TabPrincipal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {
	
	public TabsPagerAdapter(FragmentManager fm){
		super(fm);
	}

	@Override
	public Fragment getItem(int i) {
		
		switch (i) {
		case 0:
			return new TabPrincipal();
			
		case 1:
			
			return new TabDatos();
			
		case 2:
			
			return new TabAlgo();
		}
		
		return null;
	}

	@Override
	public int getCount() {
		return 3;
	}
	
}
