import java.util.Scanner;
public class bank{
    public static void main(String arg[]){
        // For taking Inputs 
        System.out.print("Enter Your Name : ");
        Scanner obj=new Scanner(System.in);
        String a = obj.nextLine();
        System.out.print("Enter Your Adderess : ");
        String e  = obj.nextLine();
         System.out.print("Enter Your Account Number : ");
        long b = obj.nextLong();
         System.out.print("Enter Your Initial Balance : ");
        double c = obj.nextDouble();
         System.out.print("Enter Your Rate Of Interest : ");
        int d = obj.nextInt();

        
        int w=0;
       while (w<1){
        System.out.println("\n\n\nEnter What Type Of Transaction You Want to Proceed \n");
        System.out.println("1: Create Account \n2) Deposit Cash \n3) Withdraw Cash\n4) Compute Yearly Interest\n5) Display Balance \n6) Exit");
        System.out.println("Enter Your Choice :");
        int f= obj.nextInt(); 
        switch(f){
            case 1 : 
            break ;
            case 2 :
                double x1 = deposit();
                double x =  x1 + c;
                c=x;
                System.out.println("You Deposited : "+x1);
                System.out.println("Your Total Balance is "+x);
                break;
            case 3 :
                 double x2 = withdraw();
                double x3 = c - x2;
                 c=x3;
                if(x3<0){
                System.out.println("Insufficient Balance");
                break;
                }
                System.out.println("You Withdraw: "+x2);
                System.out.println("Your Total Balance is "+x3);
                break;
            case 4 :
                double v = c * d / 100;
                System.out.println(" Your Yearly Interest is "+v);
                break;
            case 5 :
                System.out.println("Your Total Balance is "+c);
                break;
            case 6 :
                w=1;
                break;
            default :
                System.out.println("Your Entered a Wrong Choice") ;   
        }
         
       }
    }
    public static double create(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The Amount You Want to Withdraw :");
        double b =obj.nextDouble(); 
       return b;
    }
    public static double withdraw(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The Amount You Want to Withdraw :");
        double b =obj.nextDouble(); 
       return b;
    }
    public static double deposit(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The Amount You Want to Deposit :");
        double b =obj.nextDouble(); 
       return b;
    }
    
}