package com.example.hoang.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HOANG on 2/20/2016.
 */
public class MyAdapter extends ArrayAdapter<String> {

    public MyAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.swipelistview_item, parent, false);
        TextView txt = (TextView) convertView.findViewById(R.id.txtText);
        TextView btnDelete = (TextView) convertView.findViewById(R.id.btnDelete);
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remove(getItem(position));
            }
        });
        txt.setText(getItem(position));
        return convertView;
    }
}
