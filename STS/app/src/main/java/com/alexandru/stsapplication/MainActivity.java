package com.alexandru.stsapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }







    public void openSisc_Site(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sisc.ro"));
        startActivity(i);

    }
    public void openSts_Site(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sts.sisc.ro"));
        startActivity(i);

    }
   // public void open
}


