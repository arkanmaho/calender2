package com.example.konong.calender2;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton button1,button2,button3;
    LinearLayout layout1,layout2;
    DBHelper dbku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbku=new DBHelper(this);
        button1=(FloatingActionButton) findViewById(R.id.but1);
        button2=(FloatingActionButton) findViewById(R.id.ulang);
        button3=(FloatingActionButton) findViewById(R.id.ulang1);
        layout1=(LinearLayout) findViewById(R.id.lay1);
        layout2=(LinearLayout) findViewById(R.id.lay2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(layout1.getVisibility()==View.VISIBLE && layout2.getVisibility()==View.VISIBLE) {
                    layout1.setVisibility(View.GONE);
                    layout2.setVisibility(View.GONE);
                }
                else{
                    layout1.setVisibility(View.VISIBLE);
                    layout2.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
