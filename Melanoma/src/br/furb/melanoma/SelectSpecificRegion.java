package br.furb.melanoma;


import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;


public class SelectSpecificRegion extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_specific_region);
		 
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
}
