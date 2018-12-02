package com.dicoding.sukuindonesia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Asmat extends AppCompatActivity {
    Button balik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmat);
    }
    public void setUp(){
        balik =(Button)findViewById(R.id.balik);

    }
    public void balik(View view){
        Intent balik= new Intent(this,MainActivity.class);
        Asmat.this.finish();
        startActivity(balik);}
}
