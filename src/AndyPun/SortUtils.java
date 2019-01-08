package AndyPun;

public class SortUtils {
    public static void swap(int[]Arr, int i, int j)
    {
        int temp = Arr[i];
        Arr[i] = Arr[j];
        Arr[j] = temp;
    }

    public static boolean isSorted(int[] Arr)
    {
        for (int x=0; x <Arr.length -1 ; x++)
        {
            if (Arr[x] > Arr[x+1])
            {
                return true;
            }
        }
        return false;
    }

    public static int checkSum(int[] before, int[] after)
    {
        for(int i=0;i<before.length;i++)
        {

        }
    }
}
