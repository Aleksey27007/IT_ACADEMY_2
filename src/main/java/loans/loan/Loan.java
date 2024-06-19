package loans.loan;

public class Loan {
  private String bankName;
  private double maxLoanBalance;
  private double percentPerYear;
  private double years;

  public Loan(String bankName, double loanBalance, double percentPerYear, double years) {
    this.bankName = bankName;
    this.maxLoanBalance = loanBalance;
    this.percentPerYear = percentPerYear;
    this.years = years;
  }

  @Override
  public String toString() {
    return "bankName: " + bankName +
        ", maxLoanBalance: " + maxLoanBalance +
        ", percentPerYear: " + percentPerYear +
        ", years: " + years;
  }

  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
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
