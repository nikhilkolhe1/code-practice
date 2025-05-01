class Computer{
    public void play(){
        System.out.println("play Music");
    }
    


    public String give_me_pen(int cost){
      if(cost>=12)
        return "Yes";
        return "Nothing";
    }
    public int shares(){
        return 0;
    }
    public int shares(int n1){
        return n1;
    }
    public double shares(double n1, int n2){
        return n1+n2;
    }
}

public class dm12_methods {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.play();
        String cost = obj.give_me_pen(20);
        System.out.println(cost);

        int r = obj.shares();
        int r1 = obj.shares(20);
        System.out.println(r1);
    }
}
