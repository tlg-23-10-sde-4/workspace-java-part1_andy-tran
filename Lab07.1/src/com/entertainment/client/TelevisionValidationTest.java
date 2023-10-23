package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.setVolume(-1);
        tv.setBrand("qwe");
    }
}