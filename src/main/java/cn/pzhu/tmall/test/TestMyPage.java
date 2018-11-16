package cn.pzhu.tmall.test;

import cn.pzhu.tmall.util.Page;

public class TestMyPage {
    public static void main(String[] args) {
        Page page = new Page();
        page.setTotal(41);
        page.setCount(6);
        page.setStart(2);
        System.out.println(page.isHasPreviouse()+"---"+page.isHasNext()+"---"+page.toString());

    }
}
