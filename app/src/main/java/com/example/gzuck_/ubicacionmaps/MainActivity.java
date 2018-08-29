package com.example.gzuck_.ubicacionmaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button ubicame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ubicame=(Button)findViewById(R.id.ubicame);

        ubicame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten=new Intent(MainActivity.this,MapsActivity.class);
                startActivity(inten);
            }
        });
    }
}