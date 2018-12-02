package com.dicoding.sukuindonesia;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button asmat, bali, batak, bugis, dayak, jawa, keluar;
//    Intent getData;
//    String str_user;
//    TextView user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUp();
//        getData=getIntent();
//        str_user=getData.getStringExtra("username");
//       user.setText("Hallo" + str_user);
    }
    public void setUp(){
        asmat =(Button)findViewById(R.id.asmat);
        keluar =(Button)findViewById(R.id.exit);
        bali =(Button)findViewById(R.id.bali);
        batak =(Button)findViewById(R.id.batak);
        bugis =(Button)findViewById(R.id.bugis);
        dayak =(Button)findViewById(R.id.dayak);
        jawa =(Button)findViewById(R.id.jawa);
    }
    public void asmat (View view){
        Intent asmat = new Intent(this,Asmat.class);
        MainActivity.this.finish();
        startActivity(asmat);
    }
    public void exit(View view){
        MainActivity.this.finish();
    }
    public void bali (View view){
        Intent bali =new Intent(this,Bali.class);
        MainActivity.this.finish();
        startActivity(bali);
    }
    public void batak (View view){
        Intent batak =new Intent(this,Batak.class);
        MainActivity.this.finish();
        startActivity(batak);
    }
    public void bugis(View view){
        Intent bugis =new Intent(this,Bugis.class);
        MainActivity.this.finish();
        startActivity(bugis);
    }
    public void dayak(View view){
        Intent dayak =new Intent(this,Dayak.class);
        MainActivity.this.finish();
        startActivity(dayak);
    }
    public void jawa (View view){
        Intent jawa =new Intent(this,Jawa.class);
        MainActivity.this.finish();
        startActivity(jawa);
    }


}

