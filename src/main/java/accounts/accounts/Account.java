package accounts.accounts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Account{
  private UUID id;
  private double balance;
  private boolean status;
  private HashMap<Integer, Account> blockedAccount;
  private Integer blockedCount;


  public Account(UUID id, double balance) {
    this.status = true;
    this.id = id;
    this.balance = balance;
    this.blockedAccount = new HashMap<>();
    this.blockedCount = 0;
  }

  public Account blockClientAccount(Account account) {
    if (!account.isStatus()) {
      blockedAccount.put(blockedCount, account);
      System.out.println(blockedCount + "Blocked");
    }
    return null;
  }

  public HashMap<Integer, Account> getBlockedAccount() {
    return blockedAccount;
  }

  public void setBlockedAccount(
      HashMap<Integer, Account> blockedAccount) {
    this.blockedAccount = blockedAccount;
  }

  public Integer getBlockedCount() {
    return blockedCount;
  }

  public void setBlockedCount(Integer blockedCount) {
    this.blockedCount = blockedCount;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Account id: " + id +
        ", balance: " + balance +
        ", status: " + status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Account)) {
      return false;
    }
    Account account = (Account) o;
    return Double.compare(account.getBalance(), getBalance()) == 0
        && isStatus() == account.isStatus() && getId().equals(account.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getBalance(), isStatus());
  }
}
