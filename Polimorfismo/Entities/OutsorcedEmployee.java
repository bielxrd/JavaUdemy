package Polimorfismo.Entities;

public class OutsorcedEmployee extends Employee {
    private Double additionalCharge;


    public OutsorcedEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
        super(name, hours, valuePerHours);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        this.additionalCharge = (additionalCharge / 100) * 110;
        System.out.println(getAdditionalCharge());
        return getValuePerHours() * getHours() + additionalCharge;
    }
}
