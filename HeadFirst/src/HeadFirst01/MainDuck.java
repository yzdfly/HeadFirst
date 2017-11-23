package HeadFirst01;

import HeadFirst01.QuackBehavior.MuteQuack;
import HeadFirst01.QuackBehavior.QuackBehavior;

public class MainDuck {
    public static void main(String[] args){
        MallardDuck mallardDuck = new MallardDuck();
        QuackBehavior quackBehavior = new MuteQuack();
        mallardDuck.performFly();
        mallardDuck.perfromQuack();
        mallardDuck.display();
        System.out.println("========");
        mallardDuck.setQuackBehavior(quackBehavior);
        mallardDuck.perfromQuack();
    }
}
