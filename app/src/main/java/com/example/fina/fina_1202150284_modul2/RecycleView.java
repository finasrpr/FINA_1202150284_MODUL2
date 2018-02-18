package com.example.fina.fina_1202150284_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecycleView extends AppCompatActivity {

    public class ContentMenu extends AppCompatActivity {
        private List<menu> menuList = new ArrayList<>();
        private RecyclerView recyclerView;
        private MenuAdapter mAdapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_recycle_view);

            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

            mAdapter = new MenuAdapter(this, menuList);
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(mAdapter);
            prepareMovieData();

        }

        private void prepareMovieData() {
            menu menu = new menu(R.drawable.banananutella, "Banana Nuttela", "Rp. 15.000", R.string.banananutella);
            menuList.add(menu);

            menu = new menu(R.drawable.candy, "Ice Cream Candy", "Rp. 15.000", R.string.candy);
            menuList.add(menu);
            menu = new menu(R.drawable.chocogreen, "Choco Green", "Rp. 20.000", R.string.chocogreen);
            menuList.add(menu);
            menu = new menu(R.drawable.cone, "Ice Cream Cone", "Rp. 12.000", R.string.cone);
            menuList.add(menu);
            menu = new menu(R.drawable.ftutarian, "Frutarian Ice Cream", "Rp. 18.000", R.string.frutarian);
            menuList.add(menu);
            menu = new menu(R.drawable.rainbow, "Rainbow Cone", "Rp. 18.000", R.string.rainbow);
            menuList.add(menu);





            // mAdapter.notifyDataSetChanged();
        }
    }}
