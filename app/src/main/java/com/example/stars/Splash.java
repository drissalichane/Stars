package com.example.stars;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Objects;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        LottieAnimationView lottieAnimationView = findViewById(R.id.lottieView);
        lottieAnimationView.setAnimation(R.raw.staranim); // Use your JSON file name
        lottieAnimationView.playAnimation(); // Start animation
        // lottieAnimationView.setRepeatCount(1); // Play only once

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(Splash.this, ListActivity.class);
            startActivity(intent);
            finish();
        }, 3000); // 3 seconds delay

    }
}