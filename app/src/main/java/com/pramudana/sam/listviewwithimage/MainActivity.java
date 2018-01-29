package com.pramudana.sam.listviewwithimage;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] dataName = {

            "Google Plus", "Twitter", "Windows", "Bing", "iTunes", "Wordpress", "Drupal"
    };
    int[] dataIcon = {

            R.drawable.google_plus, R.drawable.twitter_icon, R.drawable.windows_icon, R.drawable.bing_icon,
            R.drawable.itunes_icon, R.drawable.wordpress_icon, R.drawable.drupal_icon
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, dataName, dataIcon);
        list.setAdapter(myAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent a1 = new Intent(MainActivity.this, DetailActivity.class);
                a1.putExtra("Name", dataName[i]);
                a1.putExtra("Icon", dataIcon[i]);
                startActivity(a1);
            }
        });

    }
}
