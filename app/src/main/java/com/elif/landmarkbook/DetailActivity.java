package com.elif.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.elif.landmarkbook.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    private ActivityDetailBinding binding;


    //TextView nametw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        
        Intent intent=getIntent();
        //R.id dediğimizde ne kadar id varsa tek tek eşlemeye çalışıyor, verimsiz
        //nametw=findViewById(R.id.nametw);
        //view binding yapcaz

        //Landmark selectedLandmark =(Landmark) intent.getSerializableExtra("landmark") ;

        Singleton singleton=Singleton.getInstance();
        Landmark selectedLandmark=singleton.getSentLandmark();
        binding.nametw.setText(selectedLandmark.name);
        binding.countrytw.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.img);


    }
}