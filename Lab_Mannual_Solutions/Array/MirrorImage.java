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
class MirrorImage
{
    int m;
    int mat[][];
    int image[][];
    MirrorImage(int m)
    {
        this.m = m;
        mat = new int[m][m];
        image = new int[m][m];
    }
    boolean isValid()
    {
        if(m>2 && m<20)
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
    void convert()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
                image[i][m-1-j]=mat[i][j];
        }
    }
    void displayMirrorImage()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
                System.out.print(image[i][j] + "\t");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int m = sc.nextInt();
        MirrorImage ob = new MirrorImage(m);
        if(!ob.isValid())
            System.out.println("SIZE OUT OF MATRIX");
        else
        {
            ob.input();
            System.out.println("ORIGINAL MATRIX");
            ob.display();
            ob.convert();
            System.out.println("Mirror Image Matrix: ");
            ob.displayMirrorImage();
        }
    }
}