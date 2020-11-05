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

class AlphabeticOrder
{
    String s;
    AlphabeticOrder(String s)
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
            count++;
        }
        
        String words[] = new String[count];
        sc = new Scanner(s);
        int i=0;
        while(sc.hasNext())
        {
            words[i++]=sc.next();
        }
        
        for(i=1;i<words.length;i++)
        {
            for(int j=0;j<words.length-i;j++)
            {
                if(words[j].compareTo(words[j+1])>0)
                {
                    String t = words[j];
                    words[j] = words[j+1];
                    words[j+1] = t;
                }
            }
        }
        
        System.out.println("Length: " + words.length);
        System.out.println("Rearranged Sentence: ");
        for(i=0;i<words.length;i++)
            System.out.print(words[i] + " ");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();
        AlphabeticOrder ob = new AlphabeticOrder(s);
        if(!ob.isValid())
            System.out.println("INVALID INPUT");
        else
            ob.process();
    }
}