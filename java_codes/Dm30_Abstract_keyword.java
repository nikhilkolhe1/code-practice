
 abstract class Car 
{
    public abstract void drive();

    public void playMusic()
    {
        System.out.println("Music is playling");
    }
}


class WagonR extends Car 
{
    public void drive() 
    {
        System.out.println("driving");
    }

}

public class Dm30_Abstract_keyword {
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();

    }
}
