package com.example.calculate_average;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class sorry extends AppCompatActivity {
    private TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorry);
        message=findViewById(R.id.message);
        float moy=getIntent().getFloatExtra("moy",(float)0.0);
        message.setText("So sorry! , you are failed to pass the next level , your moyenne is :"+moy);
    }
    public void home(View v){
        startActivity(new Intent(sorry.this,HomeActivity.class));
    }
    public  void  sms(View v){
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO,
                Uri.parse("sms:92855115"));
        smsIntent.putExtra("sms_body", message.getText().toString());
        startActivity(smsIntent);
    }
}