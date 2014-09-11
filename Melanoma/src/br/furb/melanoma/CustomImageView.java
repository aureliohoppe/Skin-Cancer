package br.furb.melanoma;

import br.furb.melanoma.OnSwipeTouchListener.GestureListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class CustomImageView extends ImageView {

	public CustomImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
		//GestureDetector listener = new GestureDetector((Context) getParent(), new GestureListener());
		setOnTouchListener(new OnSwipeTouchListener((Context) getParent()) {
		    public void onSwipeTop() {
		        Toast.makeText((Context) getParent(), "top", Toast.LENGTH_SHORT).show();
		    }
		    public void onSwipeRight() {
		        Toast.makeText((Context) getParent(), "right", Toast.LENGTH_SHORT).show();
		    }
		    public void onSwipeLeft() {
		        Toast.makeText((Context) getParent(), "left", Toast.LENGTH_SHORT).show();
		    }
		    public void onSwipeBottom() {
		        Toast.makeText((Context) getParent(), "bottom", Toast.LENGTH_SHORT).show();
		    }
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	return super.onTouch(v, event);
		    }
		});
	}
	
	@Override
	public boolean dispatchTouchEvent(MotionEvent event) {
		return super.dispatchTouchEvent(event);
	}
	
}
