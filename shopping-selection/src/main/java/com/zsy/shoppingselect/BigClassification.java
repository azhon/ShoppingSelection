package com.zsy.shoppingselect;


import java.util.List;

/*
 * 项目名:    shopping-selection
 * 包名       com.zsy.shoppingselect
 * 文件名:    Data
 * 创建者:    ZSY
 * 创建时间:  2017/5/5 on 16:02
 * 描述:     TODO 商品属性的实体类格式
 */

public class BigClassification {
    //大分类
    private String title;
    public List<SmallClassification> list;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SmallClassification> getList() {
        return list;
    }

    public void setList(List<SmallClassification> list) {
        this.list = list;
    }

    //小分类
    public static class SmallClassification {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
