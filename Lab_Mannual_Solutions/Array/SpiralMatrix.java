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
class SpiralMatrix
{
    public static void main(String args[])
    {
        int n=5;
        int m[][] = new int[n][n];
        int i,j,k=1;
        if(n%2==1)
            m[n/2][n/2]=k++;
        for(i=n/2;i>=0;i--)
        {
            for(j=i+1;j<=n-1-i;j++)
                m[j][n-1-i]=k++;      
            for(j=n-2-i;j>=i;j--)
                m[n-1-i][j]=k++; 
            for(j=n-2-i;j>=i;j--)
                m[j][i]=k++;
            for(j=i+1;j<=n-1-i;j++)
                m[i][j]=k++;
        }
        System.out.println("The matrix is: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}