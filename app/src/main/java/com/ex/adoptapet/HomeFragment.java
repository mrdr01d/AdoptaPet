package com.ex.adoptapet;


import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    private RecyclerView categoryRecyclerView;
    private CategoryAdapter categoryAdapter;
    private RecyclerView testing;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        categoryRecyclerView = view.findViewById(R.id.category_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        categoryRecyclerView.setLayoutManager(layoutManager);

        List<CategoryModel> categoryModelList = new ArrayList<CategoryModel>();
        categoryModelList.add(new CategoryModel("link", "Home"));
        categoryModelList.add(new CategoryModel("link", "Dogs"));
        categoryModelList.add(new CategoryModel("link", "Cats"));
        categoryModelList.add(new CategoryModel("link", "Bunnies"));
        categoryModelList.add(new CategoryModel("link", "Birds"));
        categoryModelList.add(new CategoryModel("link", "Fishes"));
        categoryModelList.add(new CategoryModel("link", "Reptiles"));
        categoryModelList.add(new CategoryModel("link", "Farm Animals"));
        categoryModelList.add(new CategoryModel("link", "Others"));

        categoryAdapter = new CategoryAdapter(categoryModelList);
        categoryRecyclerView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();

        ////////////////Banner Slider

        List<SliderModel> sliderModelList = new ArrayList<SliderModel>();

        sliderModelList.add(new SliderModel(R.drawable.adopt_banner, "#ffffff"));
        sliderModelList.add(new SliderModel(R.drawable.donate_banner, "#ffffff"));
        sliderModelList.add(new SliderModel(R.drawable.foster_banner, "#ffffff"));

        sliderModelList.add(new SliderModel(R.drawable.adopt_banner2, "#ffffff"));
        sliderModelList.add(new SliderModel(R.drawable.adopt_banner, "#ffffff"));

        sliderModelList.add(new SliderModel(R.drawable.donate_banner, "#ffffff"));
        sliderModelList.add(new SliderModel(R.drawable.foster_banner, "#ffffff"));
        sliderModelList.add(new SliderModel(R.drawable.adopt_banner2, "#ffffff"));

        ////////////Banner Slider


        ///////////////Horizontal Product Layout

        List<HorizontalProductScrollModel> horizontalProductScrollModelList = new ArrayList<>();
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.foster_img, "Kitty", "Siamese Cat", "Mixed"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.foster_img1, "Bob", "Happy Dog", "Brown"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.foster_img2, "Daisy", "Sad Dog", "Mixed"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.foster_img3, "Shane", "Sidepose Dog", "Brown"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.foster_img4, "Billy", "Bigear Cat", "Pink"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.foster_img5, "Manny", "Nofur Cat", "Mixed"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.foster_img6, "Perry", "Bugs Bunny", "Light Brown"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.foster_img, "Kelly", "Siamese Cat", "Mixed"));

        ///////////////Horizontal Product Layout

        ///////////////////////////////////////////

        testing = view.findViewById(R.id.home_page_recyclerview);
        LinearLayoutManager testingLayoutManager = new LinearLayoutManager(getContext());
        testingLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        testing.setLayoutManager(testingLayoutManager);

        List<HomePageModel> homePageModelList = new ArrayList<>();
        homePageModelList.add(new HomePageModel(0, sliderModelList));
        homePageModelList.add(new HomePageModel(1, R.drawable.ad_banner1, "#ffffff"));
        homePageModelList.add(new HomePageModel(2, "New Commers!", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3, "New Commers!", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1, R.drawable.ad_banner2, "#ffffff"));
        homePageModelList.add(new HomePageModel(3, "New Commers!", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(2, "New Commers!", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1, R.drawable.ad_banner3, "#ffffff"));
        homePageModelList.add(new HomePageModel(0, sliderModelList));

        HomePageAdapter adapter = new HomePageAdapter(homePageModelList);
        testing.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        ///////////////////////////////////////////

        return view;
    }

}