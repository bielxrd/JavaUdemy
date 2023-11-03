package Composicao.Exercicio.Entities;

import Composicao.Exercicio.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;

    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
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

    public void addContract(HourContract hourContract) {
        contracts.add(hourContract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(int year, int month) {
        double sum = 0;
        Calendar cal = Calendar.getInstance();
        for (HourContract item : contracts) {
            cal.setTime(item.getDate());
            int calYear = cal.get(Calendar.YEAR);
            int calMonth = 1 + cal.get(Calendar.MONTH);

            if (year == calYear && month == calMonth) {
                sum += item.totalValue();
            }
        }
        return sum;
    }

}
