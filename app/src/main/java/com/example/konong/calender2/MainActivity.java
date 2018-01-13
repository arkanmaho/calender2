package com.example.konong.calender2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton button1,button2,button3;
    LinearLayout layout1,layout2;
    DBHelper dbku;
    public String date,start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbku=new DBHelper(this);
        final TextView ttl=(TextView) findViewById(R.id.total);
        CalendarView cv=(CalendarView)findViewById(R.id.callll);
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
        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                date=+year+"-"+(month+1)+"-"+dayOfMonth;
               // ttl.setText(date);
            }
        });
    }

    public void repeat(View view) {
        Intent intent=new Intent(MainActivity.this, berulang.class);
        intent.putExtra("tanggal",date);
        startActivity(intent);
    }

    public void langsung(View view) {
        Intent intent=new Intent(MainActivity.this, langsung.class);
        intent.putExtra("tanggal",date);
        startActivity(intent);
    }
}
