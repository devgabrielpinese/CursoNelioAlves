package secao13Enumeracao.aula150e151.entities;

import secao13Enumeracao.aula150e151.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    //atributos
    private  String name;
    //atributo que é um enum da classe WorkLevel
    private WorkerLevel level;
    private Double baseSalary;

    //atributo que é um objeto da classe Department
    private Department department;
    //atributo que é uma Lits, uma lista da contratos. que ja instanciamos como ArrayList
    private List<HourContract> contracts = new ArrayList<>();

    //construtor vazio
    public Worker() {
    }
    //construtor com atributos String name, WorkerLevel level que é da classe WorkerLevel, Double baseSalary, Department department
    //que é um objeto da classe Department.
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }
    //get e seters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    //metodo para add contrato na list
    public void addContract (HourContract contracts){
        this.contracts.add(contracts);
    }

    //metodo para remover contrato da list
    public void removeContract (HourContract contracts){
        this.contracts.remove(contracts);
    }

    //metodo para percorrer e verificar determinado contrastos e somar o valor da basesalary com o valor totalde cada um
    //metodo tem dois parametros de verificacao ano e mes
    public  double income(int year , int month){
        //variavel soma que recebe o baseSalary
        double sum=baseSalary;
        //vai puxar um valor tipo Calendar
        Calendar cal = Calendar.getInstance();
        //um for para percorrer a lista de contratos
        for (HourContract c :contracts) {
            // vai setar o valor da data com o que puxar do cconrato c com o get ( c.getDate)
            cal.setTime(c.getDate());
            //uma variavel que recebe o valor cal.get (Calendar.year) vai puxar um valor tipo Calendar e usar somente o ano
            int c_year = cal.get(Calendar.YEAR);
            //uma variavel que recebe o valor cal.get (Calendar.month) vai puxar um valor tipo Calendar e usar somente o mes
            int c_month = cal.get(Calendar.MONTH);
            //vai verificar se mes e ano que foram usados como parametro sao iguais ao mes e ano que foi puxado
            if (month ==c_month&& year == c_year){
                //a soma recebe ela mesma mais o valorTotal desse contrato (lembarndo que ele esta num loop e toda que a verificacao
                // for true vai adicionar o valor desse contrato)
                sum+= c.totalValue();
            }
        }
        //retorna essa soma
        return sum;
    }

}
