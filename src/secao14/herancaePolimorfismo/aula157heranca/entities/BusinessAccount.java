package secao14.herancaePolimorfismo.aula157heranca.entities;

public class BusinessAccount extends Account {
    //com anotacoes

    private Double loanLImit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLImit) {
        super(number, holder, balance);
        this.loanLImit = loanLImit;
    }

    public Double getLoanLImit() {
        return loanLImit;
    }

    public void setLoanLImit(Double loanLImit) {
        this.loanLImit = loanLImit;
    }

    public void loan( double amount){
        if (amount<= loanLImit){
            deposit(amount);
        }
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance-=2.0;
    }
}
