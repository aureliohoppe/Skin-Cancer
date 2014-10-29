package br.furb.melanoma;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.googlecode.javacv.FrameGrabber.ImageMode;

import ExpandableListViewControl.ExpandListAdapter;
import ExpandableListViewControl.Group;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.provider.MediaStore.Files.FileColumns;
import android.provider.MediaStore.Images;
import android.util.Log;
import android.net.Uri;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Toast;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;

import br.furb.melanoma.DataBasePointControl.*;

public class SelectSpecificRegion extends Activity {

	static int positionGallery;
	int posX, posY;
	ImageView display;
	Images imagem;
	File file;
	private ExpandListAdapter ExpAdapter;
	private ArrayList<Group> ExpListItems;
	private ExpandableListView ExpandList;
    private static File[] listFile;
	private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 100;
	private static final int YOUR_SELECT_PICTURE_REQUEST_CODE = 0;
	private Uri fileUri;
	private Uri outputFileUri;
	private AlertDialog alerta;
	SparseArray<Group> groups = new SparseArray<Group>();
	SelectPicsOnMelanomaDirectory selImagens;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_specific_region);

		// exibe imagem da posi�ao selecionada na tela anterior
		display = (ImageView) findViewById(R.id.imageViewFixImages);
		//View childView = getMyView();
		
		
		desenhaImagemDisplay();
		GetImageStorageMelanoma();
				
		display.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {

				int action = event.getAction();
				posX = (int) event.getX();
				posY = (int) event.getY();
				
				cameraAlert();

				switch (action) {
				case MotionEvent.ACTION_DOWN:

					break;
				case MotionEvent.ACTION_MOVE:

					break;
				case MotionEvent.ACTION_UP:

					break;

				}
				return false;
			}

		});
		populaListView();

	}

	// varre o diretorio MelanomaPics e carrega todas as imagens para a
	// expandable listview
	public ArrayList<Group> GetImageStorageMelanoma() {
		SelectPicsOnMelanomaDirectory selImagens = new SelectPicsOnMelanomaDirectory();
		return selImagens.SelectPicsOnMelanomaDirectory(CreateListFiles());
	}
	
	public void populaListView(){
		ExpListItems = GetImageStorageMelanoma();
		if (ExpListItems != null) {
			ExpAdapter = new ExpandListAdapter(this, ExpListItems);
			ExpandList = (ExpandableListView) findViewById(R.id.ExpandableListViewFixImages);
			ExpandList.setAdapter(ExpAdapter);
		}
	}

	public File[] CreateListFiles() {
		// Check for SD Card
		if (!Environment.getExternalStorageState().equals(
				Environment.MEDIA_MOUNTED)) {
			Toast.makeText(this, "Error! No SDCARD Found!", Toast.LENGTH_LONG)
					.show();
		} else {
			file = new File(Environment.getExternalStorageDirectory(),
					File.separator + "/MelanomaPics/" + File.separator
							+ "/01133124909/");
			file.mkdirs();
		}
		// pega todas as imagens do diretorio MelanomaPics e coloca dentro de
		// uma lista
		if (file.isDirectory()) {
			listFile = file.listFiles();
		}

		return listFile;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_specific_region, menu);
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

	private void openImageIntent() {

		// Determine Uri of camera image to save.
		
		
		//TODO NO LUGAR ONDE ESTA O NUMERO DO MEU CPF CRIAR A FUNCAO PRA CONTROLAR O CPF DE CADA USUARIO
		final File root = new File(Environment.getExternalStorageDirectory()
				+ File.separator + "MelanomaPics" + File.separator + "01133124909" + File.separator);
		root.mkdirs();

		// chama a funcao que retorna o grupo da imagem
		String imgpath = new MelanomaPicsSaveControl().setImagePath();
		String timeStamp = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String group = new String();
		selImagens = new SelectPicsOnMelanomaDirectory();
		
		group = selImagens.setGroupName(imgpath, selImagens.devolveListaSelecionados(imgpath, CreateListFiles()), posX, posY);

		final String fname = imgpath + "_" + group + "_" + posX + "_" + posY
				+ "_" + timeStamp + ".jpg";
		
		final File sdImageMainDirectory = new File(root, fname);
		outputFileUri = Uri.fromFile(sdImageMainDirectory);

		// Camera.
		final List<Intent> cameraIntents = new ArrayList<Intent>();
		final Intent captureIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
		final PackageManager packageManager = getPackageManager();
		final List<ResolveInfo> listCam = packageManager.queryIntentActivities(captureIntent, 0);
		
		for (ResolveInfo res : listCam) {
			final String packageName = res.activityInfo.packageName;
			final Intent intent = new Intent(captureIntent);
			
			intent.setComponent(new ComponentName(res.activityInfo.packageName,res.activityInfo.name));
			intent.setPackage(packageName);
			intent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);
			cameraIntents.add(intent);
		}

		// Filesystem.
		final Intent galleryIntent = new Intent();
		galleryIntent.setType("image/*");
		galleryIntent.setAction(Intent.ACTION_GET_CONTENT);

		// Chooser of filesystem options.
		final Intent chooserIntent = Intent.createChooser(galleryIntent,"Select Source");

		// Add the camera options.
		chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS,cameraIntents.toArray(new Parcelable[] {}));

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

	public void setPosX(int posx) {
		posX = posx;
	}

	public void setPosY(int posy) {
		posY = posy;
	}
	

	public void cameraAlert() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Camera");
		String imgpath = new MelanomaPicsSaveControl().setImagePath();

		
/*		if (selImagens.perteceGrupo(imgpath, selImagens.devolveListaSelecionados(imgpath, CreateListFiles()), posX, posY) == 0) {
			builder.setMessage("Capturar imagem para novo grupo?");
		} else {
			builder.setMessage("Inserir nova imagem no grupo " + selImagens.perteceGrupo(imgpath, selImagens.devolveListaSelecionados(imgpath, CreateListFiles()), posX, posY)+" ?");
		}*/

		builder.setMessage("Capturar nova imagem?");
		builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				openImageIntent();
				
			}

		});

		builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});

		builder.create().show();
		
	}
		
	public void desenhaImagemDisplay() {
		Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),
				setDisplay());
		
		Paint paint = new Paint();
		paint.setColor(Color.BLUE);
		 paint.setTextSize(10);
		  // text shadow
		  paint.setShadowLayer(1f, 0f, 1f, Color.WHITE);

		
		Bitmap workingBitmap = Bitmap.createBitmap(bitmap);
		Bitmap mutableBitmap = workingBitmap
				.copy(Bitmap.Config.ARGB_8888, true);
		
		Canvas canvas = new Canvas(mutableBitmap);
		
		Paint paintText = new Paint(Paint.ANTI_ALIAS_FLAG);
		paintText.setColor(Color.BLUE);
		paintText.setTextSize(50);
		paintText.setStyle(Style.FILL);
		paintText.setShadowLayer(10f, 10f, 10f, Color.BLACK);

		Rect rectText = new Rect();
		paintText.getTextBounds("1", 0, 1,
				rectText);

		canvas.drawText("1", 0, rectText.height(), paintText);
		
		
		// CRIAR O FOR PRA QUE DESENHE TODOS OS PONTOS NECESSARIOS

		canvas.drawCircle(10, 10, 3, paint);
		
		display.setAdjustViewBounds(true);
		display.setImageBitmap(mutableBitmap);

	}

	public int setDisplay() {
		// os valores dos digitos comparativos s�o:
		// primeiro digito numero da gallery
		// segundo posi��o vetorial na gallery
		switch (SelecionaRegiaoCorporal.positionGallery) {
		case 10:
			display.setImageResource(R.drawable.a1);
			return R.drawable.a1;

		case 11:
			display.setImageResource(R.drawable.a2);
			return R.drawable.a2;

		case 12:
			display.setImageResource(R.drawable.a3);
			return R.drawable.a3;

		case 13:
			display.setImageResource(R.drawable.a4);
			return R.drawable.a4;

		case 14:
			display.setImageResource(R.drawable.a5);
			return R.drawable.a5;

		case 20:
			display.setImageResource(R.drawable.b1);
			return R.drawable.b1;

		case 21:
			display.setImageResource(R.drawable.b2);
			return R.drawable.b2;

		case 22:
			display.setImageResource(R.drawable.b3);
			return R.drawable.b3;

		case 23:
			display.setImageResource(R.drawable.b4);
			return R.drawable.b4;

		case 24:
			display.setImageResource(R.drawable.b5);
			return R.drawable.b5;

		case 30:
			display.setImageResource(R.drawable.c1);
			return R.drawable.c1;

		case 31:
			display.setImageResource(R.drawable.c2);
			return R.drawable.c2;

		case 32:
			display.setImageResource(R.drawable.c3);
			return R.drawable.c3;

		case 33:
			display.setImageResource(R.drawable.c4);
			return R.drawable.c4;

		case 34:
			display.setImageResource(R.drawable.c5);
			return R.drawable.c5;

		case 40:
			display.setImageResource(R.drawable.d1);
			return R.drawable.d1;

		case 41:
			display.setImageResource(R.drawable.d2);
			return R.drawable.d2;

		case 42:
			display.setImageResource(R.drawable.d3);
			return R.drawable.d3;

		case 43:
			display.setImageResource(R.drawable.d4);
			return R.drawable.d4;

		case 44:
			display.setImageResource(R.drawable.d5);
			return R.drawable.d5;

		case 50:
			display.setImageResource(R.drawable.e1);
			return R.drawable.e1;

		case 51:
			display.setImageResource(R.drawable.e2);
			return R.drawable.e2;

		case 52:
			display.setImageResource(R.drawable.e3);
			return R.drawable.e3;

		case 53:
			display.setImageResource(R.drawable.e4);
			return R.drawable.e4;

		case 54:
			display.setImageResource(R.drawable.e5);
			return R.drawable.e5;

		default:
			break;
		}
		return 0;
	}
}
