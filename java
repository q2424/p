QUESTION 01:


// You are using Java
import java.util.*;
import java.text.*;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        double be=sc.nextDouble();
        double te=sc.nextDouble();
        double fe=sc.nextDouble();
        double le=sc.nextDouble();
        DecimalFormat dc=new DecimalFormat("0.00");
        double tot=be+te+fe+le;
        double bep=(be*100)/tot;
        double tep=(te*100)/tot;
        double fep=(fe*100)/tot;
        double lep=(le*100)/tot;
       
        System.out.println("Total expenses :Rs."+dc.format(tot));
        System.out.println("Branding expenses percentage : "+dc.format(bep)+"%");
        System.out.println("Travel expenses percentage : "+dc.format(tep)+"%");
        System.out.println("Food expenses percentage : "+dc.format(fep)+"%");
        System.out.println("Logistics expenses percentage : "+dc.format(lep)+"%");
    }
}



------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------
QUESTION 02:


// You are using Java
import java.util.*;
import java.text.*;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int hf=sc.nextInt();
        int sf=sc.nextInt();
        int spf=sc.nextInt();
        int grade=0;
        if(hf>50 && sf>60 && spf>100)
            grade=10;
        else if(hf>50 && sf>60)
            grade=9;
        else if(sf>60 && spf>100)
            grade=8;
        else if(hf>50 && spf>100)
            grade=7;
        else if(hf>50 || sf>60 || spf>100)
            grade=6;
        else
            grade=5;
        System.out.println(grade);    
    }
}

-----------------------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------------------------------
QUESTION 03:

// You are using Java
import java.util.*;
import java.text.*;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int a=no;
        int sum=0;
        while(a>0)
        {
            int n=a%10;
            int fac=1;
            for(int i=1;i<=n;i++)
            {
                fac*=i;
            }
            sum+=fac;
            a/=10;
        }
        if(sum==no)
        {
            System.out.println(no+" Strong Number");
        }
        else
            System.out.println(no+" Not Strong Number");
    }
}

--------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------
QUESTION 04:

// You are using Java
import java.util.*;
import java.text.*;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        double sq=Math.pow(no,2);
        int kk=(int)sq;
        int sum=0;
        while(kk>0)
        {
            sum+=kk%10;
            kk/=10;
        }
        if(no>=20)
            System.out.println("Invalid");
        else if(sum==no)
            System.out.println(no+" :Neon Number");
        else
            System.out.println(no+" :Not Neon Number");
    }
}

--------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------
QUESTION 05:


// You are using Java
import java.util.*;
import java.text.*;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.println("Invalid");
            return;
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<0)
            {
                System.out.println("Invalid");
                return;
            }
        }
        int min=99999;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println(min+" "+max);
       
    }
}

--------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------
QUESTION 06:

// You are using Java
import java.util.*;
import java.text.*;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int arr[][]=new int[n][r];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<r;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<r;j++)
            {
                sum+=arr[i][j];
            }
            System.out.println("Sum of the row "+i+" = "+sum);
        }
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<r;j++)
            {
                sum+=arr[j][i];
            }
            System.out.println("Sum of the column "+i+" = "+sum);
        }
       
    }
}

--------------------------------------------------------------------------------------------------------------------------------------
QUESTION 07:

// You are using Java
import java.util.*;
class rep
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int n=a.length();
        int count=0;
        for(int i=0;i<n-2;i++)
        {
            if(a.charAt(i)!=a.charAt(i+2))
            {
                count=5;
                break;
            }
        }
        if(count==5)
        System.out.print("No");
        else
        System.out.print("Yes");
    }
}

--------------------------------------------------------------------------------------------------------------------------------------
QUESTION 08:


// You are using Java
import java.util.*;
import java.text.*;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int min=99999;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println(min);
       
    }
}

----------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------
QUESTION 09:


import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b<=a)
        {
            System.out.println("End year must be greater than the first year!");
        }
        else
        {
            for (int i=a;i<=b;i++)
            {
                int d = isLeapYear(i) ? 366 : 365;
                System.out.println("Year: " + i + " = " + d);
            }
        }
    }
    private static boolean isLeapYear(int year)
    {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}


----------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------
QUESTION 10:



// You are using Java
import java.util.*;
import java.text.*;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringTokenizer st=new StringTokenizer(str);
        System.out.println("Tokens:");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}

------------------------------------------------------------------------------------------------------------------------------------------
