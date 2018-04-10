package com.example.aan.projectpraktikum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aan.projectpraktikum.modul1.modul1_Activity;
import com.example.aan.projectpraktikum.modul2.modul2_Activity;
import com.example.aan.projectpraktikum.modul3.modul3_Activity;

public class MainActivity extends AppCompatActivity {
    Button buttonModul1, buttonModul2, buttonModul3, buttonModul4,
            buttonModul5, buttonModul6, buttonModul7, buttonModul8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonModul1 = (Button) findViewById(R.id.btnmodul1);


        //Method utk klik tombol modul 1
        buttonModul1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //perintah setelah kejadian klik
                Intent intent = new Intent(MainActivity.this, modul1_Activity.class)
                        ;
                startActivity(intent);
            }
        });

        buttonModul2 = (Button) findViewById(R.id.btnmodul2);


        //Method utk klik tombol modul 1
        buttonModul2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //perintah setelah kejadian klik
                Intent intent = new Intent(MainActivity.this, modul2_Activity.class);
                startActivity(intent);
            }
        });

        buttonModul3 = (Button) findViewById(R.id.btnmodul3);


        //Method utk klik tombol modul 1
        buttonModul3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //perintah setelah kejadian klik
                Intent intent = new Intent(MainActivity.this, modul3_Activity.class);
                startActivity(intent);
            }
        });
    }
}
