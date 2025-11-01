import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public final class Graph {
    private final ArrayList<Node> nodes = new ArrayList<>();
    private final ArrayList<Edge> edges = new ArrayList<>();
    private final Map<String, String> attributes = new HashMap<>();
    
    public Graph() { }

    public Graph(Map<String, String> attributes) {
        this.attributes.putAll(attributes);
    }

    public Collection<Node> getNodes() {
        return nodes;
    }

    public Collection<Edge> getEdges() {
        return edges;
    }

    public Graph node(String name) {
        nodes.add(new Node(name));
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        nodes.add(new Node(name, attributes));
        return this;
    }

    public Graph edge(String start, String end) {
        edges.add(new Edge(start, end));
        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        edges.add(new Edge(start, end, attributes));
        return this;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }
}
