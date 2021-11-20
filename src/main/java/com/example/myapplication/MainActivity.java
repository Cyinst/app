package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClick = findViewById(R.id.btn_click);
        //使用findViewById方法对控件进行获取
        //R.id.btn_click对应布局中添加的id属性

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //里面写点击后想要实现的效果
                Toast.makeText(MainActivity.this,
                        "按钮被点击", Toast.LENGTH_SHORT).show();
                //这里是弹出一个消息---"按钮被点击"
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_click:
                Toast.makeText(this,"按钮被点击",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

