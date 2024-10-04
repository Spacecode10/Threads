public class MatrixMult
{
    public int[][] multi(int[][] a, int[][] b)
    {
        if(a[0].length != b.length)
        {
            return null;
        }
        else
        {
            int[][] ans = new int[a.length][b[0].length];
            for(int i = 0; i < ans.length; i++)
            {
                for(int j = 0; j < ans[0].length; j++)
                {
                    for(int k = 0; k < a[0].length; k++)
                    {
//                       ans[i][j] = a[i][k]*b[k][i] + ans[i][j];
                        ans[i][j] += a[i][k]*b[k][j];
                    }
                }
            }
            return ans;
        }

    }


    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};
        int[][] b = {{1,2},{3,4},{5,6}};
        MatrixMult m = new MatrixMult();
        int[][] ans = m.multi(a, b);
        for(int i = 0; i < ans.length; i++)
        {
            for(int j = 0; j < ans[0].length; j++)
            {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
