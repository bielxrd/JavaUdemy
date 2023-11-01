package Entities;

import java.time.LocalDate;

import enums.OrderStatus;

public class Pedido {
    private Integer id;
    private LocalDate moment;
    private OrderStatus status;

    public Pedido() {

    }

    public Pedido(Integer id, LocalDate moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", moment=" + moment + ", status=" + status + "]";
    }

}
