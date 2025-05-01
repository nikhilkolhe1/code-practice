
 class Calculator{

    int a;
    public int add(int n1, int n2)
    {
        System.out.println("hello method is created");
        int r = n1+ n2;
        return r;
    }
     
}

public class dm11_object_class {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        Calculator calc = new Calculator();
         
        int result = calc.add(num1, num2);
        System.out.println(result);

        // int result = num1 + num2;
        // System.out.println(result);
    }
}
