package com.tianzhuan.net_moduler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tianzhuan.order.Order_MainActivity;
import com.tianzhuan.personal.Personal_MainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpOrder(View view) {
        Intent intent=new Intent(this, Order_MainActivity.class);
        intent.putExtra("name","simon");
        startActivity(intent);
    }

    public void jumpPersonal(View view) {
        Intent intent=new Intent(this, Personal_MainActivity.class);
        intent.putExtra("name","simon");
        startActivity(intent);
    }
}
