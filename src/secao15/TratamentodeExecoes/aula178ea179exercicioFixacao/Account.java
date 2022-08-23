package secao15.TratamentodeExecoes.aula178ea179exercicioFixacao;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdramLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdramLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        validateWithdraw(amount);
        balance -= amount;
    }

    public void validateWithdraw(double amount) {
        if (amount > getWithdrawLimit()) {
            throw new DominianException("withdraw error: the amount exceeds withdraw limit");
        }
        if (amount > getBalance()) {
            throw new DominianException("withdraw error:  not enougt balance");
        }
    }

}