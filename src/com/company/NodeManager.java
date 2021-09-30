package com.company;

import com.company.Commons.Node;

import java.util.List;
import java.util.Map;

public interface NodeManager {
    String listAllNodes();
    String listNodeData(String name);
    // for testing purpose. You may implement this with an empty method
    String listNodeMeta(String name);
    void addNode(String name);
    void addNode(String name, Long hashValue);
    void removeNode(String name);
    void unplugNode(String name);
    void loadBalancing(String name);
}
