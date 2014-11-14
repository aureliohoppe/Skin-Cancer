package br.furb.melanoma;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.furb.melanoma.R;
import br.furb.melanoma.ExpandableListViewControl.*;
import br.furb.melanoma.R.id;
import br.furb.melanoma.R.layout;
import br.furb.melanoma.R.menu;
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

public class MelanomaActivity extends Activity{
	
	static String pacientSelected;
	
	private ListView listviewPaciente;
	String[] values;
	private File file;
	private ListView mainListView;
	private ArrayAdapter<String> listAdapter;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_melanoma);

		String root_sd = Environment.getExternalStorageDirectory().toString();
		file = new File(root_sd + "/MelanomaPics/");
		final File list[] = file.listFiles();

		ArrayList<String> pacientes = new ArrayList<String>(); 
		for (int i = 0; i < list.length; i++) {
			pacientes.add(list[i].getName());
		}

		// Find the ListView resource. 
	    mainListView = (ListView) findViewById( R.id.listViewPacientes);
	    listAdapter = new ArrayAdapter<String>(this, R.layout.list_view_row_item, pacientes);

		mainListView.setAdapter(listAdapter);
		
		// Defining the item click listener for listView
        OnItemClickListener itemClickListener = new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
                
            	pacientSelected = list[position].getName();
            	Intent in = new Intent(MelanomaActivity.this, SelectBodyPart.class);
        		startActivity(in);
            	System.out.println("Entrou no listner");
            	
             }
        };
 
        // Setting the item click listener for listView
        mainListView.setOnItemClickListener(itemClickListener);
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
