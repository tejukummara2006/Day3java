import java.util.Scanner;
class  Account{
    int amount=0;
    void deposit(int amount){
        System.out.println(amount);
    }
    void deposit(double amount){
        System.out.println(amount);
    }
    void deposit(int amount,String description){
        System.out.println(amount);
        System.out.println(description);
    }

}
class Bankaccount{
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Account ac=new Account();
        System.out.println("enter the  deposit amount");
        int a=sc.nextInt();
        System.out.println("enter the  description");
        sc.nextLine();
        String description=sc.nextLine();
        double b=a;
        ac.deposit(a);
        ac.deposit(b);
        ac.deposit(a,description );
    }
}
    

