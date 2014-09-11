package br.furb.melanoma;

import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListViewAdapter {
	Context context;
	 
    public CustomListViewAdapter(Context context, int resourceId,
            List<RowListItem> items) {
        super();
        this.context = context;
    }
     
    /*private view holder class*/
    private class ViewHolder {
        ImageView imageView;
        /*TextView txtTitle;
        TextView txtDesc;*/
    }
     
   /* public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        RowItem rowItem = getItem(position);
         
        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
           
            * Apenas no caso de precisar inserir texto
            *  holder.txtDesc = (TextView) convertView.findViewById(R.id.desc);
            holder.txtTitle = (TextView) convertView.findViewById(R.id.title);
            holder.imageView = (ImageView) convertView.findViewById(R.id.icon);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();
                 
        holder.txtDesc.setText(rowItem.getDesc());
        holder.imageView.setImageResource(RowListItem.getImageId());
        holder.txtTitle.setText(rowItem.getTitle());
         
        return convertView;
    }*/
}
