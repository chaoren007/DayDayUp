package com.zc;

public class Main {
    public static void main(String[] args) {
        int index = "sh_jh.zip.zip".lastIndexOf(".zip");
        System.out.println(index);
        System.out.println("sh_jh.zip.zip".substring(0,index));
    }
}
