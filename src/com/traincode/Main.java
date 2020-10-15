package com.traincode;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        var graph = new WeightedGraph();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");

        graph.addEdge("A", "B", 0);
        graph.addEdge("B", "C", 2);
        graph.addEdge("A", "C", 10);

        System.out.println(graph.hasCycle());
    }

}
