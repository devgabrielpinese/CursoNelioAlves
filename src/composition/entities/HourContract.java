package composition.entities;

import java.util.Date;

public class HourContract {
    //atributos do objeto
    private Date date;
    private Double valuePerHour;
    private Integer Hours;

    public HourContract() {
    }
    //construtor com os atributos
    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        Hours = hours;
    }

    //geters e seters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return Hours;
    }

    public void setHours(Integer hours) {
        Hours = hours;
    }

    //metodo que vai retornar horas vezes valorporHoras
    public Double totalValue(){
        return valuePerHour * (double)Hours;
    }
}
