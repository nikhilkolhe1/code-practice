package dm33_Inheritance;

public class dm01_Inheritance {
    public static void main(String[] args) {
        Advcalc obj = new Advcalc();
        int r1=obj.add(48, 400);
        int r2 = obj.sub(40, 30);
        int r3 = obj.multiply(20, 30);
        int r4 = obj.division(20,30);

        System.out.println(r1 + " " + r2+ " " + r3 + " " + r4);
    }
}
