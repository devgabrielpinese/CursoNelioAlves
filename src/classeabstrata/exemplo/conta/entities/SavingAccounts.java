package classeabstrata.exemplo.conta.entities;

public class SavingAccounts extends Accounts {
    private Double interestRate;

    public SavingAccounts() {
        super();
    }

    public SavingAccounts(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updatedBalence() {
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(Double amount) {
        balance -= amount;
    }
}
