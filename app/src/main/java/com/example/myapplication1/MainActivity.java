package com.example.myapplication1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    CalendarView calendarView;
    EditText editText;
    public boolean edtText1 = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btnBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMonths();
            }
        });
    }

    public void showMonths (){
        Intent intent = new Intent(this, showMonths.class);
        startActivity(intent);

        calendarView = (CalendarView)findViewById(R.id.calendar);
        editText = (EditText) findViewById(R.id.edtTxtMultiline);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
            String note = String.valueOf(dayOfMonth + month + year);
            editText.setText(note);
            boolean edtText1 = true;

            }
        });
    }


    }