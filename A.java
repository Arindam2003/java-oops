public class A{
    public static void main(String[] args) {
        System.out.println("Arindam");
        A a1=new A();
        B b1=a1.new B();
        b1.set(5,10);
        
    }
    public class  B{
        int i,j;
        void set(int x,int y)
        {
            i=x;
            j=y;
        }
        void display()
        {
            System.out.printf("%d %d",);
        }
    }
}