import java.util.Random;
import java.util.Scanner;

public class SortingAlgorithms {

    public static void BubbleSort(int[] arr)
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void BubbleSortSC(int[] arr)
    {
        int current = 0;
        int next = 0;
        boolean swapped = false;
        boolean done = false;

        while(!done)
        {
            swapped = false;
            for(int i = 0; i < arr.length-1; i++)
            {
                if(arr[i]>arr[i+1])
                {
                    current = arr[i];
                    next = arr[i+1];
                    arr[i]=next;
                    arr[i+1]=current;
                    swapped = true;
                }
            }
            if(!swapped) done = true;
        }
    }

    public static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            int smallerNumber = arr[minIndex]; arr[minIndex] = arr[i];
            arr[i] = smallerNumber;
        }
    }


    public static void insertionSort(int arr[])
    {
        for (int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j=i-1;
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j=j-1;
            }
            arr[j + 1] = key;
        }
    }


    public static void main(String[] args) {
        long start, elapsed;

        //initialize variables
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Input length of array: ");
        int len = in.nextInt();

        int[] list = new int[len];


        //BubbleSort
        //Generate new random array for sorting
        for (int i = 0; i < list.length; i++)
        {
            list[i]=rand.nextInt(0,1001);
        }
        //begin sort
        start = System.currentTimeMillis();
        BubbleSort(list);
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("Bubble Sort: %d (ms.)\n",elapsed);

        //BubbleSortSC
        //Generate new random array for sorting
        for (int i = 0; i < list.length; i++)
        {
            list[i]=rand.nextInt(0,1001);
        }
        //begin sort
        start = System.currentTimeMillis();
        BubbleSortSC(list);
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("Bubble Sort (SC): %d (ms.)\n",elapsed);

        //SelectionSort
        //Generate new random array for sorting
        for (int i = 0; i < list.length; i++)
        {
            list[i]=rand.nextInt(0,1001);
        }
        //begin sort
        start = System.currentTimeMillis();
        selectionSort(list);
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("Selection Sort: %d (ms.)\n",elapsed);

        //InsertionSort
        //Generate new random array for sorting
        for (int i = 0; i < list.length; i++)
        {
            list[i]=rand.nextInt(0,1001);
        }
        //begin sort
        start = System.currentTimeMillis();
        insertionSort(list);
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("Insertion Sort: %d (ms.)\n",elapsed);

        in.close();
    }


}
