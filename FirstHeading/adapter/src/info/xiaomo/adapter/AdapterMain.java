package info.xiaomo.adapter;

import info.xiaomo.strategy.bean.base.Duck;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * author: xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/7/17 20:33
 * desc  : 把一只猫适配成鸭子
 * Copyright(©) 2017 by xiaomo.
 */
public class AdapterMain {
    public static void main(String[] args) {
        Duck duck = new DuckAdapter(new Cat());
        duck.display();
        duck.performQuack();
        duck.performFly();
    }


}
