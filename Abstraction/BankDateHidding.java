package Abstraction;

class BanAccount {
  private double balance = 20000;
  private String password = "Abdifitah";
  private String name = "Abdifitah1";

  public double getBalance(String name, String password) {
    if (this.name.equals(name) && this.password.equals(password)) {
      return this.balance;
    }
    System.err.println("YOu password Or name is wrong");
    return -1;
  }
}

public class BankDateHidding {

  public static void main(String[] args) {
    BanAccount banAccount = new BanAccount();
    var result = banAccount.getBalance("Abdifitah1", "Abdifitah");

    System.out.println(result);

  }

}