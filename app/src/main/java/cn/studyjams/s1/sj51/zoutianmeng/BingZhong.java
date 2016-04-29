package cn.studyjams.s1.sj51.zoutianmeng;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by tianmeng on 2016/4/28.
 */
public class BingZhong extends Activity {
    private String[] data = {"野蛮人","弓箭手","哥布林","巨人Giant","炸弹人Wall Breaker"
    ,"气球兵","法师","天使","飞龙","皮卡","野蛮人之王","弓箭女王","小恶魔Minion","野猪骑士"
    ,"瓦尔基里","石头人","女巫","熔岩猎犬"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bing_zhong);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                BingZhong.this,android.R.layout.simple_list_item_1,data
        );
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
