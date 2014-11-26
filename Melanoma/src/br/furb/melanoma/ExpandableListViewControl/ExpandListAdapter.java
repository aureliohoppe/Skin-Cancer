package br.furb.melanoma.ExpandableListViewControl;

import java.util.ArrayList;

import br.furb.melanoma.R;
import br.furb.melanoma.R.id;
import br.furb.melanoma.R.layout;
import br.furb.melanoma.ExListViewController;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ExpandListAdapter extends BaseExpandableListAdapter {

	private Context context;
	private ArrayList<Group> groups;
	ExListViewController selPics;

	public ExpandListAdapter(Context context, ArrayList<Group> groups) {
		this.context = context;
		this.groups = groups;
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		ArrayList<Child> chList = groups.get(groupPosition).getItems();
		return chList.get(childPosition);
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

		selPics = new ExListViewController();

		Child child = (Child) getChild(groupPosition, childPosition);
		if (convertView == null) {
			LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
			convertView = infalInflater.inflate(R.layout.listview_child_melanoma, null);
		}
		TextView tv = (TextView) convertView.findViewById(R.id.image_date);
		ImageView iv = (ImageView) convertView.findViewById(R.id.melanoma_photo);

		tv.setText(selPics.getArqDate(child.getName()));
		iv.setImageURI(Uri.fromFile(child.getImage()));

		return convertView;
	}
	
	public Bitmap getResizedBitmap(Bitmap bm, int newHeight, int newWidth) {
		int width = bm.getWidth();
		int height = bm.getHeight();
		float scaleWidth = ((float) newWidth) / width;
		float scaleHeight = ((float) newHeight) / height;
		
		// CREATE A MATRIX FOR THE MANIPULATION
		Matrix matrix = new Matrix();
		
		// RESIZE THE BIT MAP
		matrix.postScale(scaleWidth, scaleHeight);
		
		// RECREATE THE NEW BITMAP
		Bitmap resizedBitmap = Bitmap.createBitmap(bm, 0, 0, width, height, matrix, false);
		return resizedBitmap;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		ArrayList<Child> chList = groups.get(groupPosition).getItems();
		return chList.size();
	}

	@Override
	public Object getGroup(int groupPosition) {
		return groups.get(groupPosition);
	}

	@Override
	public int getGroupCount() {
		return groups.size();
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
		Group group = (Group) getGroup(groupPosition);
		if (convertView == null) {
			LayoutInflater inf = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
			convertView = inf.inflate(R.layout.listview_group_melanoma, null);
		}
		TextView tv = (TextView) convertView.findViewById(R.id.group_name);
		tv.setText(group.getName());
		return convertView;
	}

	@Override
	public boolean hasStableIds() {
		return true;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}

	public void notifyDataSetChanged() {
		// Refresh List rows
		super.notifyDataSetChanged();
	}

	@Override
	public boolean isEmpty() {
		return ((groups == null) || groups.isEmpty());
	}

	@Override
	public boolean areAllItemsEnabled() {
		return true;
	}

}
