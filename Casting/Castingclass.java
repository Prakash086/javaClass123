package Casting;

public class Castingclass {
    public void wideningCasting(){
        int myInt = 5;
        double myDouble = myInt;
        System.out.println(myDouble);

    }
    public void narrowCasting(){
        double myDouble = 3.14d;
        int myInt = (int)myDouble;
        System.out.println(myInt);
    }
}
