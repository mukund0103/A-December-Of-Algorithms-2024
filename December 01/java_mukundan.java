import java.io.*;
import java.util.*;
class java_mukundan{
    public static void main(String args[])
    {
        int n,missing_no ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no.of participants:");
        n = s.nextInt();
        missing_no = n;
        int showedUp[] = new int[n-1];
        System.out.println("Enter the showed up participants:");
        for(int i = 0;i<n-1;i++)
        {
            showedUp[i] = s.nextInt();

        }
        Arrays.sort(showedUp);


        
        
         
        for(int i = 1;i<n;i++)
        {
            
            
                if(i!=showedUp[i-1])
                {
                    missing_no = i;
                    break;
                }
            
        }
        System.out.println("The missing number is " + missing_no);
    }
}
