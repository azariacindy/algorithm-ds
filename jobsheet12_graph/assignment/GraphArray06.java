package assignment;

public class GraphArray06<T> {
    private final int vertices;
    private final int[][] twoD_array;
    private T[] vertexLabels;

    public GraphArray06(int v, T[] vertexLabels) {
        vertices = v;
        twoD_array = new int[vertices + 1][vertices + 1];
        this.vertexLabels = vertexLabels;
    }

    public int getVertexIndex(T vertex) {
        for (int i = 0; i < vertexLabels.length; i++) {
            if (vertexLabels[i].equals(vertex)) {
                return i + 1; // shift by 1 to match the adjacency matrix indexing
            }
        }
        return -1; // Vertex not found
    }

    public void makeEdge(T to, T from, int edge) {
        int toIndex = getVertexIndex(to);
        int fromIndex = getVertexIndex(from);

        if (toIndex == -1 || fromIndex == -1) {
            System.out.println("Vertex doesn't exist");
            return;
        }

        try {
            twoD_array[toIndex][fromIndex] = edge;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex doesn't exist");
        }
    }

    public int getEdge(T to, T from) {
        int toIndex = getVertexIndex(to);
        int fromIndex = getVertexIndex(from);

        if (toIndex == -1 || fromIndex == -1) {
            System.out.println("Vertex doesn't exist");
            return -1;
        }

        try {
            return twoD_array[toIndex][fromIndex];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex doesn't exist");
        }
        return -1;
    }
}
