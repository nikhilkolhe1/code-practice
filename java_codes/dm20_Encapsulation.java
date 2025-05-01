
class Student{
    private int age;
    private String name;



    public void setAge(int a)
    {
       age = a;
    }
    public int getAge()
    {
        return age;
    }

    public void setName(String s)
    {
        name = s;
    }
   
    public String getName()
    {
        return name;
    }

}







public class dm20_Encapsulation {
    
    public static void main(String[] args) {
        Student getData= new Student();
       getData.setAge(30);
        int age = getData.getAge();
        System.out.println(age);

        getData.setName("Pravin");
       String s= getData.getName();
        System.out.println(s);
        
    }
}
