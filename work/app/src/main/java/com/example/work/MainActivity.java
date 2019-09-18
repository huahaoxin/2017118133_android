package com.example.work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化方法
        initUI( );
    }

    private void initUI() {
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent( );
        switch (view.getId( )){
            case R.id.btn1:
                //跳转第一个界面

                intent.setClass(getApplicationContext( ),FirstActivity.class);

                break;
            case R.id.btn2:
                //跳转第二个界面
                intent.setClass(getApplicationContext( ),SecondActivity.class);
                break;
        }
        startActivity(intent);
    }
}
