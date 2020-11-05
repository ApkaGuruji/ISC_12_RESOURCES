/*
This Program was downloaded from this repository:
https://github.com/ApkaGuruji/ISC_12_RESOURCES
=========== Apka Guruji ==============
for more free coding resources for ICSE, ISC, CBSE Students
Visit us:
Website: ApkaGuruji.com
Youtube: https://www.youtube.com/ApkaGuruji
GitHub: https://github.com/ApkaGuruji
*/

import java.util.Scanner;

class PendulumSorting
{
    int n;
    int arr[];
    PendulumSorting()
    {
        
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Element "+(i+1)+": ");
            arr[i] =sc.nextInt();
        }
    }
    void sort()
    {
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        
        System.out.println("\nThe sorted array is: ");
        display();
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " " );
        }
    }
    void pendulum()
    {
        int mid = n/2;
        int arr2[] = new int[n];
        int k=0;
        arr2[mid] = arr[k++];
        for(int i=1;i<=mid;i++)
        {
            arr2[mid-i] = arr[k++];
            arr2[mid+i] = arr[k++];
        }
        arr = arr2;
        System.out.println("\nThe result is: ");
        display();
    }
    public static void main(String args[])
    {
        PendulumSorting ob = new PendulumSorting();
        ob.input();
        ob.sort();
        ob.pendulum();
    }
}