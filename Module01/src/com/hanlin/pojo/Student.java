package com.hanlin.pojo;

import java.security.PrivateKey;
import java.util.ArrayList;

public class Student {

    private int id;
    private String ss;
    private int sss;



    private int sa;
    private int a;


    public static void main(String[] args) {


        System.out.println("你好，IDEA。。。。123466");
        ArrayList<String> sss = new ArrayList<>();
        sss.add("123");
        sss.add("452");
        sss.add("962");
        sss.add("as");
        //输出快捷键xxx.soutv
        System.out.println("sss = " + sss);
        //输出快捷键soutv
        System.out.println("sss = " + sss);


        //for增强（iter）
        for (String s : sss) {
            System.out.println("s = " + s);
        }
        //普通（itar）
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println("arg = " + arg);

        }
        //list.for
        for (String s : sss) {

        }
        //list.fori
        for (int i = 0; i < sss.size(); i++) {

        }
        //倒序输出list.forr
        for (int i = sss.size() - 1; i >= 0; i--) {

        }


    }

    public void tests() {


        ArrayList<String> ddd = new ArrayList<String>();
        //ifn
        if (ddd == null) {

        }
        //inn
        if (ddd != null) {

        }


    }


    /**
     * 1.执行run  alt+r
     * 2.提示补全（Class Name Completion） alt+/
     * 3.单行注释  ctrl+/
     *
     */


}

