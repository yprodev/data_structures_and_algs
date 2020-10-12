package com.traincode;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        var graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");

//        graph.removeEdge("A", "C");
//        graph.removeNode("B");
//        graph.removeNode("A");
//        graph.addEdge("B", "C");

        graph.print();
    }
}
