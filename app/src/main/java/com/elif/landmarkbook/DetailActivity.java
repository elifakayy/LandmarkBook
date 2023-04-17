package com.elif.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.elif.landmarkbook.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    private ActivityDetailBinding binding;

    TextView nametw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //R.id dediğimizde ne kadar id varsa tek tek eşlemeye çalışıyor, verimsiz
        //nametw=findViewById(R.id.nametw);
        //view binding yapcaz




    }
}