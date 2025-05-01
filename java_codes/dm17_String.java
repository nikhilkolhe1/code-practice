public class dm17_String {
    public static void main(String[] args) {
        
    //     String name = new String("niks");
    //    int h = name.hashCode();
    //    System.out.println(h);
    //     System.out.println(name);
    //     System.out.println(name.charAt(3));
    //     System.out.println( name.concat(" sachin"));

       
        String n1 = "niks";
        System.out.println(System.identityHashCode(n1));
        String n="niks";
        System.out.println(System.identityHashCode(n));

        String n2 = "niks"+n1;
        System.out.println(System.identityHashCode(n2));
        String h=(n2+" hey");
        System.out.println(System.identityHashCode(h));

        System.out.println(h);




    }
    
}
