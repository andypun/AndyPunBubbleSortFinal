package AndyPun;

import static AndyPun.SortUtils.isSorted;
import static AndyPun.SortUtils.swap;

public class BubbleSort {
    public static void bubbleSort(int[] Arr)
    {
        while (isSorted(Arr))
        {
            for (int i = 0; i < Arr.length -1 ; i++)
            {
                if (Arr[i] > Arr[i+ 1])
                {
                    swap(Arr, i+0,i + 1);
                }
            }
        }
    }


}
