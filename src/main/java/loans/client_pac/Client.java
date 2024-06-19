package loans.client_pac;

import java.util.ArrayList;
import java.util.List;
import loans.loan.Loan;

public class Client {
  private List<Loan> clientLoans;
  private double maxLoanBalance;
  private double percentPerYear;
  private double years;

  public Client(double maxLoanBalance, double percentPerYear, double years) {
    this.clientLoans = new ArrayList<>();
    this.maxLoanBalance = maxLoanBalance;
    this.percentPerYear = percentPerYear;
    this.years = years;
  }

  public void closeTheLoan(String bankName, double amount) {
    for (int i = 0; i < clientLoans.size(); i++) {
      if (bankName.equals(clientLoans.get(i).getBankName())) {
        if (amount == clientLoans.get(i).getMaxLoanBalance()) {
          clientLoans.remove(i);
        } else {
          System.out.println("The amount is not suitable");
        }
      } else {
        System.out.println("No such name.");
      }
    }
  }

  public List<Loan> getClientLoans() {
    return clientLoans;
  }

  public void setClientLoans(List<Loan> clientLoans) {
    this.clientLoans = clientLoans;
  }

  public double getMaxLoanBalance() {
    return maxLoanBalance;
  }

  public void setMaxLoanBalance(double maxLoanBalance) {
    this.maxLoanBalance = maxLoanBalance;
  }

  public double getPercentPerYear() {
    return percentPerYear;
  }

  public void setPercentPerYear(double percentPerYear) {
    this.percentPerYear = percentPerYear;
  }

  public double getYears() {
    return years;
  }

  public void setYears(double years) {
    this.years = years;
  }
}
