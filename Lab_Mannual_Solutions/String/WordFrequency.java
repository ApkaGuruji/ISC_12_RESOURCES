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

class WordFrequency
{
    int n;
    String s;
    WordFrequency(int n)
    {
        this.n = n;
    }
    boolean isValid()
    {
        if(n>=1 && n<=4)
            return true;
        else
            return false;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentences: ");
        s = sc.nextLine();
    }
    void process()
    {
        int count=0;
        Scanner sc = new Scanner(s);
        while(sc.hasNext())
        {
            String word = sc.next();
            int wl = word.length();
            char lc = word.charAt(wl-1);
            if(lc == '?' || lc == '.')
                word = word.substring(0,wl-1);
            count++;
        }
        System.out.println("Total number of words: " + count);
        String words[] = new String[count];
        int freq[] = new int[count];
        sc = new Scanner(s);
        int count2=0;
        while(sc.hasNext())
        {
            String word = sc.next();
            int wl = word.length();
            char lc = word.charAt(wl-1);
            if(lc == '?' || lc == '.'||lc == ',')
                word = word.substring(0,wl-1);
            int j;
            for(j=0;j<count2;j++)
            {
                if(words[j].equals(word))
                {
                    freq[j]++;
                    break;
                }
            }
            if(j == count2)
            {
                words[count2]=word;
                freq[count2++] = 1;
            }
        }
        
        for(int i=1;i<count2;i++)
        {
            for(int j=0;j<count2-i;j++)
            {
                if(freq[j]>freq[j+1])
                {
                    String ts = words[j];
                    words[j]= words[j+1];
                    words[j+1]=ts;
                    
                    int ti = freq[j];
                    freq[j] = freq[j+1];
                    freq[j+1] = ti;
                }
            }
        }
        System.out.printf("%-15s%-15s\n","Word","Frequency");
        for(int j=0;j<count2;j++)
        {
            System.out.printf("%-15s%-15d\n",words[j],freq[j]);
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of sentences: ");
        int n = Integer.parseInt(sc.nextLine());
        WordFrequency ob = new WordFrequency(n);
        if(!ob.isValid())
            System.out.println("INVALID INPUT");
        else
        {
            ob.input();
            ob.process();
        }
    }
}