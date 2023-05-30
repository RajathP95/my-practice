import java.util.*;

class Edge{
    int src,dest;
    public Edge(int src,int dest){
        this.src=src;
        this.dest=dest;
    }
}

class Graph{
    List<List<Integer>> adjList = null;

    public Graph(List<Edge> edges, int n){
        adjList = new ArrayList<>();

        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(Edge e: edges){
            int src = e.src;
            int dest = e.dest;
            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
    }
}

public class BFSClass {
    public static void BFS(Graph graph, int v, boolean[] discovered){
        Queue<Integer> que = new ArrayDeque<Integer>();

        discovered[v]=true;
        que.add(v);
        while(!que.isEmpty()){
            v = que.poll();
            System.out.print(v+" ");
            for(int u:graph.adjList.get(v)){
                if(!discovered[u]){
                    discovered[u]=true;
                    que.add(u);
                }
            }

        }
    }

    public static void DFS(Graph g, int v, boolean[] discoverable){
        discoverable[v]=true;
        System.out.print(v+" ");
        for(int u:g.adjList.get(v)){
            if(!discoverable[u]){
//                discoverable[u]=true;
                DFS(g,u,discoverable);
            }
        }
    }

    public static void main(String[] args){
        List<Edge> edges = Arrays.asList(
                new Edge(1, 2), new Edge(1, 3), new Edge(1, 4), new Edge(2, 5),
                new Edge(2, 6), new Edge(5, 9), new Edge(5, 10), new Edge(4, 7),
                new Edge(4, 8), new Edge(7, 11), new Edge(7, 12)
                // vertex 0, 13, and 14 are single nodes
        );
        int n=15;

        Graph g = new Graph(edges,n);
//        boolean[] discovered = new boolean[n];
//        for(int i=0;i<n;i++){
//            if(discovered[i]==false){
//                BFS(g,i,discovered);
//            }
//        }

        boolean[] discoverable = new boolean[n];
        for(int i=0;i<n;i++){
            if(discoverable[i]==false){
                DFS(g,i,discoverable);
            }
        }


    }
}
