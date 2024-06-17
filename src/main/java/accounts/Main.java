package accounts;

import accounts.accounts.Account;
import accounts.accounts.client_account.Client;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public class Main {
  /*
  * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки\разблокировки счета.
  * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
  * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
   */
  public static void main(String[] args) {
    Bank bank = new Bank();

    Client clientAleksey = new Client("Aleksey");

    bank.createAnAccount(clientAleksey);
    bank.printAccount(clientAleksey);

    clientAleksey.setBalance(new Account(UUID.randomUUID(), 2000));
    clientAleksey.setBalance(new Account(UUID.randomUUID(), 0));
    clientAleksey.setBalance(new Account(UUID.randomUUID(), 300));
    clientAleksey.setBalance(new Account(UUID.randomUUID(), 560));

    bank.printAccount(clientAleksey);
    Account blockedAccount = clientAleksey.getAccountList().get(0);

    bank.blockAccount(clientAleksey, blockedAccount);

    bank.printAccount(clientAleksey);

    bank.unlockAccount(clientAleksey, blockedAccount);

    bank.printAccount(clientAleksey);

    clientAleksey.sort();

    bank.printAccount(clientAleksey);

    List<Account> selectedAccount = clientAleksey.findAccountByID(blockedAccount.getId());
    for (Account account:selectedAccount) {
      System.out.println(account);
    }

    System.out.println(bank.calculateAccountsSum(clientAleksey));

  }
}
