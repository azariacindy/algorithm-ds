package practicum;
import java.util.Scanner;

public class GraphArray06 {
    private final int vertices;
    private final int [][] twoD_array;

    public GraphArray06(int v){
        vertices = v ;
        twoD_array = new int [vertices +1][vertices+1];
    }

    public void makeEdge(int to, int from, int edge){
    try
        {
            twoD_array[to][from] = edge;
        }
            catch (ArrayIndexOutOfBoundsException index)
        {
            System.out.println("Vertex doesn't exist");
        }
    }

    public int getEdge(int to, int from){
    try
        {
            return twoD_array[to][from];
        }
        catch (ArrayIndexOutOfBoundsException index)
        {
            System.out.println("Vertex doesn't exist");
        }
    return -1;
    }

    public static void main(String args[])
{
    int v, e, count = 1, to = 0, from = 0;
    Scanner sc = new Scanner(System.in);
    GraphArray06 graph;
    try
    {
        System.out.println("Enter number of vertices: ");
        v = sc.nextInt();
        System.out.println("Enter number of edges: ");
        e = sc.nextInt();

        graph = new GraphArray06(v);

        System.out.println("Insert edges: <to> <from>");
        while (count <= e)
        {
            to = sc.nextInt();
            from = sc.nextInt();

            graph.makeEdge(to, from, 1);
            count++;
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
                System.out.print(graph.getEdge(i, j) + " ");
            }
            System.out.println();
        }
    }
    catch (Exception E)
    {
        System.out.println("Error. Please check again! \n" + E.getMessage());
    }
    sc.close();
    }
}
