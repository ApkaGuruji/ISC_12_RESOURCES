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
import java.util.StringTokenizer;
class StringArray
{
    int n;
    String arr[];
    StringArray(int n)
    {
        this.n = n;
        arr = new String[n];
    }
    boolean isValid()
    {
        if(n>1 && n<10)
            return true;
        return false;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings: ");
        for(int i=0;i<n;i++)
            arr[i]= sc.nextLine();
    }
    String moveAhead(String w)
    {
        String r = "";
        for(int i=0;i<w.length();i++)
        {
            char ch = w.charAt(i);
            ch+=2;
            if(ch>90)
                ch-=26;
            r += ch;
        }
        return r;
    }
    void encrypt()
    {
        for(int i=0;i<n;i++)
        {
            
            String result="";
            StringTokenizer st = new StringTokenizer(arr[i].substring(0,arr[i].length()-1));
            while(st.hasMoreTokens())
            {
                String word = st.nextToken();
                if(i%2==0)
                    result += moveAhead(word) + " ";
                else
                    result = word + " " + result;
            }
            arr[i] = result.substring(0,result.length()-1) + ".";
        }
    }
    void display()
    {
        System.out.println("After Encryption: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        int n = Integer.parseInt(sc.nextLine());
        StringArray ob = new StringArray(n);
        if(!ob.isValid())
            System.out.println("INVALID ENTRY");
        else
        {
            ob.input();
            ob.encrypt();
            ob.display();
        }
    }
}