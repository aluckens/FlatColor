package com.aluckens.flatcolor;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends ArrayAdapter<String> {
    List<com.aluckens.flatcolor.Color> col = new ArrayList<>();
    Context mContext;

    public MyAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        col = objects;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.my_item, null);
        TextView textView = convertView.findViewById(R.id.MyText);
        TextView textViewname = convertView.findViewById(R.id.name);
        LinearLayout myLayout = convertView.findViewById(R.id.mylayout);
        textView.setText(col.get(position).getCode());
        textViewname.setText(col.get(position).getName());
        myLayout.setBackgroundColor(Color.parseColor(col.get(position).getCode()));
        Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        convertView.startAnimation(animation);
        lastPosition = position;
        return convertView;

    }
}
