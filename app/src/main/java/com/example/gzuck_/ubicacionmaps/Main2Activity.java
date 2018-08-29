package com.example.gzuck_.ubicacionmaps;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {


    private static final int CAMERA_REQUEST_CODE =1000;
    ImageView captura;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        captura= (ImageView) findViewById(R.id.captura);
        captura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencamara();
            }
        });

    }
    private void opencamara(){
        Intent cameraIntent =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent,CAMERA_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CAMERA_REQUEST_CODE) {
            Bundle extras = data.getExtras();
            Bitmap bitmap = (Bitmap)extras.get("data");

            captura.setImageBitmap(bitmap);

        }
    }
}