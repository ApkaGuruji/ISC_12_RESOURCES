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

class SortNonBoundary
{
    int m;
    int mat[][];
    SortNonBoundary(int m)
    {
        this.m = m;
        mat = new int[m][m];
    }
    boolean isValid()
    {
        if(m>3 && m<10)
            return true;
        return false;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive elements: ");
        for(int i=0;i<m;i++)
            for(int j=0;j<m;j++)
                mat[i][j]=sc.nextInt();
                
    }
    void sort()
    {
        int size = (m-2)*(m-2);
        int arr[] = new int[size];
        int k=0;
        for(int i=1;i<m-1;i++)
        {
            for(int j=1;j<m-1;j++)
            {
                arr[k++] = mat[i][j];
            }
        }
        for(int i=1;i<size;i++)
        {
            for(int j=0;j<size-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =t;
                }
            }
        }
        k=0;
        for(int i=1;i<m-1;i++)
        {
            for(int j=1;j<m-1;j++)
            {
                mat[i][j]=arr[k++];
            }
        }
    }
    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
                System.out.print(mat[i][j] + "\t");
            System.out.println();
        }
    }
    void diagonals()
    {
        int s=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
                if(i==j || i+j==m-1)
                {
                    s+=mat[i][j];
                    System.out.print(mat[i][j] + "\t");
                }
                else
                    System.out.print("\t\t");
            System.out.println();
        }
        System.out.println("SUM OF THE DIAOGONAL ELEMENTS = "+s);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int m = sc.nextInt();
        SortNonBoundary ob = new SortNonBoundary(m);
        if(!ob.isValid())
            System.out.println("INVALID INPUT");
        else
        {
            ob.input();
            System.out.println("ORIGINAL MATRIX");
            ob.display();
            ob.sort();
            System.out.println("REARRANGED MATRIX");
            ob.display();
            System.out.println("DIAGONAL MATRIX");
            ob.diagonals();
        }
    }
}