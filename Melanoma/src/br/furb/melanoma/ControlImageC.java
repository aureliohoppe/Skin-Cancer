package br.furb.melanoma;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ControlImageC extends BaseAdapter{

	private Context ContextC;
	
	static int[] ImagesGroupC = { R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4, R.drawable.c5};

	public ControlImageC(Context c) {
		this.ContextC = c;
	}
	
		
	public float getScale(boolean focused, int offset) {
		return Math.max(0, 1.0f / (float) Math.pow(2, Math.abs(offset)));
	}

	public long getItemIdC(int position) {
		return 0;
	}

	public static int[] getImagesC() {
		return ImagesGroupC;
	}
	
	@Override
	public int getCount() {
		return this.ImagesGroupC.length;
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
		ImageView img = new ImageView(this.ContextC);
		img.setImageResource(this.ImagesGroupC[position]);
		img.setScaleType(ImageView.ScaleType.FIT_XY);
		img.setLayoutParams(new Gallery.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT));
		return img;
	}
}
