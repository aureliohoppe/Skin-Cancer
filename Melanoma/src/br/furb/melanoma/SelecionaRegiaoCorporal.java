package br.furb.melanoma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.ViewGroup;

public class SelecionaRegiaoCorporal extends Activity {

	public SelectSpecificRegion sendId;
	ImageView displayS;
	static int positionGallery;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seleciona_regiao_corporal);

		final Gallery galleryA = (Gallery) findViewById(R.id.galleryA);
		Gallery galleryB = (Gallery) findViewById(R.id.galleryB);
		Gallery galleryC = (Gallery) findViewById(R.id.galleryC);
		Gallery galleryD = (Gallery) findViewById(R.id.galleryD);
		Gallery galleryE = (Gallery) findViewById(R.id.galleryE);

		((Gallery) findViewById(R.id.galleryA)).setAdapter(new ControlImageA(
				this));
		((Gallery) findViewById(R.id.galleryB)).setAdapter(new ControlImageB(
				this));
		((Gallery) findViewById(R.id.galleryC)).setAdapter(new ControlImageC(
				this));
		((Gallery) findViewById(R.id.galleryD)).setAdapter(new ControlImageD(
				this));
		((Gallery) findViewById(R.id.galleryE)).setAdapter(new ControlImageE(
				this));

		displayS = (ImageView) findViewById(R.id.imageViewFixImages);

		// inicia listners para todas as gallerys

		galleryA.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				// Toast.makeText(SelecionaRegiaoCorporal.this, "" + position,
				// Toast.LENGTH_SHORT).show();
				if (position == 0) {
					positionGallery = 10;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 1) {
					positionGallery = 11;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 2) {
					positionGallery = 12;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 3) {
					positionGallery = 13;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 4) {
					positionGallery = 14;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}

			}
		});

		galleryB.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				if (position == 0) {
					positionGallery = 20;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 1) {
					positionGallery = 21;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 2) {
					positionGallery = 22;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 3) {
					positionGallery = 23;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 4) {
					positionGallery = 24;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}

			}
		});

		galleryC.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				if (position == 0) {
					positionGallery = 30;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 1) {
					positionGallery = 31;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 2) {
					positionGallery = 32;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 3) {
					positionGallery = 33;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 4) {
					positionGallery = 34;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}

			}
		});

		galleryD.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				if (position == 0) {
					positionGallery = 40;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 1) {
					positionGallery = 41;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 2) {
					positionGallery = 42;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 3) {
					positionGallery = 43;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 4) {
					positionGallery = 44;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}

			}
		});

		galleryE.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				if (position == 0) {
					positionGallery = 50;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 1) {
					positionGallery = 51;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 2) {
					positionGallery = 52;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 3) {
					positionGallery = 53;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);

				}
				if (position == 4) {
					positionGallery = 54;
					Intent in = new Intent(SelecionaRegiaoCorporal.this,
							SelectSpecificRegion.class);
					startActivity(in);
				}

			}
		});

		// We also want to show context menu for longpressed items in the
		// gallery
		registerForContextMenu(galleryA);
		registerForContextMenu(galleryB);
		registerForContextMenu(galleryC);
		registerForContextMenu(galleryD);
		registerForContextMenu(galleryE);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.seleciona_regiao_corporal, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
