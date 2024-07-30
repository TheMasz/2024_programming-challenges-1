package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex3 {
    List<Edge> graph;
    int start, end;

    public Ex3(List<Edge> graph, int start, int end) {
        this.graph = graph;
        this.start = start;
        this.end = end;
    }

    public int dijkstra() {
        int numNodes = graph.size();

        boolean visited[] = new boolean[numNodes + 1];
        int dist[] = new int[numNodes + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        List<List<Edge>> adjList = new ArrayList<>(numNodes + 1);
        for (int i = 0; i <= numNodes; i++) {
            adjList.add(new ArrayList<>());
        }
        for (Edge edge : graph) {
            adjList.get(edge.from).add(edge);
        }

        System.out.println(adjList);

        for (int i = 1; i <= numNodes; i++) {
            int currentNode = -1;
            int smallestDist = Integer.MAX_VALUE;
            for (int j = 1; j <= numNodes; j++) {
                if (!visited[j] && dist[j] < smallestDist) {
                    currentNode = j;
                    smallestDist = dist[j];
                }
            }

            if (currentNode == -1)
                break;

            visited[currentNode] = true;

            for (Edge edge : adjList.get(currentNode)) {
                if (!visited[edge.to] && dist[currentNode] + edge.weight < dist[edge.to]) {
                    dist[edge.to] = dist[currentNode] + edge.weight;
                }
            }

        }

        return dist[end] == Integer.MAX_VALUE ? -1 : dist[end];
    }

    @Override
    public String toString() {
        return "distance: " + dijkstra();
    }

}

