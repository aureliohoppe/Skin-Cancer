package br.furb.melanoma;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ExpandableListViewControl.*;
import android.app.Activity;
import android.app.ListActivity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import ExpandableListViewControl.*;

public class MelanomaActivity extends Activity{


	ListView listviewPaciente = (ListView) findViewById(R.id.listViewPacientes);
	String[] values;
	private File file;
	private List<String> myList;
	private  ListViewAdapter lvi;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_melanoma);

		myList = new ArrayList<String>();
		
		
		String root_sd = Environment.getExternalStorageDirectory().toString();
		file = new File(root_sd + "/MelanomaPics/");
		File list[] = file.listFiles();

		for (int i = 0; i < list.length; i++) {
			myList.add(list[i].getName());
		}

		ListViewAdapter lvi = new ListViewAdapter(this, R.id.listViewPacientes,myList);
		

		listviewPaciente.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				Toast.makeText(getApplicationContext(),
						"Click ListItem Number " + position, Toast.LENGTH_LONG)
						.show();
			}
		});
	}


	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.melanoma, menu);
		return true;
	}

	public void onCaptureImageButtonClicked(View view) {
		Intent in = new Intent(MelanomaActivity.this, CadastroPaciente.class);
		startActivity(in);
	}
	
}
