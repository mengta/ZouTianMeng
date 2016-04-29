package cn.studyjams.s1.sj51.zoutianmeng;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by tianmeng on 2016/4/28.
 */
public class FanKui extends Activity {
    TextView textView;
    Button button;
    RadioButton radioButton1, radioButton2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fan_kui);

        button = (Button) findViewById(R.id.fan_kui_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButton1 = (RadioButton) findViewById(R.id.yes);
                radioButton2 = (RadioButton) findViewById(R.id.no);
                if (radioButton1.isChecked() == true) {
                    Toast.makeText(FanKui.this, "感谢你的支持", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(FanKui.this, "我会继续努力的", Toast.LENGTH_SHORT).show();
                }
                textView = (TextView) findViewById(R.id.fan_kui_textview);
                String message = textView.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "send to zoutianmeng");
                intent.putExtra(Intent.EXTRA_TEXT, message);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

    }
}
