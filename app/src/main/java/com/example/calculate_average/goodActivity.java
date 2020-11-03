package com.example.calculate_average;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class goodActivity extends AppCompatActivity {
    private TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homes);
        message=findViewById(R.id.message);
        float moy=getIntent().getFloatExtra("moy",(float)0.0);
        message.setText("congratulation , you are passed  the next level , your moyenne is :"+moy);
    }
    public void home(View v){
        startActivity(new Intent(goodActivity.this,HomeActivity.class));
    }
    public  void  sms(View v){
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO,
                Uri.parse("sms:92855115"));
        smsIntent.putExtra("sms_body",message.getText().toString() );
        startActivity(smsIntent);
    }
}