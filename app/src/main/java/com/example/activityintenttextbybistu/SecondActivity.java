package com.example.activityintenttextbybistu;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_second_layout);
        Button buttonSecond = (Button) findViewById(R.id.SecondButton);
        final EditText secondEditText = (EditText) findViewById(R.id.secondEdit);
        Intent intentMain=getIntent();
        String showEdit=intentMain.getStringExtra("First_date");
        secondEditText.setText(showEdit);
        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentReturn=new Intent();
                String outS=secondEditText.getText().toString();
                intentReturn.putExtra("data_return",outS);
                setResult(RESULT_OK,intentReturn);
                finish();

            }
        });
    }

}
