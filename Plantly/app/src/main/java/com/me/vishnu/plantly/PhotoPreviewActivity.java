package com.me.vishnu.plantly;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;

public class PhotoPreviewActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_preview);
        imageView = findViewById(R.id.imagePreview);

        Intent intent = getIntent();
        String filepath = intent.getStringExtra(CameraActivity.EXTRA_IMAGE_PATH);

        Toast.makeText(PhotoPreviewActivity.this, filepath, Toast.LENGTH_LONG).show();

        imageView.setImageBitmap(BitmapFactory.decodeFile(filepath));
    }
}
