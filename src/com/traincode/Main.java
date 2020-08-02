package com.traincode;

//import java.util.Arrays;
//import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addFirst(10);
        list.addFirst(50);
        list.addFirst(60);

        System.out.println(list.contains(600));

    }
}
