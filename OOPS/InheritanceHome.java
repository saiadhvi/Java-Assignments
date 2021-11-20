package OOPS;

public class InheritanceHome
 {

    int lightcount=0;
    InheritanceHome()
    {
        this.lightcount=20;
    }

    public  void noOfLights()
    {
        System.out.println("Number of Lights in House is "+lightcount);
    }
}

class Room1 extends InheritanceHome
{
    Room1(int noLights)
    {
        this.lightcount=noLights;
    }

    @Override
    public  void noOfLights()
    {
        System.out.println("Number of Lights in Room1 is "+lightcount);
    }

}

class Room2 extends InheritanceHome
{
    Room2(int noLights)
    {
        this.lightcount=noLights;
    }

    @Override
    public  void noOfLights()
    {
        System.out.println("Number of Lights in Room2 is " + lightcount);
    }

}

class ApplicationHouse {
    public static void main(String[] args) {

        InheritanceHome Home = new InheritanceHome();
        Home.noOfLights();
        Room1 r1 = new Room1(10);
        r1.noOfLights();
        Room2 r2 = new Room2(5);
        r2.noOfLights();
    }
}