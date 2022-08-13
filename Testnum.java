// Name :- Sumit Sawant 
// Date :- 8/8/2022
import java.util.Scanner;

public class Testnum{
    public static void main(String args[]){
        //factorial(): To Find Factorial of any Number
        // TeArm()   : To Cheack If The Number Is Armstrong
        //Prime()    : To Check If the Number is prime or not
        //TePali()   : To Check If the number is  palindrome
        // fibo()    : To Check If the Number is in fibonacci Series
        Scanner obj=new Scanner(System.in);
        int e=1;

        System.out.print("Enter an Number : ");
        int i = obj.nextInt();
        
        while (e==1)
        {
            System.out.print("1) Factorial \n2) Test Armstrong\n3) Test Palindrome");
            System.out.println("\n4) Test Prime \n5) Test Fibonacci Series\n6) Exit");

            System.out.print("****************************************************");
            System.out.println("\nEnter Your Choice : ");
            int i1 = obj.nextInt();
            switch(i1)
            {
                case 1: 
                    int i2 = factorial(i);
                    System.out.println("Factorial Of number is "+i2);
                    break;
                case 2:
                    int i3 = TeArm(i);
                    if(i3==0)
                        System.out.println("Number is Not Armstrong Number");
                    else
                        System.out.println("Number is  Armstrong Number");
                    break;
                case 3:
                    int i4 = TePali(i);
                    if(i4==0)
                        System.out.println("Number is Not Palindrome Number");
                    else
                        System.out.println("Number is Palindrome Number");
                     break;
                case 4:
                    int i5 = Prime(i);
                    if(i5==0)
                        System.out.println("Number is Not Prime Number");
                    else
                        System.out.println("Number is Prime Number");
                    break;
                case 5:
                    int i6 = fibo(i);
                    if(i6==0)
                        System.out.println("Number is Not Fibonacci Number");
                    else
                        System.out.println("Number is Fibonacci Number");
                    break;
                case 6:
                    e=0;
                    break ;
            }
        }
    }
    public static int factorial(int a){
        if(a==0)
            return 1;
        else
            return a*factorial(a-1);
    }
     public static int TeArm(int a){
        int sum=0,f,x=a;
        while(a>0)
        {
            f=a%10;
            sum=sum+(f*f*f);
            a=a/10;   
        }
        if(x==sum)
            return 1;
        else 
            return 0;
    }
    public static int TePali(int a){
        int rev=0,f,x=a;
        while(a>0)
        {
            f = a % 10;
            rev = rev * 10 + f;
            a=a/10;  
        }
        if(rev==x)
            return 1;
        else 
            return 0;
    }
    public static int Prime(int a){
        int i=1,count =0;
        
        while(i!=a + 1)
        {
          if(a % i == 0)
                count= count + 1;
                i++;
        }
        if(count==2)
            return 1;
        else 
            return 0;
    }
     public static int fibo(int a){
        int f=0,t=1,s=1;
        while(t<=a){
            t=f+s;
            if(t==a)
            {
                return 1;
            }
            f=s; // Swaping
            s=t;
        }
        return 0;
     }

}