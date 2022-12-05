package exp_3;

import java.util.Scanner;
class BubbleSortExample
{
    public static void bubbleSort(int[] arr)
    {
        int n=arr.length,temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[],n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arr=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr); //sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
