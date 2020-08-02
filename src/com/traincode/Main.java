package com.traincode;

//import java.util.Arrays;
//import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(20);
        System.out.println(list.size());

        list.addLast(30);
        System.out.println(list.size());

        list.addLast(40);
        System.out.println(list.size());

        list.removeLast();

        System.out.println(list.contains(600));

    }
}
