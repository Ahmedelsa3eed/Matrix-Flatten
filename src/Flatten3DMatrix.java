public class Flatten3DMatrix{

    private final int n;
    private final int m;
    private final int p;

    private Object[][][] matrix;
    private Object[] vector;

    public Flatten3DMatrix(Object[][][] matrix){
        this.matrix = matrix;
        this.n = matrix.length;
        this.m = matrix[0].length;
        this.p = matrix[0][0].length;
        int q = n * m * p;
        vector = new Object[q];
    }

    public void createVector(){
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                for (int k = 0; k < p; k++)
                    vector[convertIndexing(i,j,k)] = matrix[i][j][k];
    }

    public int convertIndexing(int i, int j, int k){
        return p * m * i + p * j + k;
    }

    public Object[] getVector(){
        return this.vector;
    }
}
