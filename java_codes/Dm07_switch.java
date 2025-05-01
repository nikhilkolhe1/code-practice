import java.util.Scanner;

public class Dm07_switch
{
    public static void main(String[] args) 
    {
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();

        // switch (x) 
        // {
        //     case 1:
        //         System.out.println("January");
        //         break;
        //     case 2:
        //         System.out.println("February");
        //         break;
        //     default:
        //         System.out.println("All OK");
        //         break;
        // }
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the value");
//         int x = sc.nextInt();
//         switch(x)
//         {
//             case 1:
//             System.out.println("jan");
//             break;
//             case 2:
//             System.out.println("feb");
//             break;

//         }

String day = "Tuesday";
System.out.println(System.getProperty("java.version"));
switch(day)
{

    case "wednesday", "monday":


    System.out.println("ok");
    break;
  case "Tuesday": 
     System.err.println("alarm at 10");
     break;

  case "Friday":
  System.out.println("hey");

  break;


  default:
  System.out.println("not ok");

}


    }
}