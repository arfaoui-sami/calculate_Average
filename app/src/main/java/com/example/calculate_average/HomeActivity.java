package com.example.calculate_average;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private EditText note1;
    private EditText note2;
    private EditText note3;
    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
note1=findViewById(R.id.note1);
        note2=findViewById(R.id.note2);
        note3=findViewById(R.id.note3);
        message=findViewById(R.id.message);

    }

    public void call(View v) {

        Float somme;
        Float moy;

        somme = Float.parseFloat(note1.getText().toString()) + Float.parseFloat(note2.getText().toString()) + Float.parseFloat(note3.getText().toString());
        moy = somme / 3;
        if (moy >=10) {
            Intent i= new Intent( HomeActivity.this, goodActivity.class);
         //   startActivity(new Intent(HomeActivity.this, homesActivity.class));
            i.putExtra("moy",moy);
            startActivity(i);

            } else{
            Intent i= new Intent( HomeActivity.this, sorry.class);
          //  startActivity(new Intent(HomeActivity.this, homesActivity.class));
            i.putExtra("moy",moy);
            startActivity(i);
        }
    }
}