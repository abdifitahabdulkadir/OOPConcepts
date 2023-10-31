package Abstraction;

interface Animal {

  public void move();

  public void walk();

  public void sleep();

  public void eat();

  public static void printAnimalName(String name) {
    System.out.println(name);
  }

  default void printIdea() {
    System.out.println("Interface is showing or specifying the common requiremtns ");
  }

}

class Cat implements Animal {

  @Override
  public void move() {
    System.out.println("I am cat kitty, I have moved byby");
  }

  @Override
  public void walk() {
    System.out.println(" iam walking like meowww");
  }

  @Override
  public void sleep() {
    System.out.println("I am sleeping as meow");
  }

  @Override
  public void eat() {
    System.out.println("I am eating food as meow meow");
  }

}

public class ExampleInterface {

  public static void main(String[] args) {

    Cat cat = new Cat();
    cat.printIdea();
    cat.move();
    cat.sleep();
    cat.eat();

    Animal.printAnimalName("Cat");

  }

}
