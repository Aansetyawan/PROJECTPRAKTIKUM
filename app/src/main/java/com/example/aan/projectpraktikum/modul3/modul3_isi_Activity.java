package com.example.aan.projectpraktikum.modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.aan.projectpraktikum.R;

public class modul3_isi_Activity extends AppCompatActivity {

    private TextView view_nama, view_nim,view_jur, view_kota,view_tgl, view_hobi;
    String nama, nim, jur, kota, tglLahir, hobi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul3_isi_);


        view_nama = (TextView) findViewById(R.id.tV_nama);
        view_nim = (TextView) findViewById(R.id.tV_nim);
        view_jur = (TextView) findViewById(R.id.tV_jur);
        view_kota = (TextView) findViewById(R.id.tV_kota);
        view_tgl = (TextView) findViewById(R.id.tV_tanggal);
        view_hobi = (TextView) findViewById(R.id.tV_hobi);

        Intent intent = getIntent();

        nama = intent.getStringExtra("nama_key");
        nim = intent.getStringExtra("nim_key");
        jur = intent.getStringExtra("jur_key");
        kota = intent.getStringExtra("kota_key");
        tglLahir = intent.getStringExtra("tgllahir_key");
        hobi = intent.getStringExtra("hobi_key");

        view_nama.setText(nama);
        view_nim.setText(nim);
        view_jur.setText(jur);
        view_kota.setText(kota);
        view_tgl.setText(tglLahir);
        view_hobi.setText(hobi);
    }
}
