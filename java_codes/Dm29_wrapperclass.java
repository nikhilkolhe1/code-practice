public class Dm29_wrapperclass {
    

    public static void main(String[] args) {
        
        int num =8;
        Integer num1 = num; //boxing
        System.out.println(num1);


        Integer num2 = num1.intValue();
        System.out.println(num2);


        String str = "24";
        int num4= Integer.parseInt(str);
        System.out.println(num4*(4));
    }
}

