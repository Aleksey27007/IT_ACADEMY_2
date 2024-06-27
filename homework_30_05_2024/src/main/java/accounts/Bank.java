package accounts;

import accounts.accounts.Account;
import accounts.accounts.client_account.Client;
import java.util.HashMap;
import java.util.UUID;

public class Bank {
  private HashMap<UUID, Client> bankLib;

  public Bank() {
    this.bankLib = new HashMap<>();
  }

  public void createAnAccount(Client client) {
    this.bankLib.put(client.getId(), client);
  }

  public double calculateAccountsSum(Client client) {
    double sum = 0;
    for (int i = 0; i < client.getAccountList().size(); i++) {
      sum += bankLib.get(client.getId()).getAccountList().get(i).getBalance();
    }
    return sum;
  }

  public void printAccount(Client client) {
    if (bankLib.containsKey(client.getId())) {
      System.out.println(bankLib.get(client.getId()));
    } else {
      System.out.println("Client does not exist.");
    }
  }

  public void blockAccount(Client client, Account account) {
    if (bankLib.containsKey(client.getId())) {

      for (int i = 0; i < bankLib.get(client.getId()).getAccountList().size(); i++) {

        if (bankLib.get(client.getId()).getAccountList().get(i).getId().equals(account.getId())) {

          bankLib.get(client.getId()).getAccountList().get(i).setStatus(false);

          bankLib.get(client.getId()).getAccountList().set( i, bankLib.get(client.getId()).getAccountList().get(i).blockClientAccount(account));

        }
      }
    }
  }

  public void unlockAccount(Client client, Account account) {
    int i = bankLib.get(client.getId()).getAccountList().indexOf(null);
    if (i >= 0) {
      bankLib.get(client.getId()).getAccountList().set( i, account);
      bankLib.get(client.getId()).getAccountList().get(i).setStatus(true);
    }
    System.out.println("Account unlocked.");
  }

  @Override
  public String toString() {
    return "Bank{" +
        "bankLib=" + bankLib;
  }
}
