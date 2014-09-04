package br.furb.melanoma;


import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;


public class SelectSpecificRegion extends Activity implements OnTouchListener {
	
	ImageView display;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_specific_region);
		 
		display = (ImageView) findViewById(R.id.imageView1);
		ImageView image1 = (ImageView) findViewById(R.id.ImageView01);
		ImageView image2 = (ImageView) findViewById(R.id.ImageView02);
		ImageView image3 = (ImageView) findViewById(R.id.ImageView03);
		ImageView image4 = (ImageView) findViewById(R.id.ImageView04);
		ImageView image5 = (ImageView) findViewById(R.id.ImageView05);
		ImageView image6 = (ImageView) findViewById(R.id.ImageView06);
		ImageView image7 = (ImageView) findViewById(R.id.ImageView07);
		ImageView image8 = (ImageView) findViewById(R.id.ImageView08);
		ImageView image9 = (ImageView) findViewById(R.id.ImageView09);
		ImageView image10 = (ImageView) findViewById(R.id.ImageView10);
		
		image1.setOnTouchListener(this);
		image2.setOnTouchListener(this);
		image3.setOnTouchListener(this);
		image4.setOnTouchListener(this);
		image5.setOnTouchListener(this);
		image6.setOnTouchListener(this);
		image7.setOnTouchListener(this);
		image8.setOnTouchListener(this);
		image9.setOnTouchListener(this);
		image10.setOnTouchListener(this);
		
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.ImageView01:
				display.setImageResource(R.drawable.a1);
			break;

		case R.id.ImageView02:
			display.setImageResource(R.drawable.a1);
		break;
		
		case R.id.ImageView03:
			display.setImageResource(R.drawable.a2);
		break;
		
		case R.id.ImageView04:
			display.setImageResource(R.drawable.a3);
		break;
		
		case R.id.ImageView05:
			display.setImageResource(R.drawable.a4);
		break;
		
		case R.id.ImageView06:
			display.setImageResource(R.drawable.a5);
		break;
		
		case R.id.ImageView07:
			display.setImageResource(R.drawable.b1);
		break;
		
		case R.id.ImageView08:
			display.setImageResource(R.drawable.c1);
		break;
		
		case R.id.ImageView09:
			display.setImageResource(R.drawable.d1);
		break;
		
		case R.id.ImageView10:
			display.setImageResource(R.drawable.e1);
		break;
		
		
		default:
			break;
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_specific_region, menu);
		return true;
	}

    public boolean onTouchEvent(MotionEvent evento){	
        final float x = evento.getX();
        final float y = evento.getY();
        System.out.println("Coordernadas X: "+x+" Y: "+y);
        // SLEEP 2 SECONDS HERE ...
        Handler handler = new Handler(); 
        handler.postDelayed(new Runnable() { 
             public void run() { 
             } 
        }, 10000); 
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

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		switch (v.getId()) {
		case R.id.ImageView01:
				display.setImageResource(R.drawable.a1);
			break;

		case R.id.ImageView02:
			display.setImageResource(R.drawable.a1);
		break;
		
		case R.id.ImageView03:
			display.setImageResource(R.drawable.a2);
		break;
		
		case R.id.ImageView04:
			display.setImageResource(R.drawable.a3);
		break;
		
		case R.id.ImageView05:
			display.setImageResource(R.drawable.a4);
		break;
		
		case R.id.ImageView06:
			display.setImageResource(R.drawable.a5);
		break;
		
		case R.id.ImageView07:
			display.setImageResource(R.drawable.b1);
		break;
		
		case R.id.ImageView08:
			display.setImageResource(R.drawable.c1);
		break;
		
		case R.id.ImageView09:
			display.setImageResource(R.drawable.d1);
		break;
		
		case R.id.ImageView10:
			display.setImageResource(R.drawable.e1);
		break;
		
		
		default:
			break;
		}
		return true;
	}


}
