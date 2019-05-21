package com.ex.adoptapet;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import io.grpc.internal.SharedResourceHolder;

public class HorizontalPetScrollAdapter extends RecyclerView.Adapter<HorizontalPetScrollAdapter.ViewHolder> {


    private List<HorizontalProductScrollModel> horizontalProductScrollModelList;

    public HorizontalPetScrollAdapter(List<HorizontalProductScrollModel> horizontalProductScrollModelList) {
        this.horizontalProductScrollModelList = horizontalProductScrollModelList;
    }

    @NonNull
    @Override
    public HorizontalPetScrollAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.horizontal_scroll_item_layout, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalPetScrollAdapter.ViewHolder viewHolder, int position) {
        int resource = horizontalProductScrollModelList.get(position).getPetImage();
        String title = horizontalProductScrollModelList.get(position).getPetTitle();
        String discription = horizontalProductScrollModelList.get(position).getPetDiscription();
        String color = horizontalProductScrollModelList.get(position).getPetColor();

        viewHolder.setPetImage(resource);
        viewHolder.setPetTitle(title);
        viewHolder.setPetDiscription(discription);
        viewHolder.setPetColor(color);
    }

    @Override
    public int getItemCount() {
        if (horizontalProductScrollModelList.size() > 8) {
            return 8;
        } else {
            return horizontalProductScrollModelList.size();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView petImage;
        private TextView petTitle;
        private TextView petDiscription;
        private TextView petColor;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            petImage = itemView.findViewById(R.id.h_s_pet_image);
            petTitle = itemView.findViewById(R.id.h_s_pet_title);
            petDiscription = itemView.findViewById(R.id.h_s_pet_discription);
            petColor = itemView.findViewById(R.id.h_s_pet_color);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent petDetailsIntent = new Intent(itemView.getContext(),ProductDetailsActivity.class);
                    itemView.getContext().startActivity(petDetailsIntent);
                }
            });
        }

        private void setPetImage(int resource) {
            petImage.setImageResource(resource);
        }

        private void setPetTitle(String title) {
            petTitle.setText(title);
        }

        private void setPetDiscription(String discription) {
            petDiscription.setText(discription);
        }

        private void setPetColor(String color) {
            petColor.setText(color);
        }
    }
}
