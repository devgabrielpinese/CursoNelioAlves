package heranca.exemplos.ex01.entities;

public class SavingAccount extends Account{
    private Double interesRate;

    public SavingAccount() {
        super();
    }

    public SavingAccount(Integer number, String holder, Double balance, Double interesRate) {
        super(number, holder, balance);
        this.interesRate = interesRate;
    }

    public Double getInteresRate() {
        return interesRate;
    }

    public void setInteresRate(Double interesRate) {
        this.interesRate = interesRate;
    }

    public void updatedBalence(){
        balance+= balance *interesRate;
    }

    @Override
    public void withdraw(Double amount){
        balance-= amount;
    }
}
