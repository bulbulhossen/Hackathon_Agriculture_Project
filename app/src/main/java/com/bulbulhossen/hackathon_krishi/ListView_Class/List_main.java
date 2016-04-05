package com.bulbulhossen.hackathon_krishi.ListView_Class;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.bulbulhossen.hackathon_krishi.R;

public class List_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_home_layout);

        String[] str = getResources().getStringArray(R.array.shamsur_Kobita_listName);
        int image[] = {
                R.drawable.babyimage,
                R.drawable.babyimage,
                R.drawable.babyimage,
                R.drawable.babyimage,
                R.drawable.babyimage,
                R.drawable.babyimage,
                R.drawable.babyimage,
                R.drawable.babyimage,
                R.drawable.babyimage,
                R.drawable.babyimage,
                R.drawable.babyimage,
                R.drawable.babyimage,
                R.drawable.babyimage,
                R.drawable.babyimage,
                R.drawable.babyimage
        };


        ListView lv = (ListView) findViewById(R.id.shamsur_listview);

        final ListView_Adapter ad = new ListView_Adapter(this, str, image);
        lv.setAdapter(ad);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(List_main.this, "" + ad.getItem(position), Toast.LENGTH_SHORT).show();

            }
        });


    }


}