package GRAPHS;

import java.util.*;

// ❗❗❗❗KAHN's ALGORITHM

class TOPOLOGICALsort {

  // 👉👉👉TOPOLOGICAL sort
  public static void calculatIndeg(ArrayList<Edge>[] graph, int indeg[]) {
    for (int i = 0; i < graph.length; i++) {
      int vertex = i;
      for (int j = 0; j < graph[vertex].size(); j++) {
        Edge e = graph[vertex].get(j);
        indeg[e.dest]++;
      }
    }
  }

  public static void topology(ArrayList<Edge>[] graph) {
    Queue<Integer> q = new LinkedList<>();
    int indeg[] = new int[graph.length];
    calculatIndeg(graph, indeg);
    for (int i = 0; i < graph.length; i++) {
      if (indeg[i] == 0) {
        q.add(i);
      }
    }

    // bfs search
    while (!q.isEmpty()) {
      int curr = q.remove();
      System.out.print(curr + " ");
      for (int i = 0; i < graph[curr].size(); i++) {
        Edge e = graph[curr].get(i);
        indeg[e.dest]--;
        if (indeg[e.dest] == 0) {
          q.add(e.dest);
        }
      }
    }
  }

  public static class Edge {

    int wt, src, dest; //src =startting vertex des=neigbouring vertex

    Edge(int wt, int src, int dest) {
      this.wt = wt;
      this.src = src;
      this.dest = dest;
    }
  }

  //  👉👉 finding the path
  public static boolean findPath(
    ArrayList<Edge>[] graph,
    int src,
    int dest,
    boolean visited[]
  ) {
    if (src == dest) {
      return true;
    }
    visited[src] = true;

    for (int i = 0; i < graph[src].size(); i++) {
      Edge e = graph[src].get(i);
      if (!visited[e.dest] && findPath(graph, e.dest, dest, visited)) {
        return true;
      }
    }
    return false;
  }

  public static void createGraph(ArrayList<Edge>[] edges, int V) {
    for (int i = 0; i < V; i++) {
      edges[i] = new ArrayList<>();
    }
    // adding the first vertes
    edges[2].add(new Edge(5, 2, 3));
    edges[3].add(new Edge(5, 3, 1));
    edges[4].add(new Edge(5, 4, 0));
    edges[4].add(new Edge(5, 4, 1));
    edges[5].add(new Edge(5, 5, 0));
    edges[5].add(new Edge(5, 5, 2));
  }

  public static void main(String[] args) {
    // here we are using the array list of array to store the edges data
    int V = 6; //v=no of vertex

    ArrayList<Edge>[] edges = new ArrayList[V]; //here the array list is null
    // to initilise the array list
    boolean visited[] = new boolean[edges.length];
    createGraph(edges, V);

    System.out.print(findPath(edges, 0, 50, visited));

    System.out.println("TOPOLOGY SORT : ");
    topology(edges);
  }
}
