package heranca.exemplos.polimorfismo.exercicio.ex02.intities;

public class ImportedProduct extends Product {
    private Double custonsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double custonsFee) {
        super(name, price);
        this.custonsFee = custonsFee;
    }

    public Double getCustonsFee() {
        return custonsFee;
    }

    public void setCustonsFee(Double custonsFee) {
        this.custonsFee = custonsFee;
    }

    @Override
    public final String priceTag() {
        return getName() + " $ " + String.format("%.2f", getPrice() + custonsFee) + " ( Custons Fee: $ " + custonsFee + ")";
    }
}
