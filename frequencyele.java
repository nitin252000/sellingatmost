import java.util.Scanner;
public class frequencyele {
    public static void amin(String[] arsg)
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int [] a=new int[l];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int [] freq=new int[a.length];
        for(int e:a)
        {
            freq[e]++;
        }
        for(int i=0;i<freq.length;i++){
        if(freq[i]>0)
        {
            System.out.println(freq[i]);
        }
    }
}}
