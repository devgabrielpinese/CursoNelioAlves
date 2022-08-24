package secao18Interfaces.exemplo.model.services;

public class BrazilTaxService {
    public double tax (double amount  ) {
        if (amount <= 100){
            return amount*.02;
        }
        else {
            return amount*.15;

        }
    }
}
