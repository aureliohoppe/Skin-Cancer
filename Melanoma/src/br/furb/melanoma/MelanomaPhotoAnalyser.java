package br.furb.melanoma;


import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MelanomaPhotoAnalyser extends Activity {
	ImageView imageZoom;
	SelectSpecificRegion selSpcRegion;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_melanoma_photo_analyser);
		
		imageZoom = (ImageView) findViewById(R.id.imageZoom);
		Uri fileUri = null;
	    fileUri = Uri.fromFile(selSpcRegion.selected.getImage());
		imageZoom.setImageURI(fileUri);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.melanoma_photo_analyser, menu);
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
