package com.laoniu;

public class Foo {
    public String hello(int end){
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<end;i++){
            stringBuilder.append("bar");
        }
        return stringBuilder.toString();
    }
}
