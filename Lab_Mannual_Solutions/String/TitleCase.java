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

class TitleCase
{
    String s;
    TitleCase(String s)
    {
        this.s = s;
    }
    boolean isValid()
    {
        char ch = s.charAt(s.length()-1);
        if(ch=='.'||ch=='?')
            return true;
        return false;
    }
    boolean isVowel(char ch)
    {
        String vowels="aeiou";
        ch = Character.toLowerCase(ch);
        for(int i=0;i<vowels.length();i++)
            if(ch == vowels.charAt(i))
                return true;
        return false;
    }
    void process()
    {
        char terminator = s.charAt(s.length()-1);
        s = s.substring(0,s.length()-1);
        Scanner sc;
        String result = "";
        sc = new Scanner(s);
        while(sc.hasNext())
        {
            String word = sc.next();
            word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            result += word + " ";
        }
        System.out.println(result.substring(0,result.length()-1)+terminator);
        System.out.printf("\n%-15s%-15s%-15s\n","Word","Vowels","Consonants");
        sc = new Scanner(s);
        while(sc.hasNext())
        {
            String word = sc.next();
            int v=0,c=0;
            for(int i=0;i<word.length();i++)
            {
                if(isVowel(word.charAt(i)))
                    v++;
                else
                    c++;
            }
            System.out.printf("%-15s%-15d%-15d\n",word,v,c);
        }
            
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();
        TitleCase ob = new TitleCase(s);
        if(!ob.isValid())
            System.out.println("INVALID INPUT");
        else
            ob.process();
    }
}