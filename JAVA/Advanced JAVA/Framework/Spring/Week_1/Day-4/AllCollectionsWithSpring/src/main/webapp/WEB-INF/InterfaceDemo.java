package Bean;
interface A{
    private void sum(int a,int b){
        int sum=0;
        sum=a+b;
        System.out.println("sum is " + sum);
    }
    abstract void mul(int a,int b);

     default void sub(int a, int b){
        int sub=0;
        sub=a-b;
        System.out.println("sub is: "+ sub);
        sum(a,b);
    }
    default void div(int a,int b){
        int div=0;
        div=a/b;
        System.out.println("div is :" + div);
    }
}
public class InterfaceDemo implements A {
    public static void main(String[] args) {
        InterfaceDemo interfaceDemo =new InterfaceDemo();
        interfaceDemo.div(2,1);
        interfaceDemo.sub(10,4);
        interfaceDemo.mul(2,4);
    }

    @Override
    public void mul(int a, int b) {
        int mult=0;
        mult=a*b;
        System.out.println("mult is: "+ mult);
    }

    @Override
    public void div(int a, int b) {
        A.super.div(a, b);
    }
}
