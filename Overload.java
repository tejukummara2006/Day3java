class Person{
    void salary(int a){
        System.out.println("Function 1");
    }

    void salary(){
        System.out.println("Function 2");
    }

    void salary(int a, int b){
        System.out.println("Function 3");
    }

    void salary(double a){
        System.out.println("Function 4");
    }
}
class Overload{
    public static void main(String[] args){
    Person p=new Person();
    p.salary(20000);
    p.salary(25.000);
    p.salary(20000,30000);
    p.salary();
   }
}
