class Arithmetic
{
    int a=4,b=2;
    int sum,sub,mul,div,mod;
    void performArithmetic()
    {
        sum=a+b;
        sub=a-b;
        mul=a*b;
        div=a/b;
        mod=a%b;

    }
    void display()
    {
        System.out.println("sum : "+sum);
        System.out.println("sub : "+sub);
        System.out.println("mul : "+mul);
        System.out.println("div : "+div);
        System.out.println("mod : "+mod);
    }
    public static void main(String[] args) {
        Arithmetic op=new Arithmetic();
        op.performArithmetic();
        op.display();
    }
} 