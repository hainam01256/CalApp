package com.example.hainam.calapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x,y,z;
    TextView KQ;
    EditText a,b;
    Button tong,hieu,tich,thuong,uscln,thoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(EditText)findViewById(R.id.soa);
        b=(EditText)findViewById(R.id.sob);
        KQ=(TextView)findViewById(R.id.kq);
        tong=(Button)findViewById(R.id.tong);
        hieu=(Button)findViewById(R.id.hieu);
        tich=(Button)findViewById(R.id.tich);
        thuong=(Button)findViewById(R.id.thuong);
        uscln=(Button)findViewById(R.id.uscln);
        thoat=(Button)findViewById(R.id.thoat);
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tong();
            }
        });
        hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hieu();
            }
        });
        tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tich();
            }
        });
        thuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thuong();
            }
        });
        uscln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                USCLN();
            }
        });
    }
    private void Tong(){
        x=Integer.parseInt(a.getText().toString());
        y=Integer.parseInt(b.getText().toString());
        z=x+y;
        KQ.setText(Integer.toString(z));
    }
    private void Hieu(){
        x=Integer.parseInt(a.getText().toString());
        y=Integer.parseInt(b.getText().toString());
        z=x-y;
        KQ.setText(Integer.toString(z));
    }
    private void Tich(){
        x=Integer.parseInt(a.getText().toString());
        y=Integer.parseInt(b.getText().toString());
        if (x!=0&&y!=0)
            z=x*y;
        KQ.setText(Integer.toString(z));
    }
    private void Thuong(){
        x=Integer.parseInt(a.getText().toString());
        y=Integer.parseInt(b.getText().toString());
        if (x!=0&&y!=0)
            z=x/y;
        KQ.setText(Integer.toString(z));
    }
    private void USCLN(){
        x=Integer.parseInt(a.getText().toString());
        y=Integer.parseInt(b.getText().toString());
        while (x!=y){
            if(x>y)
                x=x-y;
            else
                y=y-x;
        }
        KQ.setText(Integer.toString(x));
    }
}
