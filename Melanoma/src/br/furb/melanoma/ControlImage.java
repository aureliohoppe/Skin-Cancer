package br.furb.melanoma;

import android.app.ActionBar.LayoutParams;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ControlImage extends BaseAdapter{

	private Context ContextA;
	
	private static int[] ImagesGroupA = { R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5};
	private static int[] ImagesGroupB = { R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5};
	private static int[] ImagesGroupC = { R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4, R.drawable.c5};
	private static int[] ImagesGroupD = { R.drawable.d1, R.drawable.d2, R.drawable.d3, R.drawable.d4, R.drawable.d5};
	private static int[] ImagesGroupE = { R.drawable.e1, R.drawable.e2, R.drawable.e3, R.drawable.e4, R.drawable.e5};
	
                                      
	public ControlImage(Context c) {
		this.ContextA = c;
	}
	
		
	public float getScale(boolean focused, int offset) {
		return Math.max(0, 1.0f / (float) Math.pow(2, Math.abs(offset)));
	}

	public long getItemIdA(int position) {
		return 0;
	}

	public static int[] getImagesA() {
		return ImagesGroupA;
	}

	@Override
	public int getCount() {
		return this.ImagesGroupA.length;
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView img = new ImageView(this.ContextA);
		img.setImageResource(this.ImagesGroupA[position]);
		img.setScaleType(ImageView.ScaleType.FIT_XY);
		img.setLayoutParams(new Gallery.LayoutParams(180, 180));
		return img;
	}
}
