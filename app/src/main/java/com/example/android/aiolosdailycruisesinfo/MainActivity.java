package com.example.android.aiolosdailycruisesinfo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button Gotourl = (Button) findViewById(R.id.Gotourl);
        Gotourl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://aioloscruises.com/"));
                startActivity(myWebLink);
            }
        });
    }




}
