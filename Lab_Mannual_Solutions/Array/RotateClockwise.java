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
class RotateClockwise
{
    int m;
    int mat[][];
    RotateClockwise(int m)
    {
        this.m = m;
        mat = new int[m][m];
    }
    boolean isValid()
    {
        if(m>2 && m<10)
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
    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
                System.out.print(mat[i][j] + "\t");
            System.out.println();
        }
    }
    void rotate()
    {
        for(int j=0;j<m;j++)
        {
            for(int i=m-1;i>=0;i--)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
    void sumOfCorners()
    {
        int s=mat[0][0] + mat[0][m-1]+mat[m-1][m-1]+mat[m-1][0];
        System.out.println("Sum of the corner elements = " + s);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int m = sc.nextInt();
        RotateClockwise ob = new RotateClockwise(m);
        if(!ob.isValid())
            System.out.println("OUT OF RANGE");
        else
        {
            ob.input();
            System.out.println("ORIGINAL MATRIX");
            ob.display();
            System.out.println("MATRIX AFTER ROTATION");
            ob.rotate();
            ob.sumOfCorners();
        }
    }
}