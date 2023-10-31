package Encapsulation;

class Account {
  private double balance = 3939939;

  // change balance
  public void setBalance(double balance) {
    this.balance = balance;
  }

  // get balanace
  public double getBalance() {
    return this.balance;
  }
}

public class AccountManage {

  public static void main(String[] args) {
    Account account = new Account();
    account.setBalance(3883);
    System.out.println("Balnace is " + account.getBalance());
  }

}
