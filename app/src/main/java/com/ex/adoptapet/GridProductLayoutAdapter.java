package com.ex.adoptapet;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ex.adoptapet.HorizontalProductScrollModel;
import com.ex.adoptapet.R;

import java.util.List;

public class GridProductLayoutAdapter extends BaseAdapter {

    List<HorizontalProductScrollModel> horizontalProductScrollModelList;

    public GridProductLayoutAdapter(List<HorizontalProductScrollModel> horizontalProductScrollModelList) {
        this.horizontalProductScrollModelList = horizontalProductScrollModelList;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView == null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_scroll_item_layout,null);
            view.setElevation(0);
            view.setBackgroundColor(Color.parseColor("#ffffff"));
            ImageView productImage = view.findViewById(R.id.h_s_pet_image);
            TextView productTitle = view.findViewById(R.id.h_s_pet_title);
            TextView productDiscription = view.findViewById(R.id.h_s_pet_discription);
            TextView productColor = view.findViewById(R.id.h_s_pet_color);

            productImage.setImageResource(horizontalProductScrollModelList.get(position).getPetImage());
            productTitle.setText(horizontalProductScrollModelList.get(position).getPetTitle());
            productDiscription.setText(horizontalProductScrollModelList.get(position).getPetDiscription());
            productColor.setText(horizontalProductScrollModelList.get(position).getPetColor());

        }else {
            view = convertView;
        }
        return view;
    }
}
