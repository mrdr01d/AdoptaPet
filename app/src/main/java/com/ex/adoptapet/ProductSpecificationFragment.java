package com.ex.adoptapet;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProductSpecificationFragment extends Fragment {


    public ProductSpecificationFragment() {
        // Required empty public constructor
    }

    private RecyclerView productSpecificationRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product_specification, container, false);

        productSpecificationRecyclerView = view.findViewById(R.id.product_specification_recyclerview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        productSpecificationRecyclerView.setLayoutManager(linearLayoutManager);

        List<ProductSpecificationModel> productSpecificationModelList = new ArrayList<>();
        productSpecificationModelList.add(new ProductSpecificationModel("Breed","Chihuahua"));
        productSpecificationModelList.add(new ProductSpecificationModel("Color","Red/Golden/Orange/Chestnut"));
        productSpecificationModelList.add(new ProductSpecificationModel("Age","3 Yrs"));
        productSpecificationModelList.add(new ProductSpecificationModel("Size","(when grown) Small 25 lbs (11 kg) or less"));
        productSpecificationModelList.add(new ProductSpecificationModel("Weight","5kg"));
        productSpecificationModelList.add(new ProductSpecificationModel("Sex","Male"));
        productSpecificationModelList.add(new ProductSpecificationModel("Pet ID","2463463"));
        productSpecificationModelList.add(new ProductSpecificationModel("House-trained","Yes"));
        productSpecificationModelList.add(new ProductSpecificationModel("Vaccinated","Yes"));

        ProductSpecificationAdapter productSpecificationAdapter = new ProductSpecificationAdapter(productSpecificationModelList);
        productSpecificationRecyclerView.setAdapter(productSpecificationAdapter);
        productSpecificationAdapter.notifyDataSetChanged();

        return view;
    }

}
