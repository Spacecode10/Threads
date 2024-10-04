import java.lang.reflect.Array;
import java.util.Arrays;

public class IterativeSmoothing {
    public double[] function(int n, int a, int b, int size)
    {
        double[] arr = new double[size];
        arr[0] = a;
        arr[size-1] = b;
        double[] oldArr = Arrays.copyOf(arr,arr.length);
        double[] newArr = Arrays.copyOf(arr,arr.length);
        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j < size-1; j++)
            {
                newArr[j] = (oldArr[j-1] + oldArr[j+1])/2.0;
                System.out.println(Arrays.toString(newArr));
            }
            oldArr = Arrays.copyOf(newArr,newArr.length);

        }
        return oldArr;
    }
    public static void main(String[] args) {
        IterativeSmoothing i = new IterativeSmoothing();
        double[] ans = i.function(100, 0, 4, 5);
        System.out.println(Arrays.toString(ans));
    }

}
