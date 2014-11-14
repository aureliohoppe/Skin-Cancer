package br.furb.melanoma.ExpandableListViewControl;

import java.util.ArrayList;

import br.furb.melanoma.R;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ArrayAdapterItem extends ArrayAdapter {

	Context mContext;
	int layoutResourceId;
	ArrayList<String>  data[] = null;

	public ArrayAdapterItem(Context mContext, int layoutResourceId,	ArrayList<String>[] data) {

		super(mContext, layoutResourceId, data);
		this.layoutResourceId = layoutResourceId;
		this.mContext = mContext;
		this.data = data;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		if (convertView == null) {
			// inflate the layout
			LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
			convertView = inflater.inflate(layoutResourceId, parent, false);
		}

		// get the TextView and then set the text (item name) and tag (item ID)
		// values
		TextView textViewItem = (TextView) convertView.findViewById(R.id.textViewItem);
		textViewItem.setText( (CharSequence) data[position]);
		

		return convertView;
	}
}
