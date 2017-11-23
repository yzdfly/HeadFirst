package HeadFirst01;

import HeadFirst01.FlyBehevaior.FlyWithWings;
import HeadFirst01.QuackBehavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
