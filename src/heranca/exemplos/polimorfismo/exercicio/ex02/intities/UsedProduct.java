package heranca.exemplos.polimorfismo.exercicio.ex02.intities;

import java.text.SimpleDateFormat;
import java.util.Date;

import static heranca.exemplos.polimorfismo.exercicio.ex02.application.MainProduct.sdf;

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
