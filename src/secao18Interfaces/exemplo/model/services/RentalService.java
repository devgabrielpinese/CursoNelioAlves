package secao18Interfaces.exemplo.model.services;

import secao18Interfaces.exemplo.model.entities.CarRental;
import secao18Interfaces.exemplo.model.entities.Invoice;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }



    public void processInvoice(CarRental carRental) {
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        double hours = (double) (t2 - t1) / 1000 / 60 / 60;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = Math.ceil(hours) * pricePerHour;
            System.out.println("total de horas: "+ hours);
        } else {
            basicPayment = Math.ceil(hours / 24) * pricePerDay;
            System.out.println("total de dias: "+ hours/60);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

}
