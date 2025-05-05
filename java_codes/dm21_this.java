
class Student{
    private int age;
    private String name;


    public Student()
    {
        System.out.println("in ctor");
        this.name="niks";
        this.age= 20;
    }

    public Student(int a, String s)
    {
       age=a;
       name=s;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    // public void setAge(int a)
    // {
    //    age = a;
    // }
    // public int getAge()
    // {
    //     return age;
    // }

    // public void setName(String s)
    // {
    //     name = s;
    // }
   
    // public String getName()
    // {
    //     return name;
    // }

    

}


public class dm21_this {
    
    public static void main(String[] args) {
        Student getData= new Student();
        Student obj = new Student(50, "pravin");

        System.out.println(getData.getName() + ": " + getData.getAge()) ;
        System.out.println(obj.getName() + ": " + obj.getAge()) ;

    //    getData.setAge(30);
    //     int age = getData.getAge();
    //     System.out.println(age);

    //     getData.setName("Pravin");
    //    String s= getData.getName();
    //     System.out.println(s);
        
    }
}
