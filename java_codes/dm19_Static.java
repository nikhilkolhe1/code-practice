class Mobile {
    static String Brand;
    String network;
    int price;

static{
      String Brand = "Apple";
}
    public Mobile(){
        String network ="";
        int price=0;
        
         System.out.println("constructor called");
    }
    public  void show(){

     System.out.println("Brand: " + Brand + "   price: " + price);
        System.out.println("Here is my brand");
    }
    public static void show1(Mobile obj){
        System.out.println("hey I am Staic Method   "+ obj.price);

    }
}




public class dm19_Static {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.Brand="aaple";
        obj.price=2000;



        Mobile obj1 = new Mobile();
        Mobile.Brand="aaple";
        obj1.price=2000; 

        Mobile obj2 = new Mobile();
        obj2.Brand="aaple";
        obj2.price=2000;


        obj.Brand= "Oneplus";
        obj.Brand= "Samsung";

      obj.show();
      obj1.show();


      Mobile.show1(obj);
        System.out.println();
    }
}
