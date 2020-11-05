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
import java.util.*;
class ISBN
{
    String num;
    int sum;
    public ISBN()
    {
        num="";
        sum=0;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ISBN number: ");
        num = sc.next();
    }
    public boolean isValid()
    {
        int l;
        l = num.length();
        return l == 10;
    }
    public void compute()
    {
        int i,m=10,ld;
        for(i=0;i<9;i++)
        {
            sum += (num.charAt(i)-48)*m;
            m--;
        }
        
        ld = num.charAt(9);
        if(ld == 'X')
            ld = 10;
        else
            ld = ld - 48;
        
        sum += ld;
    }
    public void display()
    {
        System.out.println("SUM=" + sum);
        if(sum%11 == 0)
            System.out.println("LEAVES NO REMAINDER - VALID ISBN CODE");
        else
            System.out.println("LEAVES REMAINDER - INVALID ISBN CODE");
    }
    public static void main(String args[])
    {
        ISBN ob = new ISBN();
        ob.input();
        if(ob.isValid())
        {
            ob.compute();
            ob.display();
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
}