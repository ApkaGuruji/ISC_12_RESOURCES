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
class WondrousSquare
{
    int n;
    int mat[][];
    WondrousSquare(int n)
    {
        this.n = n;
        mat = new int[n][n];
    }
    boolean isValid()
    {
        if(n>=2 && n<=10)
            return true;
        return false;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                mat[i][j]=sc.nextInt();
                
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j] + "\t");
            System.out.println();
        }
    }
    boolean isPrime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
            if (n%i==0)
                c++;
        return c==2;
    }
    boolean isWondrous()
    {
        boolean allpresent = true;
        outerloop: for(int k=1;k<=n*n;k++)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(k == mat[i][j])
                    {
                        continue outerloop;
                    }
                }
            }
            allpresent = false;
            break;
        }
        
        if(!allpresent)
            return false;
        
        int s = n * (n*n + 1) / 2;
        boolean wondrous =true;
        for(int i=0;i<n;i++)
        {
            int sr = 0,sc = 0;
            for(int j=0;j<n;j++)
            {
                sr += mat[i][j];
                sc += mat[j][i];
            }
            if( s != sr || s != sc)
            {
                wondrous = false;
                break;
            }
        }
        return wondrous;
    }
    void printPrimes()
    {
        System.out.printf("%-20s%-20s%-20s\n","Prime","Row Index","Column Index");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isPrime(mat[i][j]))
                    System.out.printf("%-20d%-20d%-20d\n",mat[i][j],i,j);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int n = sc.nextInt();
        WondrousSquare ob = new WondrousSquare(n);
        if(!ob.isValid())
            System.out.println("OUT OF RANGE");
        else
        {
            ob.input();
            System.out.println("ORIGINAL MATRIX");
            ob.display();
            if(ob.isWondrous())
                System.out.println("Yes, it represents a wondrous square");
            else
                System.out.println("Not a wondrous square");
            ob.printPrimes();
        }
    }
}