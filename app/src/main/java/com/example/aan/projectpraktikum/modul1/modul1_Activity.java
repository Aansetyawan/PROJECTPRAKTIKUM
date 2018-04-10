package com.example.aan.projectpraktikum.modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.aan.projectpraktikum.R;

public class modul1_Activity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul1_);
        button = (Button) findViewById(R.id.btn_pdmodul1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(modul1_Activity.this, modul1_isi_Activity.class);
                Toast.makeText(modul1_Activity.this, "Hallo Nama Saya AAN S (140411100034)", Toast.LENGTH_SHORT).show();

                startActivity(intent);

            }
        });
    }
}
