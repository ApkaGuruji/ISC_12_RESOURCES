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
class MaxMinPosition
{
    int m,n;
    int mat[][];
    MaxMinPosition(int m, int n)
    {
        this.m = m;
        this.n = n;
        mat = new int[m][n];
    }
    boolean isValid()
    {
        if(m>2 && m<20 && n>2 && n<20)
            return true;
        return false;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                mat[i][j]=sc.nextInt();
                
    }
    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j] + "\t");
            System.out.println();
        }
    }
    void findMaxMin()
    {
        int maxi, maxj, mini, minj;
        maxi=maxj=mini=minj=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]>mat[maxi][maxj])
                {
                    maxi=i;
                    maxj=j;
                }
                else if(mat[i][j]<mat[mini][minj])
                {
                    mini=i;
                    minj=j;
                }
            }
        }
        System.out.println("Largest Number: " + mat[maxi][maxj]);
        System.out.println("Row : " + maxi);
        System.out.println("Column: " + maxj);
        System.out.println("Smallest Number: " + mat[mini][minj]);
        System.out.println("Row : "+ mini);
        System.out.println("Column: " + minj);
    }
        void sort()
    {
        int size = m*n;
        int arr[] = new int[size];
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
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
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=arr[k++];
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        MaxMinPosition ob = new MaxMinPosition(m,n);
        if(!ob.isValid())
            System.out.println("SIZE OUT OF MATRIX");
        else
        {
            ob.input();
            System.out.println("ORIGINAL MATRIX");
            ob.display();
            ob.findMaxMin();
            ob.sort();
            ob.display();
            
        }
    }
}