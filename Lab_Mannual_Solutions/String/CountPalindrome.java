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

class CountPalindrome
{
    String s;
    CountPalindrome(String s)
    {
        this.s = s;
    }
    boolean isValid()
    {
        char ch = s.charAt(s.length()-1);
        if(ch=='.'||ch=='?'||ch=='!')
            return true;
        return false;
    }
    boolean isPalindrome(String s)
    {
        int l = s.length();
        int m=l/2;
        for(int i=0;i<m;i++)
            if(s.charAt(i)!=s.charAt(l-1-i))
                return false;
        return true;
    }
    void process()
    {
        int count=0;
        s = s.substring(0,s.length()-1);
        Scanner sc = new Scanner(s);
        while(sc.hasNext())
        {
            String word = sc.next();
            if(isPalindrome(word))
            {
                System.out.print(word + " ");
                count++;
            }
        }
        System.out.println("\nNumber of Palindromic words: " + count);
            
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();
        CountPalindrome ob = new CountPalindrome(s);
        if(!ob.isValid())
            System.out.println("INVALID INPUT");
        else
            ob.process();
    }
}