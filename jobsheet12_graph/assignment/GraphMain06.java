package assignment;
import java.util.Scanner;

public class GraphMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices: ");
        int v = sc.nextInt();
        System.out.println("Is the graph directed (true/false): ");
        boolean isDirected = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Enter vertex names: ");
        String[] vertices = new String[v];
        for (int i = 0; i < v; i++) {
            vertices[i] = sc.nextLine();
        }

        Graph06<String> graph = new Graph06<>(vertices, isDirected);

        // Print the graph type
        if (isDirected) {
            System.out.println("The graph is directed.");
        } else {
            System.out.println("The graph is undirected.");
        }

        System.out.println("Enter number of edges: ");
        int e = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter source and destination: ");
        for (int i = 0; i < e; i++) {
            String source = sc.nextLine();
            String destination = sc.nextLine();
            int srcIndex = -1, destIndex = -1;
            for (int j = 0; j < v; j++) {
                if (vertices[j].equals(source)) {
                    srcIndex = j;
                }
                if (vertices[j].equals(destination)) {
                    destIndex = j;
                }
            }
            if (srcIndex != -1 && destIndex != -1) {
                try {
                    graph.addEdge(srcIndex, destIndex);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                System.out.println("Invalid vertex name");
            }
        }

        try {
            graph.printGraph();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("Enter a vertex to check degree: ");
        String vertex = sc.nextLine();
        int vertexIndex = -1;
        for (int j = 0; j < v; j++) {
            if (vertices[j].equals(vertex)) {
                vertexIndex = j;
            }
        }
        if (vertexIndex != -1) {
            try {
                graph.degree(vertexIndex);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("Invalid vertex name");
        }
        sc.close();
    }
}
