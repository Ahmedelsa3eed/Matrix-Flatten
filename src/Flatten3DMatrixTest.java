import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Flatten3DMatrixTest {

    Integer[][][] matrix = {
            {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            },{
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            },{
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            }
    };

    private final Flatten3DMatrix flatten3DMatrix =
            new Flatten3DMatrix(matrix);

    @Test
    void createVector() {
        flatten3DMatrix.createVector();
        Object[] v = flatten3DMatrix.getVector();
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                for (int k = 0; k < matrix[0][0].length; k++)
                    assertEquals(matrix[i][j][k], v[flatten3DMatrix.convertIndexing(i,j,k)]);
    }
}