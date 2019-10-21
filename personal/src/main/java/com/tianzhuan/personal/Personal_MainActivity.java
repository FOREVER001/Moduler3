package com.tianzhuan.personal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.tianzhuan.common.RecordPathManager;
import com.tianzhuan.common.utils.Cons;

public class Personal_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal__main);
//        Intent intent=new Intent(this,Order_MainActivity.class);
    }


    //跳转到app首页
    public void jumpApp(View view) {
//        //类加载方式交互
//        try {
//            Class targetClass= Class.forName("com.tianzhuan.net_moduler.MainActivity");
//            Intent intent=new Intent(this, targetClass);
//            intent.putExtra("name","simon");
//            startActivity(intent);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        Class<?> targetClass = RecordPathManager.getTargetClass("app", "MainActivity");
        if(targetClass == null){
            Log.e(Cons.TAG,"获取targetClass为空");
        }
        Intent intent=new Intent(this, targetClass);
        intent.putExtra("name","simon");
        startActivity(intent);
    }
    //跳转到order
    public void jumpOrder(View view) {
        //类加载方式交互
//        try {
//            Class targetClass= Class.forName("com.tianzhuan.order.Order_MainActivity");
//            Intent intent=new Intent(this, targetClass);
//            intent.putExtra("name","simon");
//            startActivity(intent);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        Class<?> targetClass = RecordPathManager.getTargetClass("order", "Order_MainActivity");
        if(targetClass == null){
            Log.e(Cons.TAG,"获取targetClass为空");
        }
        Intent intent=new Intent(this, targetClass);
        intent.putExtra("name","simon");
        startActivity(intent);
    }
}
