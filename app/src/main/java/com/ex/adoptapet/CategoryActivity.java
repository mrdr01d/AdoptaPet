package com.ex.adoptapet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    private RecyclerView categoryRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String title = getIntent().getStringExtra("categoryName");
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        categoryRecyclerView = findViewById(R.id.category_recyclerview);

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

        LinearLayoutManager testingLayoutManager = new LinearLayoutManager(this);
        testingLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        categoryRecyclerView.setLayoutManager(testingLayoutManager);

        List<HomePageModel> homePageModelList = new ArrayList<>();
        homePageModelList.add(new HomePageModel(0, sliderModelList));
        homePageModelList.add(new HomePageModel(1, R.drawable.ad_banner1, "#ffffff"));
        homePageModelList.add(new HomePageModel(2, "New Commers!", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3, "New Commers!", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1, R.drawable.ad_banner2, "#ffffff"));
        homePageModelList.add(new HomePageModel(3, "New Commers!", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(2, "New Commers!", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1, R.drawable.ad_banner3, "#ffffff"));

        HomePageAdapter adapter = new HomePageAdapter(homePageModelList);
        categoryRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        ///////////////////////////////////////////

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_icon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.main_search_icon) {
            //todo:search code
            return true;
        }else if(id == android.R.id.home){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
