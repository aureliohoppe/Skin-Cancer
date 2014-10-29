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

public class ControlImageD extends BaseAdapter{

	private Context ContextD;
	
	private static int[] ImagesGroupD = { R.drawable.d1, R.drawable.d2, R.drawable.d3, R.drawable.d4, R.drawable.d5};

	public ControlImageD(Context c) {
		this.ContextD = c;
	}
	
		
	public float getScale(boolean focused, int offset) {
		return Math.max(0, 1.0f / (float) Math.pow(2, Math.abs(offset)));
	}

	public long getItemIdD(int position) {
		return 0;
	}

	public static int[] getImagesD() {
		return ImagesGroupD;
	}
	
	@Override
	public int getCount() {
		return this.ImagesGroupD.length;
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
		ImageView img = new ImageView(this.ContextD);
		img.setImageResource(this.ImagesGroupD[position]);
		img.setScaleType(ImageView.ScaleType.FIT_XY);
		img.setLayoutParams(new Gallery.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT));
		return img;
	}
}
