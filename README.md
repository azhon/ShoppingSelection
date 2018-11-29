### 一个商品规格选择View

### 效果图镇库

<img src="https://github.com/azhon/ShoppingSelection/blob/master/effectImage/20170514201904724.gif" width="350"/>

### 博客地址：http://blog.csdn.net/a_zhon/article/details/72061028

### 使用方法：将整个项目克隆下来运行即可
```
ShoppingSelectView view = (ShoppingSelectView) findViewById(R.id.v);

//设置监听需要在设置数据之前

view.setOnSelectedListener(this);
view.setData(list);
```