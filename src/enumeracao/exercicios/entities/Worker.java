package enumeracao.exercicios.entities;

import java.util.ArrayList;
import java.util.List;

import enumeracao.exercicios.entities.enums.WorkLevel;

public class Worker {
    
    private String name;
    private WorkLevel level;
    private Double baseSalary;

    private List<HourContract> contracts = new ArrayList<>();
    private Department department;

    public Worker() {
    }

    public Worker(String name, WorkLevel level, Double baseSalary,
            Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getLevel() {
        return level;
    }

    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(Integer year, Integer month) {
        double sum = this.baseSalary;
        for (HourContract c: contracts) {
            Integer c_year = c.getDate().getYear();
            Integer c_month = c.getDate().getMonthValue();
            if (year.equals(c_year) && month.equals(c_month)) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
