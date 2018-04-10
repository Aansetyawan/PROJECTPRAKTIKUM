package com.example.aan.projectpraktikum.modul2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;

import com.example.aan.projectpraktikum.R;

public class modul2_isi_Activity extends AppCompatActivity {
    //array utk autocomplatetextView
    String [] agama = {"Islam","Kristen","Hindu","Budha","Katolik","Konghucu"};
    //array utk MultiAutocomplatetextView
    String [] buahArray = {"Apel","Jeruk","Semangka","Melon","Durian","Mangga"};

    private ListView listView;
    private String [] buah = new String[] {"Apel","Jeruk","Semangka","Melon","Durian","Mangga"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul2_isi_);

        //mmbuat arrayAdapter dari string
        ArrayAdapter<String> Adapter =
                new ArrayAdapter<String>(modul2_isi_Activity.this,
                        android.R.layout.select_dialog_item,agama);


        //mendapat instansi dari autocomplatetextview
        AutoCompleteTextView AutoComplate = (AutoCompleteTextView) findViewById(R.id.autoComplateTextView);
        AutoComplate.setThreshold(1); //akan bekerja saat karakter pertama
        AutoComplate.setAdapter(Adapter); //mensetting data adapter ke dlm autocomplatetextview
        AutoComplate.setTextColor(Color.BLUE);


        //multiAuto
        //find
        MultiAutoCompleteTextView multiAuto = (MultiAutoCompleteTextView) findViewById(R.id.multiaoutocomplatetextview);
        //set
        multiAuto.setPadding(15,15,15,15);
        multiAuto.setTextColor(getResources().getColor(R.color.colorBlue));

        //create a new dataAdapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(modul2_isi_Activity.this,
                android.R.layout.simple_dropdown_item_1line,buahArray);
        multiAuto.setThreshold(1);
        multiAuto.setAdapter(arrayAdapter);
        multiAuto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());


        //ListView
        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(modul2_isi_Activity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, buah);
        listView.setAdapter(adapter1);

        //GridView
        GridView gridView = (GridView) findViewById(R.id.gridLayout);
        ArrayAdapter <String> adapter2 = new ArrayAdapter<String>(modul2_isi_Activity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, buah);
        gridView.setAdapter(adapter2);
    }
}


