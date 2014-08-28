package br.furb.melanoma;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ControlImageB extends BaseAdapter{

	private Context ContextB;
	
	private static int[] ImagesGroupB = { R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5};

	public ControlImageB(Context c) {
		this.ContextB = c;
	}
	
		
	public float getScale(boolean focused, int offset) {
		return Math.max(0, 1.0f / (float) Math.pow(2, Math.abs(offset)));
	}

	public long getItemIdB(int position) {
		return 0;
	}

	public static int[] getImagesB() {
		return ImagesGroupB;
	}
	
	@Override
	public int getCount() {
		return this.ImagesGroupB.length;
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView img = new ImageView(this.ContextB);
		img.setImageResource(this.ImagesGroupB[position]);
		img.setScaleType(ImageView.ScaleType.FIT_XY);
		img.setLayoutParams(new Gallery.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT));
		return img;
	}
}
