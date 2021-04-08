package com.example.mcikals_10118360;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    private int waktu_loading=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //menghilangkan ActionBar
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        // kalo mau ngilangin action bar bisa gini juga, bebas bisa pilih yang mana
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run () {
                //setelah loading maka akan langsung berpindah ke home activity
                Intent loginIntent =new Intent(SplashScreen.this, LoginActivity.class);

                startActivity(loginIntent);
                finish();
            }

        }, 3000);
//        final Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(new Intent(getApplicationContext(), login.class));
//                finish();
//            }
//        }, 3000L); //2000 L = 1 detik
    }
}

//08-04-2021, 10118360, Muhamad Cikal Sopyan, IF9
