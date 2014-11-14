package br.furb.melanoma;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class OnItemClickListenerListViewItem implements OnItemClickListener {

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {

		Context context = view.getContext();
		TextView textViewItem = ((TextView) view.findViewById(R.id.textViewItem));
		String listItemText = textViewItem.getText().toString();
		String listItemId = textViewItem.getTag().toString();

		//Toast.makeText(context,"Item: " + listItemText + ", Item ID: " + listItemId,Toast.LENGTH_SHORT).show();


	}

}
