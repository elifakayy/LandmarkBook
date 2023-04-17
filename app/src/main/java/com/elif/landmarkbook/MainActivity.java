package com.elif.landmarkbook;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.elif.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<Landmark>landmarkArraylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //String eyfel="Eiffel";
        //String london = "London Eye";
        // ArrayList olabilirdi ama sadece ismini tutmayacağız bir çok şey tutacağız, kullanışlı değil
        //oop - sınıf kullanacağız, model olarak tanımla

        landmarkArraylist =new ArrayList<>();
        Landmark eyfel =new Landmark("Eyfel","France",R.drawable.eyfel);
        Landmark collesium =new Landmark("Collesioum","Italy",R.drawable.collesium);
        Landmark brandenburg = new Landmark("Brandenburg","Germany",R.drawable.brandenburg);
        Landmark londoneye=new Landmark("London Eye", "London",R.drawable.londoneye);

        landmarkArraylist.add(eyfel);
        landmarkArraylist.add(collesium);
        landmarkArraylist.add(brandenburg);
        landmarkArraylist.add(londoneye);


        binding.recyclerview.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkadapter =new LandmarkAdapter(landmarkArraylist);
        binding.recyclerview.setAdapter(landmarkadapter);

    }
}