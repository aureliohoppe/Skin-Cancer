package br.furb.melanoma.GalleryControl;

import br.furb.melanoma.R;
import br.furb.melanoma.R.drawable;
import android.app.ActionBar.LayoutParams;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ControlImageA extends BaseAdapter{

	private Context ContextA;
	
	private static int[] ImagesGroupA = { R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5};
                     
	public ControlImageA(Context c) {
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
		img.setLayoutParams(new Gallery.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT));
		return img;
	}
}
