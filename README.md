### 一个商品规格选择View

### 效果图镇库

![这里写图片描述](http://img.blog.csdn.net/20170514201904724?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYV96aG9u/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

### 注意
```
ShoppingSelectView view = (ShoppingSelectView) findViewById(R.id.v);
//设置监听需要在设置数据之前
view.setOnSelectedListener(this);
view.setData(list);
```