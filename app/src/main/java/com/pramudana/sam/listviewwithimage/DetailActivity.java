package com.pramudana.sam.listviewwithimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mImageView = (ImageView)findViewById(R.id.imageView2);
        Bundle mBundle = getIntent().getExtras();

        if (mBundle != null){

            mImageView.setImageResource(mBundle.getInt("Icon"));
        }
    }
}
