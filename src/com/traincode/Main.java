package com.traincode;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Boolean rotation = StringUtils.areRotations("ABCD", "BCDA");

        System.out.println(rotation);
    }
}
