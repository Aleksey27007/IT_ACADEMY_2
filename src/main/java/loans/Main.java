package loans;

import loans.bank_lib.Bank;
import loans.client_pac.Client;
import loans.loan.Loan;

public class Main {
  /*
  * Кредиты. Сформировать набор предложений клиенту по целевым кредитам различных банков для оптимального выбора.
  * Учитывать возможность досрочного погашения кредита и\или увеличения кредитной линии. Реализовать выбор и поиск кредита.
   */
  public static void main(String[] args) {
    Bank bank = new Bank();

    bank.getLoans();
    bank.printLoans();

    Client client = new Client(25000, 10, 6);

    /** finding a loan suitable for the client **/
    bank.printASuitableLoan(client);

    bank.giveALoan(client, bank.getLoans().get(3)); // 3 bankName: BELARUSBANK, maxLoanBalance: 70000.0, percentPerYear: 9.5, years: 5.0
    System.out.println("For client");
    for (Loan loan:client.getClientLoans()) {
      System.out.println(loan);
    }



    bank.giveALoan(client, bank.getLoans().get(6)); // bankName: PRIORBANK, maxLoanBalance: 70000.0, percentPerYear: 8.5, years: 5.0

    System.out.println("For client");
    for (Loan loan:client.getClientLoans()) {
      System.out.println(loan);
    }

    client.closeTheLoan("BELARUSBANK", 70000);
    System.out.println("For client");
    for (Loan loan:client.getClientLoans()) {
      System.out.println(loan);
    }

  }
}
