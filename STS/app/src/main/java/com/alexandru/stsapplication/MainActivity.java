package com.alexandru.stsapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button openSiSC;
    private Button openSTS;
    private Button openAbout;
    private Button openProgram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openSiSC= (Button) findViewById(R.id.btn_to_SiSC_site);
        openSTS=(Button) findViewById(R.id.btn_to_STS_site);
        openAbout=(Button) findViewById(R.id.btn_despre);
        openProgram=(Button) findViewById(R.id.btn_program);
        openSiSC.setOnClickListener(handler);
        openSTS.setOnClickListener(handler);
        openAbout.setOnClickListener(handler);
        openProgram.setOnClickListener(handler);
    }
    View.OnClickListener handler = new View.OnClickListener() {

        Intent intent=null;
        @Override
        public void onClick(View v) {
            switch(v.getId())
            {
                case R.id.btn_despre:
                    intent=new Intent(getBaseContext(), AboutActivity.class);

                    break;
                case R.id.btn_program:

                    break;
                case R.id.btn_to_SiSC_site:
                    intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sisc.ro"));

                    break;
                case R.id.btn_to_STS_site:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sts.sisc.ro"));
                    break;
            }
            startActivity(intent);

        }
    };










/*
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
    public void openDe  spreActivity(View view)
    {
        Intent i = new Intent(getBaseContext(), AboutActivity.class);
        startActivity(i);

    }*/
   // public void open
}


