package com.azhong.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.zsy.shoppingselect.BigClassification;
import com.zsy.shoppingselect.OnSelectedListener;
import com.zsy.shoppingselect.ShoppingSelectView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnSelectedListener {

    String smallAttr1[] = {"XS", "S", "M", "L", "XL", "XXL", "XXXL"};
    String smallAttr2[] = {"白色", "黑色", "黄绿色", "藏青", "蝴蝶蓝"};
    private ShoppingSelectView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (ShoppingSelectView) findViewById(R.id.v);
        //设置监听需要在设置数据源之前
        view.setOnSelectedListener(this);
        initData();
    }

    private void initData() {
        List<BigClassification> bigList = new ArrayList<>();
        BigClassification big1 = new BigClassification();
        big1.setTitle("尺码");

        List<BigClassification.SmallClassification> smallList1 = new ArrayList<>();
        for (int i = 0; i < smallAttr1.length; i++) {
            BigClassification.SmallClassification small = new BigClassification.SmallClassification();
            small.setName(smallAttr1[i]);
            smallList1.add(small);
        }
        big1.setList(smallList1);


        BigClassification big2 = new BigClassification();
        big2.setTitle("颜色");

        List<BigClassification.SmallClassification> smallList2 = new ArrayList<>();
        for (int i = 0; i < smallAttr2.length; i++) {
            BigClassification.SmallClassification small = new BigClassification.SmallClassification();
            small.setName(smallAttr2[i]);
            smallList2.add(small);
        }
        big2.setList(smallList2);


        bigList.add(big1);
        bigList.add(big2);
        //最终数据
        view.setData(bigList);
    }

    @Override
    public void onSelected(String title, String smallTitle) {
        Toast.makeText(this, title + "--" + smallTitle, Toast.LENGTH_SHORT).show();
    }
}
