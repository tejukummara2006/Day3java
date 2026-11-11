class User{
    void name(){
        System.out.println("Function 1");
    }
}
class User1 extends User{
    void name(){
        System.out.println("Function 2 ");
    }
}
class Runtime {
    public static void main(String[] args){
        User us=new User();
        us.name();
        User1 us1=new User1();
        us1.name();
    }
}
