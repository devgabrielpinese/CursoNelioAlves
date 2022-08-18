package secao14.herancaePolimorfismo.aula166e167exercicio;

public class PessoaJuridica extends Contribuinte {
    private Integer numFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String name, Double rendaAnual, Integer numFUncionarios) {
        super(name, rendaAnual);
        this.numFuncionarios = numFUncionarios;
    }

    public Integer getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(Integer numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public double imposto() {
        double valor = 0;
        double funcionarios = 0;
        if (getNumFuncionarios() > 10) {
            valor += getRendaAnual() * 0.14;
        } else {
            valor += getRendaAnual() * 0.16;
        }

        return valor ;
    }
}
