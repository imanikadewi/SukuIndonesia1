package com.dicoding.sukuindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Batak extends AppCompatActivity {
    Button balik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batak);
    }
    public void setUp(){
        balik =(Button)findViewById(R.id.balik);

    }
    public void balik(View view){
        Intent balik= new Intent(this,MainActivity.class);
        Batak.this.finish();
        startActivity(balik);}
}
