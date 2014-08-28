package br.furb.melanoma;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.Toast;
import android.view.ViewGroup;

public class SelecionaRegiaoCorporal extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seleciona_regiao_corporal);

		Gallery galleryA = (Gallery) findViewById(R.id.galleryA);
		Gallery galleryB = (Gallery) findViewById(R.id.galleryB);
		Gallery galleryC = (Gallery) findViewById(R.id.galleryC);
		Gallery galleryD = (Gallery) findViewById(R.id.galleryD);		
		Gallery galleryE = (Gallery) findViewById(R.id.galleryE);	

		((Gallery) findViewById(R.id.galleryA))
		.setAdapter(new ControlImageA(this));

		((Gallery) findViewById(R.id.galleryB))
		.setAdapter(new ControlImageB(this));

		((Gallery) findViewById(R.id.galleryC))
		.setAdapter(new ControlImageC(this));

		((Gallery) findViewById(R.id.galleryD))
		.setAdapter(new ControlImageD(this));

		((Gallery) findViewById(R.id.galleryE))
		.setAdapter(new ControlImageE(this));
		
		
		
		// usando o toast para mostrar a posição da imagem que esta sendo clicada
		/*
        galleryA.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(SelecionaRegiaoCorporal.this, "" + position, Toast.LENGTH_SHORT).show();
            }
        });
		*/
		
     // We also want to show context menu for longpressed items in the gallery
        registerForContextMenu(galleryA);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.seleciona_regiao_corporal, menu);
		return true;
	}


	
	 @Override
	 public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

    