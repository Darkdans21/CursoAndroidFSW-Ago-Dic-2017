package com.example.leonardopadilla.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        Button Atras = (Button) findViewById(R.id.btn_atras_segundo);
        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SegundoActivity.this, MainActivity.class);
                startActivity(i);

            }
        });

        Button Siguiente = (Button) findViewById(R.id.btn_siguiente_segundo);
        Siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SegundoActivity.this, TercerActivity.class);
                startActivity(i);

            }
        });

    }
}
