package cn.studyjams.s1.sj51.zoutianmeng;

/**
 * Created by tianmeng on 2016/4/28.
 */
public class FaShuItem {


    private String name;
    private int imageId;
    public FaShuItem(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }
    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
