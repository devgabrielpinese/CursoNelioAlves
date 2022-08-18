package secao14.herancaePolimorfismo.aula163ExercicoFixacao.intities;

import java.util.Date;

import static secao14.herancaePolimorfismo.aula163ExercicoFixacao.application.MainProduct.sdf;

public class UsedProduct extends Product {
    //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProduct() {

    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return getName() + " (used) $ " + String.format("%.2f", getPrice()) + " (manufacture date: " + sdf.format(manufactureDate) + ")";
    }
}
