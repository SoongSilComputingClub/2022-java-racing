package org.sscc.study.racing;

public class Random implements RandomUtil{
    @Override
    public boolean getValue() {
        return (Math.random()*10) >= 4;
    }
}