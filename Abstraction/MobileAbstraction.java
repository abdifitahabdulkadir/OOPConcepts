package Abstraction;

import java.util.ArrayList;

import javax.management.modelmbean.ModelMBeanInfoSupport;

// interfcae for complete abstraction
interface Mobile {
  public void call(String number);

  public void sendMessaage(String message);

}

// apple implemented
class Apple implements Mobile {

  // my own adding information
  private ArrayList<String> contacts = new ArrayList<>();

  public void addContact(String number) {
    contacts.add(number);

  }

  @Override
  public void call(String number) {
    System.out.println("Calling......ringing " + number);
  }

  @Override
  public void sendMessaage(String message) {
    System.out.println(message);
  }

}

abstract class MobileAbstractionExample {

  public abstract void call(String number);

  public abstract void sendMessage(String message);

  private ArrayList<String> contact = new ArrayList<>();

  public void addNumber(String number) {
    contact.add(number);
    System.out.println("Has added successfully");
  }

}

class Sumsung extends MobileAbstractionExample {

  @Override
  public void call(String number) {
    System.out.println("calling....." + number);
  }

  @Override
  public void sendMessage(String message) {
    System.out.println(message);
  }

}

public class MobileAbstraction {

  public static void main(String[] args) {
    Apple applePhone = new Apple();

    applePhone.call("3838838382882");
    applePhone.sendMessaage("Hi, how are bro liipan");

    // uusing abstract calsses as abstraction
    System.out.println("------------------using Abstract-----------");
    Sumsung sumsung = new Sumsung();
    sumsung.call("8848488484");
    sumsung.sendMessage("64663636636");

  }

}
