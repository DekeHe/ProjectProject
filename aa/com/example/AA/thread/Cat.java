package com.example.AA.thread;

import java.util.stream.IntStream;

public class Cat implements Runnable
{
    public void run(){IntStream.range(0,10).forEach(v->System.out.println(Thread.currentThread().getName()+v));}
}