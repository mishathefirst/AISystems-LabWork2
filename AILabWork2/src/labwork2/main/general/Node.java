package labwork2.main.general;

import java.util.HashMap;

public class Node {

    private String name;
    private HashMap<Node, Integer> connections = new HashMap<>();
    private boolean closed;

    public void setConnections(HashMap<Node, Integer> connections) {
        this.connections = connections;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HashMap<Node, Integer> getConnections() {
        return connections;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public boolean isClosed() {
        return this.closed;
    }

    public Node(String name, HashMap<Node, Integer> connections) {
        this.name = name;
        this.connections = connections;
    }

    public Node() {}
}
