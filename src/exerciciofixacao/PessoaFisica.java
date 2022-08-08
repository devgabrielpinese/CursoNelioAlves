package exerciciofixacao;

public class PessoaFisica extends Contribuinte {

    private Double gastoSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastoSaude) {
        super(name, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double imposto() {
        double valor = 0;
        double saude = 0;
        if (getGastoSaude() > 0) {
            saude += getGastoSaude() * 0.5;
        }
        if (getRendaAnual() < 20000.0) {
            valor = getRendaAnual() * 0.15;
        } else if (getRendaAnual() >= 20000.0) {
            valor= getRendaAnual() *0.25;
        }
        return valor - saude;
    }
}
