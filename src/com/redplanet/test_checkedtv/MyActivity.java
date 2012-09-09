package com.redplanet.test_checkedtv;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyActivity extends ListActivity {

	private static final String LOG_TAG = "Red Planet";

	String array[] = new String[] {
			"Lorem",
			"Ipsum",
			"Dolor"
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item,
				R.id.chtv_item, array);
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView listView, View v, int position, long id) {
		super.onListItemClick(listView, v, position, id);
		Log.i(LOG_TAG, "onItemClick position: " + position +
				", state: " + listView.isItemChecked(position));
	}

}
