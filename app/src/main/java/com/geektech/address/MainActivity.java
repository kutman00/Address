package com.geektech.address;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.view);
        ArrayList<String> address = new ArrayList<>();
        address.add("Жибек-жолу");
        address.add("Жибек-жолу");
        address.add("Жибек-жолу");
        address.add("Жибек-жолу");
        address.add("Жибек-жолу");
        address.add("Жибек-жолу");
        address.add("Жибек-жолу");
        address.add("Жибек-жолу");
        address.add("Жибек-жолу");
        address.add("Жибек-жолу");
        address.add("Жибек-жолу");
        AddressAdapter adapter = new AddressAdapter(address);
        recyclerView.setAdapter(adapter);
    }
}