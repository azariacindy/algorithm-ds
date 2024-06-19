package practicum;

public class Graph06 {
    int vertex;
    DoubleLinkedList06 list[];

    public Graph06(int vertex){
        this.vertex =vertex;
        list = new DoubleLinkedList06[vertex];
        for (int i = 0; i < vertex; i++){
            list[i] = new DoubleLinkedList06();
        }
    }

    public void addEdge(int source, int destinasion){
        // add edge
        list[source].addFirst(destinasion);

        // add back edge (for undirected)
        list[destinasion].addFirst(source);
    }
    
    public void degree (int source) throws Exception{
        // degree undirected graph
        System.out.println("degree vertex "+source +" : "+list[source].size());

        //degree directed graph
            //inDegree
        int k, totalin = 0, totalout = 0;
        for (int i = 0; i <vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if(list[i].get(j)==source)
                    ++totalin;
            }
        }
            //outDegree
        for (k = 0; k < list [source].size(); k++) {
            list [source].get(k);
        }

        totalout = k;
        System.out.println("Indegree from vertex "+ source +" : "+totalin);
        System.out.println("Outdegree from vertex "+ source +" : "+totalout);
        System.out.println("degree vertex "+source +" : "+(totalin+totalout));
    }  

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }

    public void removeAllEdges () {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph successfully emptied");
    }

    public void printGraph() throws Exception{
        for (int i = 0; i <vertex; i++) {
            if(list[i].size()>0) {
                System.out.print("Vertex " + i + " connected with: ");
                for (int j = 0; j < list[i].size(); j++) {
                System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
        
    public static void main(String[] args) throws Exception {
        Graph06 graph = new Graph06(6);
        graph.addEdge (0, 1);
        graph.addEdge (0,4);
        graph.addEdge (1, 2);
        graph.addEdge (1, 3);
        graph.addEdge (1, 4);
        graph.addEdge (2, 3);
        graph.addEdge (3, 4);
        graph.addEdge (3,0);
        graph.printGraph();
        graph.degree (2);
        
        System.out.println(" ");
        graph.removeEdge(1,2);
        graph.printGraph();
     }
}
