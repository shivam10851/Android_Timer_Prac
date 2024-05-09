package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        final Handler handler = new Handler();
//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//                num++;
//                Toast.makeText(MainActivity.this, "tick tick " + num, Toast.LENGTH_SHORT).show();
//                handler.postDelayed(this, 1000);
//            }
//        };
//        handler.post(run);
          new CountDownTimer(10000,1000){
              @Override
              public void onTick(long millisUntilFinished){
                  Log.d("1sec","tick tick");
              }

              @Override
              public void onFinish() {
                  Log.d("1sec","finish");
              }
          }.start();
    }
}