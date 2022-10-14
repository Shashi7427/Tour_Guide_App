package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(@NonNull Context context, List<Item> items) {
        super(context, 0,items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Item item = getItem(position);

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        TextView description = (TextView) listItemView.findViewById(R.id.description);
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        title.setText(item.getTitle());
        description.setText(item.getDescription());
        image.setImageResource(item.getmImageResourceId());

        return listItemView;
    }
}

