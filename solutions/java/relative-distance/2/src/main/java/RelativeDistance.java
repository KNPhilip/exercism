import java.util.*;

public final class RelativeDistance {
    private final Map<String, List<String>> graph = new HashMap<>();
    
    public RelativeDistance(Map<String, List<String>> familyTree) {
        familyTree.forEach((parent, children) -> {
            graph.putIfAbsent(parent, new ArrayList<>());
            for (String child : children) {
                graph.putIfAbsent(child, new ArrayList<>());
                graph.get(parent).add(child);
                graph.get(child).add(parent);
            }
        });
        
        familyTree.forEach((parent, children) -> {
            if (children.size() > 1)
                for (int i = 0; i < children.size(); i++)
                    for (int j = i + 1; j < children.size(); j++) {
                        String child1 = children.get(i);
                        String child2 = children.get(j);
                        graph.get(child1).add(child2);
                        graph.get(child2).add(child1);
                    }
        });
    }
    
    public int degreeOfSeparation(String personA, String personB) {
        Queue<String> queue = new LinkedList<>() {};
        Map<String, Integer> distances = new HashMap<>();
        queue.add(personA);
        distances.put(personA, 0);
        
        while (!queue.isEmpty()) {
            String current = queue.poll();
            int currentDistance = distances.get(current) + 1;
            
            for (String relative : graph.get(current)) {
                if (relative.equals(personB))
                    return currentDistance;
                
                if (!distances.containsKey(relative)) {
                    distances.put(relative, currentDistance);
                    queue.add(relative);
                }
            }
        }
        return -1;
    }
}
