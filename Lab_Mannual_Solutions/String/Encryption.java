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

class Encryption
{
    String s;
    Encryption(String s)
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
    void process()
    {
        s = s.substring(0,s.length()-1);
        StringTokenizer st = new StringTokenizer(s);
        int wordCount = st.countTokens();
        String words[] = new String[wordCount];
        int potentials[] = new int[wordCount];
        int n = 0;
        while(st.hasMoreTokens())
        {
            String word = st.nextToken();
            int potential = 0;
            for(int i=0;i<word.length();i++)
            {
                potential += (int)(word.charAt(i)-64);
            }
            System.out.println(word + " = " + potential);
            words[n]= word;
            potentials[n++] = potential;
            int i;
            for(i=n-1;i>0 && potentials[i-1]>potentials[i];i--)
            {
                int p = potentials[i];
                potentials[i]=potentials[i-1];
                potentials[i-1]=p;

                String w = words[i];
                words[i] = words[i-1];
                words[i-1] = w;
            }
            
        }
        
        for(int i = 0;i<wordCount;i++)
        {
            System.out.print(words[i] + " ");
        }

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();
        Encryption ob = new Encryption(s);
        if(!ob.isValid())
            System.out.println("INVALID INPUT");
        else
            ob.process();
    }
}