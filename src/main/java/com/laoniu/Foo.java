package com.laoniu;

public class Foo {
    public String hello(int end){
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<end;i++){
            if(stringBuilder!=null){
                stringBuilder.append("bar");
            }
        }
        return "bar";
    }
}
