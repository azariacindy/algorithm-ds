package assignment;

public class Graph06<T> {
    T[] vertex;
    DoubleLinkedLists06[] list;
    boolean isDirected;

    public Graph06(T[] vertex, boolean isDirected) {
        this.vertex = vertex;
        this.isDirected = isDirected;
        list = new DoubleLinkedLists06[vertex.length];
        for (int i = 0; i < vertex.length; i++) {
            list[i] = new DoubleLinkedLists06();
        }
    }

    public void addEdge(int source, int destination) throws Exception {
        list[source].addFirst(destination);
        if (!isDirected) {
            list[destination].addFirst(source);
        }
    }

    public void degree(int source) throws Exception {
        System.out.println("Degree of vertex " + vertex[source] + " : " + list[source].size());

        int totalIn = 0, totalOut = list[source].size();
        for (int i = 0; i < vertex.length; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if ((int) list[i].get(j) == source) {
                    totalIn++;
                }
            }
        }

        System.out.println("Indegree of vertex " + vertex[source] + " : " + totalIn);
        System.out.println("Outdegree of vertex " + vertex[source] + " : " + totalOut);
        System.out.println("Total degree of vertex " + vertex[source] + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int source, int destination) throws Exception {
        list[source].remove(destination);
        if (!isDirected) {
            list[destination].remove(source);
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex.length; i++) {
            list[i].clear();
        }
        System.out.println("Graph successfully emptied!");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex.length; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + vertex[i] + " connected with: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(vertex[(int) list[i].get(j)] + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
}
