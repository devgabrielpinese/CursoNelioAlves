package heranca.exemplos.polimorfismo.exercicio.ex01.entities;

public class OutsourceEmployee extends Employee {
    private Double addtionalCharge;

    public OutsourceEmployee() {

    }

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double addtionalCharge) {
        super(name, hours, valuePerHour);
        this.addtionalCharge = addtionalCharge;
    }

    public Double getAddtionalCharge() {
        return addtionalCharge;
    }

    public void setAddtionalCharge(Double addtionalCharge) {
        this.addtionalCharge = addtionalCharge;
    }

    @Override
    public Double paymenT() {
        return super.paymenT() + addtionalCharge * 1.1;
    }
}
