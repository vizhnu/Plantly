package com.me.vishnu.plantly;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button takePictureButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        takePictureButton = findViewById(R.id.btn_takepicture);

    }

    public void takePicture(View view) {
        takePictureButton.setEnabled(false);
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);

        new CountDownTimer(1000, 500) {
            public void onFinish() {
                takePictureButton.setEnabled(true);
            }

            public void onTick(long millisUntilFinished) {
                // millisUntilFinished    The amount of time until finished.
            }
        }.start();

    }
}
