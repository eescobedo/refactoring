public class BankAccount
{

    public BankAccount (int accountAge, int creditScore, AccountInterest accountInterest)
    {
      AccountAge = accountAge;
      CreditScore = creditScore;
      AccountInterest = accountInterest;
    }

    @Getter @Setter
    public int AccountAge;

    @Getter @Setter
    public int CreditScore;

    @Getter @Setter
    public int AccountInterest;


    public double CalculateInterestRate ()
    {
        if (CreditScore > 800)
          return 0.02;

        if (AccountAge > 10)
          return 0.03;

        return 0.05;
    }
}

public class AccountInterest
{
    @Getter @Setter
    public BankAccount Account;

    public AccountInterest (BankAccount account)
    {
      Account = account;
    }

    public function InterestRate ()
    {
      return Account.CalculateInterestRate();
    }

    public function IntroductoryRate ()
    {
      return Account.CalculateInterestRate() < 0.05;
    }
}
