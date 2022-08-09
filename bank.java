// Name :- Sumit Sawant 
// Date :- 8/8/2022
import java.util.Scanner;
public class bank{
    // create()   -> To Create New Account
    // withdraw() -> To Withdraw Cash 
    // deposit()  -> To deposit cash

    // Main() code 
    public static void main(String arg[]){
        // For taking Inputs 
        int w=0,z=0 ;
        double c = 1,d=1;

       while (w<1){
        Scanner obj=new Scanner(System.in);
        System.out.println("\n\n\nEnter What Type Of Transaction You Want to Proceed \n");
        System.out.println("1: Create Account \n2) Deposit Cash \n3) Withdraw Cash\n4) Compute Yearly Interest\n5) Display Balance \n6) Exit");
        System.out.println("Enter Your Choice :");
        int f= obj.nextInt(); 
        switch(f){
            case 1 :
                // For Creating New Account 
                     System.out.println("************************************************");
                    String a = obj.nextLine();
                    System.out.println("Enter Your Name :");
                    String g = obj.nextLine();
                    System.out.println("Enter Rate Of Interest :");
                    d = obj.nextDouble();
                    System.out.println("Enter Your Account Number :");
                    double a1 = obj.nextDouble();
                    System.out.println("Enter Your Initial Balance :");
                    c = obj.nextDouble();
                    // For creating an Account
                    z=1;
                    break;
                    

           case 2 :
                if(z==1)
                {
                    // For Depositing Cash
                double x1 = deposit();
                double x =  x1 + c;
                c =x;
                System.out.println("You Deposited : "+x1);
                System.out.println("Your Total Balance is "+x);
                }
                else 
                System.out.println("You need To create an account");

                break;
            case 3 :
            if(z==1){
                // For Withdraw cash
                 double x2 = withdraw();
                double x3 = c - x2;
                 c =x3;
                if(x3<0){
                System.out.println("Insufficient Balance");
                break;
                }
                System.out.println("You Withdraw: "+x2);
                System.out.println("Your Total Balance is "+x3);
                }
                else 
                System.out.println("You need To create an account"); 
                break;
            case 4 :
                if(z==1)
                {
                double v = c * d / 100;
                System.out.println(" Your Yearly Interest is "+v);
                }
                else{
                    System.out.println("You need To create an account");
                }
                break;
            case 5 :
                if(z==1){
                System.out.println("Your Total Balance is "+c);
                }
                else
                System.out.println("You need To create an account");
                break;
            case 6 :
                w=1;
                break;
            default :
                System.out.println("Your Entered a Wrong Choice") ;   
        }
         
       }
    }
    
    // Withdraw()
    public static double withdraw(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The Amount You Want to Withdraw :");
        double b =obj.nextDouble(); 
       return b;
    }
    // Withdraw End

    // Deposit()
    public static double deposit(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The Amount You Want to Deposit :");
        double b =obj.nextDouble(); 
       return b;
    } 
    // Deposit() End
    
}