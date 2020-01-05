package com.example.ankett.anketodevi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
  TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1=findViewById(R.id.yassonuc);
        t2=findViewById(R.id.cinsiyetsonuc);
        t3=findViewById(R.id.sporsonuc);
        t4=findViewById(R.id.suresonuc);
        try {
            String m1 = Veritasima.yas(), m2 = Veritasima.cins(), m3 = Veritasima.sporsayi(), m4 = Veritasima.sure();
            t1.setText(m1);
            t2.setText(m2);
            t3.setText(m3);
            t4.setText(m4);
        }
        catch (Exception e){


        }
    }
}
