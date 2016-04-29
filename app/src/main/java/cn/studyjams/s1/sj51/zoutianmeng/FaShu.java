package cn.studyjams.s1.sj51.zoutianmeng;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tianmeng on 2016/4/28.
 */
public class FaShu extends Activity {
    private List<FaShuItem> fanshuLists = new ArrayList<FaShuItem>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fa_shu);
        initFanshu();
        FaShuAdapter adapter = new FaShuAdapter(FaShu.this,R.layout.fashu_item,fanshuLists);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
    private void initFanshu() {
        FaShuItem leidian = new FaShuItem("雷电法术",R.drawable.leidian_pic);
        fanshuLists.add(leidian);
        FaShuItem liaoshang = new FaShuItem("疗伤法术",R.drawable.liaoshang_pic);
        fanshuLists.add(liaoshang);
        FaShuItem kuangbao = new FaShuItem("狂暴法术",R.drawable.kuangbao_pic);
        fanshuLists.add(kuangbao);
        FaShuItem tantiao = new FaShuItem("弹跳法术",R.drawable.tantiao_pic);
        fanshuLists.add(tantiao);
        FaShuItem bingdong = new FaShuItem("冰冻法术",R.drawable.bingdong_pic);
        fanshuLists.add(bingdong);
        FaShuItem duyao = new FaShuItem("毒药法术",R.drawable.duyao_pic);
        fanshuLists.add(duyao);
        FaShuItem dizheng = new FaShuItem("地震法术",R.drawable.dizheng_pic);
        fanshuLists.add(dizheng);
        FaShuItem jiashu = new FaShuItem("加速法术",R.drawable.jiashu_pic);
        fanshuLists.add(jiashu);
    }
}
