
class Calc{

    public int add(int a, int b)
    {
       return a+b;
    }
    public int sub(int a, int b)
    {
       return a-b;
    }
}



class Advcalc extends Calc
{
    public int  multiply(int a, int b)
    {
        return a*b;
    }
    public int division(int a, int b){
        return a/b;
    }
}


class VeryAdvCalc extends Advcalc
{
    public double power(int a, int b){
        return Math.pow(a, b);
    }
}

public class dm24_multilevelInheritance 
{
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1=obj.add(48, 400);
        int r2 = obj.sub(40, 30);
        int r3 = obj.multiply(20, 30);
        int r4 = obj.division(20,30);
        double r5= obj.power(20,30);

        System.out.println(r1 + " " + r2+ " " + r3 + " " + r4 + " " + r5);
    }
}
