package Searching;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("The array is ");
        printarray(arr);
        Arrays.sort(arr);
        System.out.println("The array after sorting: ");
        printarray(arr);
        System.out.println("Enter the element to search: ");
        int x=s.nextInt();
        System.out.print("Binary Search using Iteration. Element found at index ");
        System.out.print(bSearchIterative(arr,0,n-1,x)+"\n");
        System.out.print("Binary Search using Recursion. Element found at index ");
        System.out.print(bSearchRecursive(arr,0,n-1,x)+"\n");


    }
    static int bSearchIterative(int arr[], int low, int high, int x)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;

    }
    static int bSearchRecursive(int arr[],int low,int high,int x)
    {
        if(low>high)
            return -1;
        int mid=(low+high)/2;
        if(arr[mid]==x)
            return mid;
        else if(arr[mid]>x)
            return bSearchRecursive(arr,low,mid-1,x);
        else
            return bSearchRecursive(arr,mid+1,high,x);
    }
    static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
