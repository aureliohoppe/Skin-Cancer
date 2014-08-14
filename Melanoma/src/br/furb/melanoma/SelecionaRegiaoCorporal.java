package br.furb.melanoma;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Gallery;
import android.widget.TextView;

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
		.setAdapter(new ControlImage(this));
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
