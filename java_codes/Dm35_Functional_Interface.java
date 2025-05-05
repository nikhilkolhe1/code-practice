@FunctionalInterface
interface A 
{
    void show();
}
public class Dm35_Functional_Interface {
    public static void main(String[] args) {
        A obj = ()->{
            int a = 20;
            int b =30;
            int c = a +b;
            System.out.println(c);
            System.out.println("hey in show");
        };     
        obj.show();
    }
}
