package cn.studyjams.s1.sj51.zoutianmeng;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tianmeng on 2016/4/28.
 */
public class FaShuAdapter extends ArrayAdapter<FaShuItem>{
    private int resourceId;
    public FaShuAdapter(Context context, int textViewResourceId, List<FaShuItem> objects) {
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        FaShuItem fanshuitem = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        ImageView fanshuImage = (ImageView) view.findViewById(R.id.fashu_item);
        TextView fanshuName = (TextView) view.findViewById(R.id.fashu_name);
        fanshuImage.setImageResource(fanshuitem.getImageId());
        fanshuName.setText(fanshuitem.getName());
        return view;
    }
}
