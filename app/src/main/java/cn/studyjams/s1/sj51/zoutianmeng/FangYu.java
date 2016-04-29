package cn.studyjams.s1.sj51.zoutianmeng;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by tianmeng on 2016/4/28.
 */
public class FangYu extends Activity{
    private String[] data = {"加农炮(Cannon)","迫击炮(Mortar)","弓箭塔(Archer Tower)","防空火箭","法师塔","电磁塔","城墙","X弩X-Bow","炸弹、弹簧各类陷阱","地狱之塔"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fang_yu);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                FangYu.this,android.R.layout.simple_list_item_1,data
        );
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
