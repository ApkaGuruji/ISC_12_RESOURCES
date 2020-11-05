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
class SymmetricMatrix
{
    int m;
    int mat[][];
    SymmetricMatrix(int m)
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
        System.out.println("Enter the elements: ");
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
    void process()
    {
        int sld = 0, srd = 0;
        boolean symmetry = true;
        for(int i=0;i<m;i++)
        {
            sld += mat[i][i];
            srd += mat[i][m-1-i];
            for(int j=0;j<=i;j++)
            {
                if(mat[i][j]!=mat[j][i])
                {
                    symmetry = false;
                }
            }
        }
        if(symmetry)
            System.out.println("THE GIVEN MATRIX IS SYMMETRIC");
        else
            System.out.println("THE GIVEN MATRIX IS NOT SYMMETRIC");
        System.out.println("The sum of left diagonal = " + sld);
        System.out.println("the sum of right diagonal = " + srd);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int m = sc.nextInt();
        SymmetricMatrix ob = new SymmetricMatrix(m);
        if(!ob.isValid())
            System.out.println("OUT OF RANGE");
        else
        {
            ob.input();
            System.out.println("ORIGINAL MATRIX");
            ob.display();
            ob.process();
        }
    }
}