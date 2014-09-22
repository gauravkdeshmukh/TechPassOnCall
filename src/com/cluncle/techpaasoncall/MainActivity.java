package com.cluncle.techpaasoncall;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TabHost tabHost = getTabHost();
		
		//Tab for Home
		TabSpec homespec = tabHost.newTabSpec("Home");
		homespec.setIndicator("Home");
		Intent homeIntent = new Intent(this,HomeActivity.class);
		homespec.setContent(homeIntent);
		
		//Tab for Settings
		TabSpec settingspec = tabHost.newTabSpec("Settings");
		settingspec.setIndicator("Setting");
		Intent settingsIntent = new Intent(this,SettingActivity.class);
		settingspec.setContent(settingsIntent);
		
		//Tab for Settings
		TabSpec searchspec = tabHost.newTabSpec("Search");
		searchspec.setIndicator("Search");
		Intent searchIntent = new Intent(this,SearchActivity.class);
		searchspec.setContent(searchIntent);
		
		//Tab for Contacts
		TabSpec contactspec = tabHost.newTabSpec("Contacts");
		contactspec.setIndicator("Contact");
		Intent contactsIntent = new Intent(this,ContactActivity.class);
		contactspec.setContent(contactsIntent);
		
		//Tab for More
		TabSpec morespec = tabHost.newTabSpec("More");
		morespec.setIndicator("More");
		Intent moreIntent = new Intent(this,MoreActivity.class);
		morespec.setContent(moreIntent);
				
		// Adding all TabSpec to TabHost
		tabHost.addTab(homespec); // Adding home tab
        tabHost.addTab(settingspec); // Adding settings tab
        tabHost.addTab(searchspec); // Adding search tab
        tabHost.addTab(contactspec); // Adding contacts tab
        tabHost.addTab(morespec); // Adding more tab
		
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
