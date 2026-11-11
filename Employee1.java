import java.util.Scanner;
class General{
    private int empid;
    String name;
    double salary;

    void getter(){
        System.out.println(empid);
        System.out.println(name);
        System.out.println(salary);
    }

    void setter(int i,String s,double n){
        empid=i;
        name=s;
        salary=n;
    }
}
class Employee1 {
       public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       General g=new General();
       System.out.println("Enter a employee id:");
       int i=sc.nextInt();
       System.out.println("Enter a employee name:");
       String s=sc.next();
       System.out.println("Enter a salary:");
       double n=sc.nextInt();
       g.setter(i,s,n);
       g.getter();
       }
}
