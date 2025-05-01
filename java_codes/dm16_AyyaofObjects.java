



class Student{
    int id;
    String name;
    String address;
}
public class dm16_AyyaofObjects {
    public static void main(String[] args) {


        Student s1= new Student();
        s1.id=20;
        s1.name="niks";
        s1.address="bella Street";

        Student s2= new Student();
        s2.id=20;
        s2.name="niks";
        s2.address="bella Street";

        Student s3= new Student();
        s3.id=20;
        s3.name="niks";
        s3.address="bella Street";


        Student[] num = new Student[3];
        num[0]= s1;
        num[1]= s2;
        num[2]=s3;

        for (int i =0; i<num.length;i++)
        {
            System.out.println(num[i].id + num[i].name);
        }


        // int[] num1 = new int[4];

        // num1[0]= 5;
        // num1[1]= 5;
        // num1[2]= 5;


        // for (int i =0; i<num1.length; i++)
        // {
        //     System.out.println(num1[i]);
        // }


    }
}
