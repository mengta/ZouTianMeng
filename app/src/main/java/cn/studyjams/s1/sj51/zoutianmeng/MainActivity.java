package cn.studyjams.s1.sj51.zoutianmeng;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.bing_zhong);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BingZhong.class);
                startActivity(intent);
            }
        });
        Button button2 = (Button) findViewById(R.id.fa_shu);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FaShu.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button) findViewById(R.id.fan_kui);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FanKui.class);
                startActivity(intent);
            }
        });
        Button button4 = (Button) findViewById(R.id.fang_yu);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FangYu.class);
                startActivity(intent);
            }
        });
        Button button5= (Button) findViewById(R.id.gong_nue);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GongNue.class);
                startActivity(intent);
            }
        });
        Button button6 = (Button) findViewById(R.id.zhen_xing);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ZhenXing.class);
                startActivity(intent);
            }
        });
    }
}
