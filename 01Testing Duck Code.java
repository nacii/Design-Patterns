public abstract class Duck {
     FlyBehavior flyBehavior;
     QuackBehavior quackBehavior;
     public Duck() { }
     public abstract void display();
     public void performFly() {
     flyBehavior.fly();
     }
     public void performQuack() {
     quackBehavior.quack();
     } 
     public void swim() {
     System.out.println("All ducks float, even decoys!");
     }
}

public interface FlyBehavior {
    public void fly();
}

public class FlyWithWings implements FlyBehavior { 
     public void fly() {
    System.out.println("I'm flying!!");
 }
}

public class FlyNoWay implements FlyBehavior {
     public void fly() {
     System.out.println("I can't fly");
 }
}
