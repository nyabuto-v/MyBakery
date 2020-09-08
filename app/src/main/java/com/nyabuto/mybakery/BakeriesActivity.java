package com.nyabuto.mybakery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BakeriesActivity extends AppCompatActivity {

    @BindView(R.id.locationTextView) TextView mLocationTextView;
    @BindView(R.id.listView) ListView mListView;
    private String[] bakeries = new String[] {"Bakers Inn", "MacDonald Place", "Java Cafe'", "Morning Chef", "Queen's Kitchen", "Today's Menu", "Mum's Cakes", "Finest Bakers", "Bakers Inn", "MacDonald Place", "Java Cafe'", "Morning Chef", "Queen's Kitchen", "Today's Menu", "Mum's Cakes", "Finest Bakers", "Bakers Inn", "MacDonald Place", "Java Cafe'", "Morning Chef", "Queen's Kitchen", "Today's Menu", "Mum's Cakes", "Finest Bakers" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakeries);

        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, bakeries);
        mListView.setAdapter(adapter);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here are all the bakeries near: " + location);
    }
}
