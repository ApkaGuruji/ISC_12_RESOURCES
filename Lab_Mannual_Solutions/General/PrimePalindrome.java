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
class PrimePalindrome
{
    
    private int m,n;
    public PrimePalindrome()
    {
        m=n=0;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range (m,n): ");
        m = sc.nextInt();
        n = sc.nextInt();
    }
    public boolean isValid()
    {
        if(m<300 && n<3000)
            return true;
        else
            return false;
    }
    public void display()
    {
        int x,i,div,digit, rev,nf,npp=0;
        
        System.out.println("THE PRIME PALINDROME INTEGERS ARE: ");
        for(x=m;x<=n;x++)
        {
            nf=0;
            for(i=1;i<=x;i++)
            {
                if(x%i==0)
                    nf++;
            }
            
            rev=0;
            for(div=x;div>0;div/=10)
            {
                digit =div%10;
                rev = rev*10+digit;
            }
            
            if(nf==2 && rev == x)
            {
                if(npp>0)
                    System.out.print(",");
                System.out.print(x);
                npp++;
            }
        }
        System.out.print("\nFREQUENCY OF PRIME PALINDROME INTEGERS: "+ npp);
    }
    
    public static void main(String args[])
    {
        PrimePalindrome ob = new PrimePalindrome();
        ob.input();
        if(ob.isValid())
            ob.display();
        else
            System.out.println("OUT OF RANGE");
    }
}