package accounts.accounts.client_account;

import accounts.accounts.Account;
import flowershop.Flower;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Client{
  private String name;
  private List<Account> accountList;
  private UUID id;


  public Client(String name) {
    this.name = name;
    this.accountList = new ArrayList<>();
    this.id = UUID.randomUUID();
  }

  public List<Account> findAccountByID(UUID id) {
    List<Account> selectedAccount = new ArrayList<>();
    for (int i = 0; i < accountList.size(); i++) {
      if (id.equals(accountList.get(i).getId())) {
        selectedAccount.add(accountList.get(i));
      }
    }
    return selectedAccount;
  }

  public void setBalance(Account account) {
    this.accountList.add(account);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Account> getAccountList() {
    return accountList;
  }

  public void setAccountList(List<Account> accountList) {
    this.accountList = accountList;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  @Override
  public String toString() {
    return "Client name " + name +
        ", id: " + id +
        ", accountList: " + accountList
        ;
  }

  public void sort() {
    Collections.sort(this.accountList, new Comparator<Account>() {
      @Override
      public int compare(Account o1, Account o2) {
        return (int)(o1.getBalance() - o2.getBalance());
      }
    });
  }
}
