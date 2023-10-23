package com.immortals.ds.graph;

import java.util.ArrayList;
import java.util.List;

class GraphNode {
    int value;
    List<GraphNode> neighbors;

    public GraphNode(int value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }
}
