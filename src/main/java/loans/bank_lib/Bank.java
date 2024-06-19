package loans.bank_lib;

import java.util.ArrayList;
import java.util.List;
import loans.client_pac.Client;
import loans.loan.Loan;
import loans.loan.LoanEnum;

public class Bank {

  private List<Loan> loans;

  public Bank() {
    this.loans = new ArrayList<>();
  }

  private List<Loan> findASuitableLoan(Client client) {
    List<Loan> list = new ArrayList<>();
    for (int i = 0; i < loans.size(); i++) {
      if (!this.loans.isEmpty()) {
        if (client.getMaxLoanBalance() <= loans.get(i).getMaxLoanBalance()
            && client.getPercentPerYear() >= loans.get(i).getPercentPerYear()
            && client.getYears() >= loans.get(i).getYears()) {
          list.add(loans.get(i));
        }
      } else {
        System.out.println("null list");
        break;
      }
    }
    if (list.isEmpty()) {
      System.out.println("no suitable loans");
    }
    return list;
  }

  public void printASuitableLoan(Client client) {
    List<Loan> loanListForClient = findASuitableLoan(client);
    System.out.println("For client: ");
    for (Loan loan: loanListForClient) {
      System.out.println(loan);
    }
  }

  public void giveALoan(Client client, Loan loan) {
    client.getClientLoans().add(loan);
  }

  public List<Loan> getLoanListAlfaBank() {
    return new ArrayList<>(List.of(LoanEnum.ALFA_BANK.getList()));
  }

  public List<Loan> getLoanListBelarusbank() {
    return new ArrayList<>(List.of(LoanEnum.BELARUSBANK.getList()));
  }

  public List<Loan> getLoanListPriorbank() {
    return new ArrayList<>(List.of(LoanEnum.PRIORBANK.getList()));
  }

  public List<Loan> getLoans() {
    loans.addAll(getLoanListAlfaBank());
    loans.addAll(getLoanListBelarusbank());
    loans.addAll(getLoanListPriorbank());
    return loans;
  }

  public void printLoans() {
    for (Loan loan : loans) {
      System.out.println(loan);
    }
  }
}
