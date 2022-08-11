package heranca.exemplos.ex01.entities;

public class SavingAccount extends Account {
    //com anotacoes
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

    //metodo sobreescritoda classe account
    @Override// boa pratica colocar o @Override sempre que sobrepor
    public void withdraw(Double amount){
        balance=balance- amount;
    }
}
