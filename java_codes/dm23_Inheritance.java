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




public class dm23_Inheritance 
{
    public static void main(String[] args) {
        Advcalc obj = new Advcalc();
        int r1=obj.add(48, 400);
        int r2 = obj.sub(40, 30);
        int r3 = obj.multiply(20, 30);
        int r4 = obj.division(20,30);

        System.out.println(r1 + " " + r2+ " " + r3 + " " + r4);
    }
}
