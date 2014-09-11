package br.furb.melanoma;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.provider.MediaStore.Files.FileColumns;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Toast;

public class SelectSpecificRegion extends Activity {
	
	static int positionGallery;
	ImageView display;
	private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 100;
	private static final int YOUR_SELECT_PICTURE_REQUEST_CODE = 0;
	private Uri fileUri;
	private Uri outputFileUri;
	private AlertDialog alerta;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_specific_region);

	display = (ImageView) findViewById(R.id.imageViewFixImages);
		
		// os valores dos digitos comparativos são:
		// primeiro digito numero da gallery
		// segundo posição vetorial na gallery
		if (SelecionaRegiaoCorporal.positionGallery == 10) {
			display.setImageResource(R.drawable.a1);
		} else {
			if (SelecionaRegiaoCorporal.positionGallery == 11) {
				display.setImageResource(R.drawable.a2);
			} else {
				if (SelecionaRegiaoCorporal.positionGallery == 12) {
					display.setImageResource(R.drawable.a3);
				} else {
					if (SelecionaRegiaoCorporal.positionGallery == 13) {
						display.setImageResource(R.drawable.a4);
					} else {
						if (SelecionaRegiaoCorporal.positionGallery == 14) {
							display.setImageResource(R.drawable.a5);
						} else {
							if (SelecionaRegiaoCorporal.positionGallery == 20) {
								display.setImageResource(R.drawable.b1);
							} else {
								if (SelecionaRegiaoCorporal.positionGallery == 21) {
									display.setImageResource(R.drawable.b2);
								} else {
									if (SelecionaRegiaoCorporal.positionGallery == 22) {
										display.setImageResource(R.drawable.b3);
									} else {
										if (SelecionaRegiaoCorporal.positionGallery == 23) {
											display.setImageResource(R.drawable.b4);
										} else {
											if (SelecionaRegiaoCorporal.positionGallery == 24) {
												display.setImageResource(R.drawable.b5);
											} else {
												if (SelecionaRegiaoCorporal.positionGallery == 30) {
													display.setImageResource(R.drawable.c1);
												} else {
													if (SelecionaRegiaoCorporal.positionGallery == 31) {
														display.setImageResource(R.drawable.c2);
													} else {
														if (SelecionaRegiaoCorporal.positionGallery == 32) {
															display.setImageResource(R.drawable.c3);
														} else {
															if (SelecionaRegiaoCorporal.positionGallery == 33) {
																display.setImageResource(R.drawable.c4);
															} else {
																if (SelecionaRegiaoCorporal.positionGallery == 34) {
																	display.setImageResource(R.drawable.c5);
																} else {
																	if (SelecionaRegiaoCorporal.positionGallery == 40) {
																		display.setImageResource(R.drawable.d1);
																	} else {
																		if (SelecionaRegiaoCorporal.positionGallery == 41) {
																			display.setImageResource(R.drawable.d2);
																		} else {
																			if (SelecionaRegiaoCorporal.positionGallery == 42) {
																				display.setImageResource(R.drawable.d3);
																			} else {
																				if (SelecionaRegiaoCorporal.positionGallery == 43) {
																					display.setImageResource(R.drawable.d4);
																				} else {
																					if (SelecionaRegiaoCorporal.positionGallery == 44) {
																						display.setImageResource(R.drawable.d5);
																					} else {
																						if (SelecionaRegiaoCorporal.positionGallery == 50) {
																							display.setImageResource(R.drawable.e1);
																						} else {
																							if (SelecionaRegiaoCorporal.positionGallery == 51) {
																								display.setImageResource(R.drawable.e2);
																							} else {
																								if (SelecionaRegiaoCorporal.positionGallery == 52) {
																									display.setImageResource(R.drawable.e3);
																								} else {
																									if (SelecionaRegiaoCorporal.positionGallery == 53) {
																										display.setImageResource(R.drawable.e4);
																									} else {
																										if (SelecionaRegiaoCorporal.positionGallery == 54) {
																											display.setImageResource(R.drawable.e5);
																										}}}}}}}}}}}}}}}}}}}}}}}}}

/*		display.setOnTouchListener(new OnSwipeTouchListener(this) {
		    public void onSwipeTop() {
		        Toast.makeText(SelectSpecificRegion.this, "top", Toast.LENGTH_SHORT).show();
		    }
		    public void onSwipeRight() {
		        Toast.makeText(SelectSpecificRegion.this, "right", Toast.LENGTH_SHORT).show();
		    }
		    public void onSwipeLeft() {
		        Toast.makeText(SelectSpecificRegion.this, "left", Toast.LENGTH_SHORT).show();
		    }
		    public void onSwipeBottom() {
		        Toast.makeText(SelectSpecificRegion.this, "bottom", Toast.LENGTH_SHORT).show();
		    }
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	return super.onTouch(v, event);
		    }
		});*/
		
		display.setOnLongClickListener(new OnLongClickListener() {
	        @Override
	        public boolean onLongClick(View v) {
	            
	        	
	        	
	        	
	            return true;
	        }
	    });
	}
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_specific_region, menu);
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

	private void openImageIntent() {

		// Determine Uri of camera image to save.
		final File root = new File(Environment.getExternalStorageDirectory()
				+ File.separator + "MyDir" + File.separator);
		root.mkdirs();
		
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss")
				.format(new Date());
			

		final String fname = "IMG_demo_" + timeStamp + ".jpg";
		final File sdImageMainDirectory = new File(root, fname);
		outputFileUri = Uri.fromFile(sdImageMainDirectory);

		// Camera.
		final List<Intent> cameraIntents = new ArrayList<Intent>();
		final Intent captureIntent = new Intent(
				android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
		final PackageManager packageManager = getPackageManager();
		final List<ResolveInfo> listCam = packageManager.queryIntentActivities(
				captureIntent, 0);
		for (ResolveInfo res : listCam) {
			final String packageName = res.activityInfo.packageName;
			final Intent intent = new Intent(captureIntent);
			intent.setComponent(new ComponentName(res.activityInfo.packageName,
					res.activityInfo.name));
			intent.setPackage(packageName);
			intent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);
			cameraIntents.add(intent);
		}

		// Filesystem.
		final Intent galleryIntent = new Intent();
		galleryIntent.setType("image/*");
		galleryIntent.setAction(Intent.ACTION_GET_CONTENT);

		// Chooser of filesystem options.
		final Intent chooserIntent = Intent.createChooser(galleryIntent,
				"Select Source");

		// Add the camera options.
		chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS,
				cameraIntents.toArray(new Parcelable[] {}));

		startActivityForResult(chooserIntent, YOUR_SELECT_PICTURE_REQUEST_CODE);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode == RESULT_OK) {
			if (requestCode == YOUR_SELECT_PICTURE_REQUEST_CODE) {
				final boolean isCamera;
				if (data == null) {
					isCamera = true;
				} else {
					final String action = data.getAction();
					if (action == null) {
						isCamera = false;
					} else {
						isCamera = action
								.equals(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
					}
				}

				Uri selectedImageUri;
				if (isCamera) {
					selectedImageUri = outputFileUri;
				} else {
					selectedImageUri = data == null ? null : data.getData();
				}
			}
		}
	}
	
	/** Create a file Uri for saving an image or video */
	private static Uri getOutputMediaFileUri(int type) {
		return Uri.fromFile(getOutputMediaFile(type));
	}

	/** Create a File for saving an image or video */
	private static File getOutputMediaFile(int type) {
		// To be safe, you should check that the SDCard is mounted
		// using Environment.getExternalStorageState() before doing this.

		if (!isExternalStorageWritable()) {
			Log.d("external storage", "not available for read and write");
		}

		File mediaStorageDir = new File(
				Environment
						.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
				"MyCameraApp");

		// This location works best if you want the created images to be shared
		// between applications and persist after your app has been uninstalled.

		// Create the storage directory if it does not exist
		if (!mediaStorageDir.exists()) {
			if (!mediaStorageDir.mkdirs()) {
				Log.d("MyCameraApp", "failed to create directory");
				return null;
			}
		}

		// Create a media file name
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss")
				.format(new Date());
		File mediaFile;
		if (type == FileColumns.MEDIA_TYPE_IMAGE) {
			mediaFile = new File(mediaStorageDir.getPath() + File.separator
					+ "IMG_demo_" + timeStamp + ".jpg");
		} else {
			return null;
		}

		return mediaFile;
	}

	private static boolean isExternalStorageWritable() {
		String state = Environment.getExternalStorageState();
		if (Environment.MEDIA_MOUNTED.equals(state)) {
			return true;
		}
		return false;
	}
	
	private void optionList() { 
		//Lista de itens 
		ArrayList<String> itens = new ArrayList<String>();
		itens.add("Ruim");
		itens.add("Mediano");
		itens.add("Bom");
		itens.add("Ótimo");
		//adapter utilizando um layout customizado (TextView) 
		ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_select_specific_region, itens);
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Qualifique este software:");
		//define o diálogo como uma lista, passa o adapter.
		builder.setSingleChoiceItems(adapter, 0, new DialogInterface.OnClickListener() { 
			public void onClick(DialogInterface arg0, int arg1) { 
				Toast.makeText(SelectSpecificRegion.this, "posição selecionada=" + arg1, Toast.LENGTH_SHORT).show();
				alerta.dismiss(); } });
		alerta = builder.create();
		alerta.show();
		} 
}

		
	

