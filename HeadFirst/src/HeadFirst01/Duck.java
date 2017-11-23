package HeadFirst01;

import HeadFirst01.FlyBehevaior.FlyBehavior;
import HeadFirst01.QuackBehavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void perfromQuack(){
        quackBehavior.quack();
    }

    public abstract void display();

    public void swim(){
        System.out.println("All ducks float,even decoys");
    }
}
