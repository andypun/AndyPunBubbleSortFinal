package AndyPun;

public class BubbleSortRunner {

    public static void main(String[] args) {
	// write your code here
        int[] Arr= {8,6,7,5,3,0,9};
        System.out.print("Before: ");
        for (int num:Arr)
            System.out.print(num+" ");
        System.out.println();

        BubbleSort.bubbleSort(Arr);

        System.out.print("After: ");
        for (int num:Arr)
            System.out.print(num+" ");
        System.out.println();
    }
}
