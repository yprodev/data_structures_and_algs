package com.traincode;

//import java.util.Arrays;
//import java.util.LinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.reverse();
        int[] array = list.toArray();
        System.out.println(Arrays.toString(array));

    }
}
