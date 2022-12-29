package org.life4what.image4carousel.sample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.life4what.image4carousel.sample.databinding.ActivityJavaBinding;

public class JavaActivity extends AppCompatActivity {

    private ActivityJavaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityJavaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
