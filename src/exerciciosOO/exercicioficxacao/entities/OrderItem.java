package exerciciosOO.exercicioficxacao.entities;

public class OrderItem {
    private  Integer quantity;
    private  Double price;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public  double subTotal(){

        return price *quantity;
    }

    @Override
    public String toString() {

        return getProduct().getName()
                +", $"
                + String.format("%.2f", price)
                +", quantity: "
                +quantity
                +", subTotal: $"
                +String.format("%.2f",subTotal());
    }
}
