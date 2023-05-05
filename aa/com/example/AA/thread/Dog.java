package com.example.AA;

import java.util.stream.IntStream;

public class Dog implements Runnable
{
    Object object=new Object();
    public void run(){synchronized(object){IntStream.range(0,10).forEach(v->System.out.println(Thread.currentThread().getName()+v));}}
}