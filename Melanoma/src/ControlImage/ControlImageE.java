package ControlImage;

import br.furb.melanoma.R;
import br.furb.melanoma.R.drawable;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ControlImageE extends BaseAdapter{

	private Context ContextE;
	
	private static int[] ImagesGroupE = { R.drawable.e1, R.drawable.e2, R.drawable.e3, R.drawable.e4, R.drawable.e5};
	

	public ControlImageE(Context c) {
		this.ContextE = c;
	}
	
		
	public float getScale(boolean focused, int offset) {
		return Math.max(0, 1.0f / (float) Math.pow(2, Math.abs(offset)));
	}

	public long getItemIdE(int position) {
		return 0;
	}

	public static int[] getImagesE() {
		return ImagesGroupE;
	}
	
	@Override
	public int getCount() {
		return this.ImagesGroupE.length;
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
		ImageView img = new ImageView(this.ContextE);
		img.setImageResource(this.ImagesGroupE[position]);
		img.setScaleType(ImageView.ScaleType.FIT_XY);
		img.setLayoutParams(new Gallery.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT));
		return img;
	}
}
