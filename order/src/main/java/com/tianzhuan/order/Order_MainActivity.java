package com.tianzhuan.order;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.tianzhuan.common.RecordPathManager;
import com.tianzhuan.common.utils.Cons;

public class Order_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order__main);
    }

    //跳转到app首页
    public void jumpApp(View view) {
        //类加载方式交互
//        try {
//            Class targetClass= Class.forName("com.tianzhuan.net_moduler.MainActivity");
//            Intent intent=new Intent(this, targetClass);
//            intent.putExtra("name","simon");
//            startActivity(intent);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        //全局map记录
        Class<?> targetClass = RecordPathManager.getTargetClass("app", "MainActivity");
        if(targetClass == null){
            Log.e(Cons.TAG,"获取targetClass为空");
        }
        Intent intent=new Intent(this, targetClass);
        intent.putExtra("name","simon");
        startActivity(intent);
    }
    //跳转到personal
    public void jumpPersonal(View view) {
//        try {
//            Class targetClass= Class.forName("com.tianzhuan.personal.Personal_MainActivity");
//            Intent intent=new Intent(this, targetClass);
//            intent.putExtra("name","simon");
//            startActivity(intent);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        Class<?> targetClass = RecordPathManager.getTargetClass("personal", "Personal_MainActivity");
        if(targetClass == null){
            Log.e(Cons.TAG,"获取targetClass为空");
        }
        Intent intent=new Intent(this, targetClass);
        intent.putExtra("name","simon");
        startActivity(intent);
    }
}
