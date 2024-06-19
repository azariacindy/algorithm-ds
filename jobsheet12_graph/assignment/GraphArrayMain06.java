package assignment;
import java.util.Scanner;

public class GraphArrayMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices: ");
        int v = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter vertex names:");
        String[] vertexLabels = new String[v];
        for (int i = 0; i < v; i++) {
            vertexLabels[i] = sc.nextLine();
        }

        GraphArray06<String> graph = new GraphArray06<>(v, vertexLabels);

        System.out.println("Enter number of edges: ");
        int e = sc.nextInt();
        sc.nextLine();

        System.out.println("Insert edges: <to> <from>");
        for (int i = 0; i < e; i++) {
            String to = sc.nextLine();
            String from = sc.nextLine();
            graph.makeEdge(to, from, 1);
        }

        System.out.println("2D array as graph representation as follows: ");
        System.out.print("  ");
        for (int i = 1; i <= v; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= v; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= v; j++) {
                System.out.print(graph.getEdge(vertexLabels[i - 1], vertexLabels[j - 1]) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
