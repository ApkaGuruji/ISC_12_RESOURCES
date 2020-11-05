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

class MatrixProduct
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        
        int i,j,k;
        System.out.println("Enter elements for first matrix: ");
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
                a[i][j] = sc.nextInt();
        System.out.println("Enter elements for second matrix: ");
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
                b[i][j] = sc.nextInt();
        int s;
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
            {
                s=0;
                for(k=0;k<3;k++)
                    s+=a[i][k] * b[k][j];
                c[i][j]=s;
            }
        
        System.out.println("The product of two matrices is: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
                System.out.print(c[i][j]+ "\t");
            System.out.println();
        }
    }
}